import java.util.Scanner;

public class App {

    public static void ConverterHorario(int pHoras, int pMinutos)
    {
        if (pHoras > 12) 
        {
            pHoras = pHoras - 12;
            
            System.out.print(pHoras + ":" + pMinutos + " P.M ");
        } 
        else 
        {
            System.out.print(pHoras + ":" + pMinutos + " A.M ");
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int horas, minutos;

        System.out.print("Horas: ");
        horas = scanner.nextInt();
        
        System.out.print("Minutos: ");
        minutos = scanner.nextInt();

        ConverterHorario(horas, minutos);

        scanner.close();   
    }
}
