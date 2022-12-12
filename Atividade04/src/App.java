import java.util.Scanner;

public class App {

    public static String VerificaEstadoNumero(double pNumeroInformadoUsuario) {

        String verificaEstado;

        if (pNumeroInformadoUsuario > 0) {
            
            verificaEstado = "P";            
        } 
        else
        {
            verificaEstado = "N";
        }

        return verificaEstado;
    }
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        double numeroInformadoUsuario;

        System.out.print("Informe o Nº: ");
        numeroInformadoUsuario= scanner.nextDouble();

        System.out.println(VerificaEstadoNumero(numeroInformadoUsuario));

        scanner.close();

    }
}
