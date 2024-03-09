import java.util.Scanner;
public class e1001{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        int x= (a+b);
        System.out.println("X = "+ x);
        scan.close();

    }
}