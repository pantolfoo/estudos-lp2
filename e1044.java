import java.util.Scanner;

public class e1044{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();

        if (a % b == 0 || b % a == 0) {
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }
    }
}