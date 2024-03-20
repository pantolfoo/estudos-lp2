import java.io.IOException;
import java.util.Scanner;

public class e1020 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        
        int idade_dias = scan.nextInt();
        scan.close();

        int anos = idade_dias / 365;
        int meses = (idade_dias%365)/30;
        int dias = (idade_dias%365)%30;

        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)\n", dias);
    }
}
