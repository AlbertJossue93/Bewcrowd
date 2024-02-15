package bewcrowd;
import java.util.Scanner;

public class MatrizI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        while (true) {
            int numeroN = sc.nextInt();

            if (numeroN == 0) {
                break;
            }

            int[][] matriz = new int[numeroN][numeroN];

            for (int linha = 0; linha < numeroN; linha++) {
                for (int coluna = 0; coluna < numeroN; coluna++) {
                    int valor = Math.min(Math.min(linha, coluna),
                            Math.min(numeroN - linha - 1, numeroN - coluna - 1)) + 1;
                    matriz[linha][coluna] = valor;
                }
            }

            for (int linha = 0; linha < numeroN; linha++) {
                for (int coluna = 0; coluna < numeroN; coluna++) {
                    output.append(String.format("%3d", matriz[linha][coluna]));
                    if (coluna < numeroN - 1) {
                        output.append(" ");
                    }
                }
                output.append("\n");
            }

            output.append("\n");
        }

        System.out.print(output.toString());

    }
}
