package model;

import java.io.Serializable;

public class PessoaJuridica extends Pessoa implements Serializable {
    String cnpj;

    public PessoaJuridica(int idade, String name, int id, String cnpj) {
        super(idade, name, id);
        this.cnpj = cnpj;

    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(){
        this.cnpj = cnpj;
    }

    public void exibir(){
        System.out.println("Pessoa Juridica");
        System.out.println("ID" + getId());
        System.out.println("nome" + getNome());
        System.out.println("idade" + getIdade());
        System.out.println("CNPJ" + getCnpj());
        System.out.println("-----------------------------");

    }

}
