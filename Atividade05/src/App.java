import java.util.Scanner;

public class App {

    public static double somaImposto(double taxaImposto, double custo) {

        double porcentagem;

        porcentagem = taxaImposto / 100;

        return custo + custo * porcentagem;
    }
    
    public static void main(String[] args) throws Exception {

        double precoTotalImposto, taxaImposto, custoProduto;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        custoProduto = scanner.nextDouble();

        System.out.print("Informe a porcentagem de imposto: ");
        taxaImposto = scanner.nextDouble();

        scanner.close();

        precoTotalImposto = somaImposto(taxaImposto, custoProduto);

        System.out.println("O preço final do produto é: " + precoTotalImposto);
    }
}
