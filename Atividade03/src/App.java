import java.util.Scanner;

public class App {

    public static double SomaNumeros(double n1, double n2, double n3) {

        return n1 + n2 + n3;
    }
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3, totalSoma; 

        System.out.print("Informe o 1º: ");
        n1 = scanner.nextDouble();

        System.out.print("Informe o 2º: ");
        n2 = scanner.nextDouble();

        System.out.print("Informe o 3º: ");
        n3 = scanner.nextDouble();

        scanner.close();

        totalSoma = SomaNumeros(n1, n2, n3);

        System.out.println(totalSoma);
    }
}
