import java.util.Scanner;

public class App {

    public static int tantosnumeros(int numeroInformadoUsuario) 
    {
        String contDigitos = Integer.toString(numeroInformadoUsuario);
        return contDigitos.length();
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numeroInformadoUsuario;

        System.out.println("Informe o Nº: ");
        numeroInformadoUsuario = scanner.nextInt();

        scanner.close();

        System.out.println(tantosnumeros(numeroInformadoUsuario));

    }
}
