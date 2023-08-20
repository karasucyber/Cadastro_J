package model;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {
    int idade;
    String nome;
    int id;

    public Pessoa(int idade, String nome, int id){
        this.idade = idade;
        this.nome = nome;
        this.id = id;

    }

    public String toString (){
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome ;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int Idade){
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId(){
        return id;
    }




    public final void atualizarNome(){
     return ;


    }


}
