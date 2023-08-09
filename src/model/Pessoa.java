package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    int idade;
    String nome;

    protected  String identificador;

    int id;

    public Pessoa(int idade, String name, int id,String identificador){
        this.idade = idade;
        this.nome = nome;
        this.id = id;
        this.identificador = identificador;

    }

    public String toString (){
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }

    public void atualizarNome(){
     return ;

    }

}
