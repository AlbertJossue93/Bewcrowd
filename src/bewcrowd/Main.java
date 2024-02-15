package bewcrowd;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            // Cria um Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário que digite uma string
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();

            // Fecha o scanner para liberar recursos
            scanner.close();

            // a) O número de caracteres da string
            int numCaracteres = input.length();
            System.out.println("a) Número de caracteres da string: " + numCaracteres);

            // b) A string com todas suas letras em maiúsculo
            String maiuscula = input.toUpperCase();
            System.out.println("b) String em maiúsculas: " + maiuscula);

            // c) O número de vogais da string
            int numVogais = contarVogais(input);
            System.out.println("c) Número de vogais na string: " + numVogais);

            // d) Se a string digitada começa com "UNI" (ignorando maiúsculas/minúsculas)
            boolean comecaComUNI = input.toLowerCase().startsWith("uni");
            System.out.println("d) A string começa com 'UNI': " + comecaComUNI);

            // e) Se a string digitada termina com "RIO" (ignorando maiúsculas/minúsculas)
            boolean terminaComRIO = input.toLowerCase().endsWith("rio");
            System.out.println("e) A string termina com 'RIO': " + terminaComRIO);

            // f) O número de dígitos (0 a 9) na string
            int numDigitos = contarDigitos(input);
            System.out.println("f) Número de dígitos na string: " + numDigitos);

            // g) Se a string é um palíndromo ou não
            boolean palindromo = verificarPalindromo(input);
            System.out.println("g) A string é um palíndromo: " + palindromo);
        }

        // Função para contar vogais na string
        public static int contarVogais(String str) {
            int contador = 0;
            String vogais = "AEIOUaeiou";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (vogais.contains(String.valueOf(c))) {
                    contador++;
                }
            }
            return contador;
        }

        // Função para contar dígitos na string
        public static int contarDigitos(String str) {
            int contador = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    contador++;
                }
            }
            return contador;
        }

        // Função para verificar se a string é um palíndromo
        public static boolean verificarPalindromo(String str) {
            str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
            int esquerda = 0;
            int direita = str.length() - 1;
            while (esquerda < direita) {
                if (str.charAt(esquerda) != str.charAt(direita)) {
                    return false;
                }
                esquerda++;
                direita--;
            }
            return true;
        }
    }


