import java.io.IOException;
import java.util.Scanner;

public class e1008 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int vh = scan.nextInt();
        double ht = scan.nextDouble();

        double s = ht*vh;

        System.out.println("NUMBER = "+n);
        System.out.printf("SALARY = U$ %.2f", s);    
        scan.close();
    }
}