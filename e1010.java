import java.io.IOException;
import java.util.Scanner;

public class e1010 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);

        int c1 = scan.nextInt();
        int q1 = scan.nextInt();
        double v1 = scan.nextDouble();
        double p1= q1*v1;

        int c2 = scan.nextInt();
        int q2 = scan.nextInt();
        double v2 = scan.nextDouble();
        double p2= q2*v2;

        double result= (p1+p2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);
        result = c1+c2;
        scan.close();
    }
}