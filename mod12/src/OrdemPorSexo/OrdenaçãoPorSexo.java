package OrdemPorSexo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrdenaçãoPorSexo {
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        String nome;

        System.out.println("Escreva os nomes e sexos separados por ,");
        nome = s.nextLine();
        String[] nome1 = nome.split(",");

        for(int i = 0; i < nome1.length; i++) {
            if (nome1[i].contains("M")){
                System.out.println("---HOMENS---");
                System.out.println(nome1[i]);
            }
            else{
                System.out.println("---MULHERES---");
                System.out.println(nome1[i]);
            }
        }
    }


    }



