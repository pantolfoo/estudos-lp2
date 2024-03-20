import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


public class e1036 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        scan.close();

        double delta = (b*b) - (4 * a * c);
        double raiz = Math.sqrt(delta);
        
        double raiz1= (-b+raiz)/(2*a);
        double raiz2= (-b-raiz)/(2*a);

        if(delta<=0 || a==0){
            System.out.println("Impossivel calcular");
        }
        else{
        System.out.printf("R1 = %.5f\n",raiz1);
        System.out.printf("R2 = %.5f\n",raiz2);
        }
    }
}