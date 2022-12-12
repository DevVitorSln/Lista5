import java.util.Scanner;

public class App {

     public static String mostraData(String data, String[] dataExtenso) {
        StringBuilder dataExtensoFormat = new StringBuilder();

        dataExtenso = data.split("/");

        for (int x = 0; x < 3; x++) 
        {

            if (x == 0) 
            {
                dataExtensoFormat.append(dataExtenso[x]);
                dataExtensoFormat.append(" de ");
            }

            if (x == 1) {
                if (dataExtenso[x].compareTo("01") == 0) 
                {
                    dataExtensoFormat.append("Janeiro");
                } 
                else if (dataExtenso[x].compareTo("02") == 0) 
                {
                    dataExtensoFormat.append("Fevereiro");
                } 
                else if (dataExtenso[x].compareTo("03") == 0) 
                {
                    dataExtensoFormat.append("Março");
                } 
                else if (dataExtenso[x].compareTo("04") == 0) 
                {
                    dataExtensoFormat.append("Abril");
                } 
                else if (dataExtenso[x].compareTo("05") == 0) 
                {
                    dataExtensoFormat.append("Maio");
                } 
                else if (dataExtenso[x].compareTo("06") == 0) 
                {
                    dataExtensoFormat.append("Junho");
                } 
                else if (dataExtenso[x].compareTo("07") == 0) 
                {
                    dataExtensoFormat.append("Julho");
                } 
                else if (dataExtenso[x].compareTo("08") == 0) 
                {
                    dataExtensoFormat.append("Agosto");
                } 
                else if (dataExtenso[x].compareTo("09") == 0) 
                {
                    dataExtensoFormat.append("Setembro");
                } 
                else if (dataExtenso[x].compareTo("10") == 0) 
                {
                    dataExtensoFormat.append("Outubro");
                } 
                else if (dataExtenso[x].compareTo("11") == 0) 
                {
                    dataExtensoFormat.append("Novembro");
                } 
                else if (dataExtenso[x].compareTo("12") == 0) 
                {
                    dataExtensoFormat.append("Dezembro");
                } 
                else 
                {
                    dataExtensoFormat.append(dataExtenso[x]);
                }

                dataExtensoFormat.append(" de ");
            }

            if (x == 2) 
            {
                dataExtensoFormat.append(dataExtenso[x]);
            }
        }

        return dataExtensoFormat.toString();

    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String[] dataExtenso = new String[3];
        String data = "";

        do {

            System.out.print("Informe a data no padrão dd/mm/aaaa: ");
            data = scanner.nextLine();

            if (data.length() != 10) 
            {
                System.out.println("ERRRO, Data Inválida!");
            }

        } while (data.length() != 10);

        scanner.close();

        System.out.println(mostraData(data, dataExtenso));

    }
}
