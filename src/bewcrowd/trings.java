package bewcrowd;
import java.util.Scanner;

public class trings {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("digite uma frase:");
        String frase = sc.nextLine();
        String frasestr = new StringBuilder(frase).reverse().toString();
        if (frase.equalsIgnoreCase(frasestr)){
            System.out.println(frase + " é um palindromo");
        }else{
            System.out.println(frase + " nao é um palindromo");
        }


    }
}
