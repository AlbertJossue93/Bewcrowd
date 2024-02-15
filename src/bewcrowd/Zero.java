package bewcrowd;
import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (true) {
            int resultado = 0;
            String numeros = leitor.nextLine();
            String[] valor = numeros.split(" ");
             resultado = Integer.parseInt(valor[0]) + Integer.parseInt(valor[1]);
            if (resultado == 0){
               break;
             }
            System.out.println(String.valueOf(resultado).replaceAll("0", " "));
        }
        leitor.close();
    }
}

