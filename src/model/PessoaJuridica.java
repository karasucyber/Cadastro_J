package model;

import java.io.Serializable;

public class PessoaJuridica extends Pessoa implements Serializable {
    String cnpj;

    public PessoaJuridica(int idade, String name, int id, String cnpj ) {
        super(idade, name, id);
        this.cnpj = cnpj;

    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String novoCNPJ){
        this.cnpj = cnpj ;
    }



    @Override
    public String toString() {
        return "[\n" +
                "  id = " + id + "\n" +
                "  Nome = " + nome + "\n" +
                "  Cnpj = " + cnpj + "\n" +
                "  Idade = " + idade + "\n" +
                "]";
    }


}
