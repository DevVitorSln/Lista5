import java.util.Random;
import java.util.Scanner;

public class App {

    public static int jogodeCraps(int numeroInformadoUsuario) {

        Random nuemrosRandom = new Random();
        int n1 = 0, n2 = 0;

        n1 = nuemrosRandom.nextInt(6) + 1;
        n2 = nuemrosRandom.nextInt(6) + 1;

        return n1 + n2;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int dados = 2, numeroInformadoUsuario = 0, pontuacao = 0;

        boolean valida = true;

        do {

            System.out.println("[9] para jogar os dados na mesa");
            System.out.println("[0] para sair da mesa de jogo");
            numeroInformadoUsuario = scanner.nextInt();

            dados = jogodeCraps(numeroInformadoUsuario);

            if (numeroInformadoUsuario < 0 || numeroInformadoUsuario > 9) 
            {
                System.out.println("ERRO! !!!");
            } 
            else if (numeroInformadoUsuario == 9) 
            {
                System.out.println("Soma dos dados: " + dados);

                if (dados == 7 || dados == 11) 
                {
                    System.out.println("Vencedor");
                } 
                else if (dados == 2 || dados == 3 || dados == 12) 
                {
                    System.out.println("Perdedor");
                } 
                else if (dados == 4 || dados == 5 || dados == 6 || dados == 8|| dados == 9 || dados == 10) 
                {
                    if (valida) 
                    {
                        valida = false;

                        pontuacao = numeroInformadoUsuario;
                    } 
                    else if (pontuacao == numeroInformadoUsuario) 
                    {
                        System.out.println("Vencedor");
                    }
                }
            }

        } while (numeroInformadoUsuario != 0);

        System.out.println("Fim");

        scanner.close();
    }
}
