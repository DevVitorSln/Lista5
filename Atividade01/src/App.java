import java.util.Scanner;

public class App {

    static void ImprimirMatriz(int pNumeroInformadoUsuario) {

        int i, j;

        for (i = 1; i <= pNumeroInformadoUsuario; i++) 
        {
            for (j = 0; j < i; j++) {
                System.out.print(i + " ");
            }

            System.out.println(" ");
        }

    }

    public static void main(String[] args) throws Exception {
        
        int numeroInformadoUsuario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        numeroInformadoUsuario = scanner.nextInt();
        scanner.close();
     
        ImprimirMatriz(numeroInformadoUsuario);
    }
}
