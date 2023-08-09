package model;

import java.io.Serializable;

public class PessoaJuridica extends PessoaFIsica implements Serializable {
    String cnpj;

    public PessoaJuridica(int idade, String name, int id, String identificador) {
        super(idade, name, id, identificador);
    }
}
