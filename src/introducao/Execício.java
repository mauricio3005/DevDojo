package introducao;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Execício {
    static void main() {
        String nome = "Nome";
        String endereco = "Endereço";
        double salario= 1433.0;
        LocalDate data = LocalDate.parse("2019-03-29");
        System.out.printf("Eu %s, morando no endereço %s,\nConfirmo que recebi o salário de %f.0, na data %S",nome,endereco,salario,data);
    }
}
