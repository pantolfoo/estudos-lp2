import java.util.Scanner;
public class e1007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a, b,c,d, diferenca;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        scan.close();
        
        diferenca= (a * b - c * d);
        System.out.printf("DIFERENCA = %d\n", diferenca);       
        
    }    
}