import java.util.Scanner;


public class e1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        double salarioFixo =scan.nextFloat();
        double vendasD =scan.nextFloat();
        scan.close();
    
        double comissao = vendasD*0.15;    
        
        double valorTotal= comissao + salarioFixo;
    
        System.out.printf("TOTAL = R$ %.2f\n", valorTotal);
        System.out.println(nome); /*só p parar de dar atenção*/
    }
}
