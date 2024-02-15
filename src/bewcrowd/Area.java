package bewcrowd;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char O;
        double resultado=0;
        O = sc.next().charAt(0);
        double [][] M = new double[12][12];
        for (int l=0; l<12; l++){
            for (int c=0; c<12; c++){
                M[l][c] = sc.nextDouble();

            }
        }
        for (int l=0; l<12; l++){
            for (int c=0; c<12; c++){
                if (l < c && 12 - l - 1 < c){
                    resultado  +=M[l][c];
                }
            }
        }
        if ( O == 'M'){
            resultado =(float) resultado / 30;
        }
        System.out.println(String.format("%.1f",resultado) );


    }
}
