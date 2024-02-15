package bewcrowd;
import java.util.Scanner;

public class SentencaDancante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println("escreva linhas sentenças");
            String linha = sc.nextLine();
            String sentencadancante = transformasentenca(linha);
            System.out.println(sentencadancante);
        }
    }

    public static String transformasentenca(String sentenca) {
        StringBuilder sentencadancante = new StringBuilder();
        boolean Maiscula = true;
        for (char letra : sentenca.toCharArray()) {
            if (Character.isLetter(letra)) {
                if (Maiscula) {
                    sentencadancante.append(Character.toUpperCase(letra));
                } else {
                    sentencadancante.append(Character.toLowerCase(letra));
                }
                Maiscula = !Maiscula;
            } else {
                sentencadancante.append(letra);
            }
        }
        return sentencadancante.toString();
    }
}

