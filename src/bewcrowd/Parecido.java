package bewcrowd;
import java.util.Scanner;

public class Parecido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N = sc.nextByte();

        while (N != 0) {
            for (byte l = 1; l <= N; l++) {
                for (byte c = 1; c <= N; c++) {
                    byte x = (byte) Math.min(l, c);
                    x = (byte) Math.min(x, (byte) (N - l + 1));
                    x = (byte) Math.min(x, (byte) (N - c + 1));

                    System.out.printf("%3d", x);
                    if (c < N) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            }
            System.out.println();
            N = sc.nextByte();
        }
    }
}
