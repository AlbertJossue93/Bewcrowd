package bewcrowd;
import java.util.Scanner;

public class superior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char O;
        float resu = 0;
        double m[][] = new double[12][12];
        O = sc.next().charAt(0);
        for (int l = 0; l < 12; l++) {
            for (int c = 0; c < 12; c++) {
                m[l][c] = sc.nextDouble();

            }
        }
        for (int l = 0; l < 12; l++) {
            for (int c = 0; c < 12; c++) {
                if ( 12-l-1<c) {
                    resu += m[l][c];
                }
            }
        }
        if (O == 'M'){
            resu = resu/66;
        }
        System.out.println(String.format("%.1f%", resu));
            }
        }


