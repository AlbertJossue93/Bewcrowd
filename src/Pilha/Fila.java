package Pilha;
import java.util.Scanner;

public class Fila {
    public static void limparFila(int[] fila) {
        for (int i = 0; i < fila.length; i++) {
            fila[i] = -1;
        }
    }

    public static void mostrarFila(int[] fila) {
        for (int i = 0; i < fila.length; i++) {
            System.out.print("[" + fila[i] + "] ");
        }
        System.out.println("");
    }

    public static void enfileirar(int n, int[] fila) {
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] == -1) {
                fila[i] = n;
                return;
            }
        }
        System.out.println("Fila cheia.");
    }

    public static void desenfileirar(int[] fila) {
        if (fila[0] == -1) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.println("Número desenfileirado: " + fila[0]);

        for (int i = 0; i < fila.length - 1; i++) {
            fila[i] = fila[i + 1];
            if (fila[i + 1] == -1)
                return;
        }
        fila[fila.length - 1] = -1;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] fila = new int[5];
        limparFila(fila);

        System.out.println("----------------------------------");
        System.out.println("Digite 1 para enfileirar");
        System.out.println("Digite 2 para desenfileirar");
        System.out.println("Digite 3 para mostrar a fila.");
        System.out.println("Digite 0 (zero) para sair.");

        int comando = ler.nextInt();

        while (comando != 0) {
            switch (comando) {
                case 1:
                    System.out.println("Digite o número para enfileirar");
                    int n = ler.nextInt();
                    enfileirar(n, fila);
                    mostrarFila(fila);
                    break;

                case 2:
                    desenfileirar(fila);
                    mostrarFila(fila);
                    break;

                case 3:
                    mostrarFila(fila);
                    break;

                default:
                    System.out.println("Comando invalido.");
                    break;
            }

            System.out.println("----------------------------------");
            System.out.println("Digite 1 para enfileirar");
            System.out.println("Digite 2 para desenfileirar");
            System.out.println("Digite 3 para mostrar a fila.");
            System.out.println("Digite 0 (zero) para sair.");

            comando = ler.nextInt();
        }
    }
}
