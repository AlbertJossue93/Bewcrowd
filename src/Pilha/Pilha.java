package Pilha;

import java.util.Scanner;

public class Pilha {
    public static void limparPilha(int[] pilha) {
        for(int i=0; i < pilha.length ; i++){
            pilha[i] = -1;
        }
    }

    public static void mostrarPilha(int[] pilha) {
        for(int i=0; i<pilha.length;i++){
            System.out.print("[" + pilha[i] + "] ");
        }
        System.out.println("");
    }

    public static void empilhar(int n, int[] pilha) {
        for(int i=0; i < pilha.length; i++){
            if(pilha[i] == -1) {
                pilha[i] = n;
                return;
            }
        }
        System.out.println("Pilha cheia.");
    }

    public static void desempilhar(int[] pilha) {
        if(pilha[0] == -1) {
            System.out.println("Pilha vazia");
            return;
        }

        for(int i=0; i < pilha.length; i++){

            if(pilha[i] == -1) {
                System.out.println("Número desempilhado: " + pilha[i-1]);
                pilha[i-1] = -1;
                return;
            }
        }
        System.out.println("Número desempilhado: " + pilha[pilha.length-1]);
        pilha[pilha.length-1] = -1;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] pilha = new int[5];
        limparPilha(pilha);

        System.out.println("Digite 1 para empilhar");
        System.out.println("Digite 2 para desempilhar");
        System.out.println("Digite 3 para mostrar a pilha.");
        System.out.println("Digite 0 (zero) para sair.");

        int comando = ler.nextInt();

        while (comando != 0) {
            switch (comando) {
                case 1:
                    System.out.println("Digite o número para empilhar");
                    int n = ler.nextInt();
                    empilhar(n, pilha);
                    mostrarPilha(pilha);
                    break;

                case 2:
                    desempilhar(pilha);
                    mostrarPilha(pilha);
                    break;

                case 3:
                    mostrarPilha(pilha);
                    break;


                default:
                    System.out.println("Comando invalido.");
                    break;
            }

            System.out.println("----------------------------------");
            System.out.println("Digite 1 para empilhar");
            System.out.println("Digite 2 para desempilhar");
            System.out.println("Digite 3 para mostrar a pilha.");
            System.out.println("Digite 0 (zero) para sair.");


            comando = ler.nextInt();
        }
    }
}
