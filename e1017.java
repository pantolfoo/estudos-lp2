import java.io.IOException;
import java.util.Scanner;

public class e1017 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        
        int t_gasto = scan.nextInt();
        int v_media = scan.nextInt(); //velocidade em km/h
        scan.close();

        //quantidade de litros de combustível gastos em uma viagem
        //automóvel que faz 12 KM/L.

        double distancia = (t_gasto*v_media);

        double litros = (double) distancia/12;
        System.out.printf("%.3f\n", litros);

    }
}