import java.io.IOException;
import java.util.Scanner;

 
public class e1005 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner (System.in);
        float a,b;
        double m;

         a = scan.nextFloat();
         b = scan.nextFloat();

         m = (a * 3.5 + b * 7.5) / 11.0;

         System.out.printf("MEDIA = %.5f\n", m );
         scan.close();

    }
}



