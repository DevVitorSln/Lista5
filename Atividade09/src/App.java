import java.util.Scanner;

public class App {

    public static int reverse(int numeroInformadoUsuario) 
    {
        String numeroTemporario = "" + numeroInformadoUsuario, numeroReverse = "";

        for (int a = numeroTemporario.length() - 1; a >= 0; a--) 
        {
            numeroReverse += numeroTemporario.charAt(a);
        }
        
        return Integer.parseInt(numeroReverse);
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numeroInformadoUsuario = 0;

        System.out.println("Informe o número: ");
        numeroInformadoUsuario = scanner.nextInt();

        System.out.println(reverse(numeroInformadoUsuario));
        
        scanner.close();

    }
}
