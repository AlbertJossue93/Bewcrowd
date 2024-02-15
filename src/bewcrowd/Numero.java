package bewcrowd;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomesDosDigitos = {
                "zero", "um", "dois", "três", "quatro",
                "cinco", "seis", "sete", "oito", "nove"};
        System.out.println("digite os numeros para armazenar a variavel numerico:");
        int n = sc.nextInt();
        String pr = Integer.toString(n);
        for (int i=0; i<pr.length(); i++){
            int digito = Character.getNumericValue(pr.charAt(i));
            String resultado = nomesDosDigitos[digito];
            System.out.println(resultado);

        }
    }
}
