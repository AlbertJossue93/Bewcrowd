package Pilha;
import java.io.PrintStream;
import java.util.Scanner;
public class FilaemJava {
    public static int [] Vetor = new int[6];
    static int tamanho = 6;
    static int FinalTamanho = 0;

    public static void mostrarFila(){
        for (int i=0; i<tamanho;i++){
            System.out.print("[" + Vetor[i] + "] ");
       }
        System.out.println("");

    }
    public static void enfileirar(int n){
        if (FinalTamanho < tamanho){
            Vetor[FinalTamanho] = n;
            FinalTamanho ++;
        }else{
            System.out.println("Fila está cheia");
        }
    }
    public static void desenfilerar(){
        if (Vetor[tamanho] != -1) {
            for (int i = 0; i < Vetor.length - 1; i++) {
                Vetor[i] = Vetor[i + 1];
            }
            Vetor[tamanho - 1] = 0;
            FinalTamanho--;
            System.out.println("Número desenfileirado: " + Vetor[tamanho]);
        } else {
            System.out.println("fila está vazia ");
            return;
        }

    }

    public static void main(String[] args) {
        System.out.println("---------\tFILAS DE NUMEROS\t--------------");

        System.out.println("");

        enfileirar(6);
        enfileirar(7);
        enfileirar(8);
        enfileirar(9);
        enfileirar(10);
        enfileirar(11);



        mostrarFila();

    }



}
