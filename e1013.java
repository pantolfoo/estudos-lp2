import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class e1013 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int result = Math.max(n1, Math.max(n2, n3));

        System.out.printf("%d eh o maior", result);
        scan.close();
    }
}