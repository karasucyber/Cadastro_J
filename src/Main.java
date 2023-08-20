import model.*;

public class Main {

    public static void main(String[] args) {
        PessoaJuridicaRepo PJ = new PessoaJuridicaRepo();
        PessoaFisicaRepo PF = new PessoaFisicaRepo();
        PessoaFIsica F = new PessoaFIsica(10,"kaua",10,"4076648");
        PessoaJuridica J = new PessoaJuridica(10,"Kaua",10,"40400");
        PJ.inserirF(J);
        System.out.println(PJ.obterTodos().toString());

    }
}