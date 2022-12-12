import java.util.Scanner;

public class App {

    public static double valorPagamento (double prestacao, double diasAtrasados) 
    {
        double valorPagar = 0, percentual, juros, multa;
        
        if (diasAtrasados > 0) 
        {
             percentual = 0.03;
             juros = 0.001;
             multa = prestacao + prestacao * percentual;
             valorPagar = multa + multa * juros * diasAtrasados;
        } 
        else 
        {
            return prestacao;
        }
        
        return valorPagar;

    }
    
    public static void main(String[] args) {

        int prestacoes = 0, diasAtrasados;
        double valorDia = 0, valorPrestacao, valorTotal;

        Scanner scanner = new Scanner(System.in);
        
        while (true) {

            System.out.print("Informe o valor da prestação: ");
            valorPrestacao = scanner.nextDouble();

            if (valorPrestacao == 0) {
                break;
            }

            System.out.print("Informe a quantidade de dias em atraso: ");
            diasAtrasados = scanner.nextInt();

            valorTotal = valorPagamento(valorPrestacao, diasAtrasados);

            System.out.println("O valor a ser pago será R$ " + String.format("%.2f", valorTotal));
            System.out.println("");

            prestacoes++;

            valorDia += valorTotal;
        }
    }
}