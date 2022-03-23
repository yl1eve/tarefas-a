package OrdemAlfabetica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ordemalfabetica {

    public static void main (String args[]) {

        Scanner s = new Scanner (System.in);
        System.out.println("Digite os nomes separados por , ");

        String resposta = s.next();
        String[] vetStr = resposta.split(",");
        List list = Arrays.asList(vetStr);
        Collections.sort(list);
        System.out.println(list);

    }
}
