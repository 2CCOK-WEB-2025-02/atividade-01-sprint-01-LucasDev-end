package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        palavra = palavra.toLowerCase();
        String palindromo = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(palindromo)){
            return true;
        }else {
            return false;
        }
    }
}
