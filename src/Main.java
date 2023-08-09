import model.Pessoa;
import model.PessoaFIsica;

public class Main {
private static Pessoa grupo[];
    public static void main(String[] args) {
        grupo = new Pessoa [2];

        grupo[0] = new PessoaFIsica(10, "Kaua",10,"marques");
        grupo[1] = new Pessoa(10,"kaua",10,"marques");

        for(int i = 0; i <= 1; i++){
            System.out.println(grupo[i].toString());
        }
    }
}