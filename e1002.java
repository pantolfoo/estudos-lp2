import java.io.IOException;
import java.util.Scanner;

 
public class e1002 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner (System.in);
        double PI =  3.14159;
        

        double raio = scan.nextDouble();

        System.out.printf("A=%.4f\n", PI*(raio*raio) );
        scan.close();
    }
}