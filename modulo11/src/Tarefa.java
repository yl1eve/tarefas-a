import java.util.ArrayList;
import java.util.List;

public class Tarefa {

    public static void main (String args[]) {
        listaPessoas();
        
    }

    private static void listaPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa a = new Pessoa ("Jorge", "Masculino");
        Pessoa b = new Pessoa ("Maria", "Feminino");
        Pessoa c = new Pessoa ("Cleiton", "Masculino");
        Pessoa d = new Pessoa ("Ana", "Feminino");

        pessoas.add(a);
        pessoas.add(b);
        pessoas.add(c);
        pessoas.add(d);

        System.out.println(pessoas);

    }

}
