import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    public static String embaralhaPalavra(List<String> embaralharpalavra, String palavraInformadaUsuario)
    {
        Collections.shuffle(embaralharpalavra);

        StringBuilder palavraEmbaralhada = new StringBuilder(palavraInformadaUsuario.length());

        palavraEmbaralhada.append("Palavra embaralhada: ");

        for (String a : embaralharpalavra) 
        {
            palavraEmbaralhada.append(a);
        }

        return palavraEmbaralhada.toString();
    }
    public static void main(String[] args) throws Exception 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();

        List<String> embaralhar = Arrays.asList(palavra.split(""));
        System.out.println(embaralhaPalavra(embaralhar, palavra));
        sc.close();
    }
}
