package Aprovacaoaluno;

public class aprovacaoNotas {

    public static void main(String args[]) {
        double nota1 = 3.9;
        double nota2 = 4.7;
        double nota3 = 5.3;
        double nota4 = 9.1;

        double media = nota1 + nota2 + nota3 + nota4;
        double mediaTotal = media / 4;

        {
            if (mediaTotal >= 7) {
                System.out.println("Aluno aprovado");
            } else if (mediaTotal < 7) {
                System.out.println("Aluno reprovado");
            }

        }
    }
}

