package bewcrowd;
import java.util.Scanner;

public class Led {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // numero de caso de teste
        System.out.println("digite o numero de caso de teste:");
        int N = sc.nextInt();
        for (int i=0; i<N; i++){
            String valor = sc.next();
            int leds = countLeds(valor);
            System.out.println(leds + "leds");
        }
        sc.close();
    }
    public static  int countLeds ( String valor){
        int [] ledsdigi= {6,2,5,5,4,5,6,3,7,6};
        int totalLeds=0;
        for (int i=0; i<valor.length(); i++){
            int digit = Character.getNumericValue(valor.charAt(i));
            totalLeds += ledsdigi[digit];
        }
        return totalLeds;
    }



}

