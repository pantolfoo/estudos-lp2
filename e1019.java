import java.io.IOException;
import java.util.Scanner;

public class e1019 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        
        int N = scan.nextInt();
        scan.close();

        int H = N / 3600;
        N %= 3600;

        int M = N / 60;
        int S = N % 60;

        System.out.printf("%d:%d:%d%n", H, M, S);
    }
}
