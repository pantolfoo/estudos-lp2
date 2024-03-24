import java.util.Scanner;
public class e1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI =  3.14159;
        double raio = scan.nextDouble();
        scan.close();

        double volume =(4.0/3) * PI * (raio * raio * raio);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
