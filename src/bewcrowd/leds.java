package bewcrowd;
import java.util.Scanner;

public class leds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String valor = sc.next();
            int led = countleds(valor);
            System.out.println(led + " leds");
        }
        sc.close();
    }

    public static int countleds(String valor) {
        int[] ledsdigi = {6,2,5,5,4,5,6,3,7,6};
        int totaldeleds = 0;
        for (int i = 0; i < valor.length(); i++) {
            int digi = Character.getNumericValue(valor.charAt(i));
            totaldeleds += ledsdigi[digi];
        }
        return totaldeleds;
    }

  }

