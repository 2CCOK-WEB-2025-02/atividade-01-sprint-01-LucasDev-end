package school.sptech.sprint1_nota1.ex3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) throws JsonProcessingException {
        ExercicioDificilResponse resposta = new ExercicioDificilResponse();

        if (n <= 0){
            resposta.enesimoTermo = 0;
            resposta.soma = 0;
        }else {

            int anterior = 0;
            int atual = 1;
            resposta.soma = anterior + atual;

            if (n == 1) {
                resposta.enesimoTermo = 1;
                resposta.soma = 1;
            }else {

                for (int i = 2; i <= n; i++) {
                    int aux = anterior + atual;
                    resposta.soma += aux;
                    anterior = atual;
                    atual = aux;
                }
            }
            resposta.enesimoTermo = atual;
        }
        return resposta;
    }
}
