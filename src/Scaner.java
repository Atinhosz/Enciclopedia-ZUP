import java.util.Scanner;

public class Scaner {

    String texto = "Texto falso";

    Scanner sc = new Scanner(System.in);

    String mudarTexto(){
        String mudarTexto = sc.nextLine();
        this.texto = mudarTexto;
        return texto;
    }


}
