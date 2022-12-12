import java.util.Scanner;

public class App {

    static void ImprimirMatriz(int pNumeroInformadoUsuario) {
        
        int i=0, j=0;

        while (i<(pNumeroInformadoUsuario+1)){

            while (j<i){
                System.out.print((j+1) + " ");
                j=j+1;
            }

            System.out.println();
            
            j=0;
            i=i+1;
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
