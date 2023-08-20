package model;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaRepo {
    private List<PessoaJuridica> jurica;

    public PessoaJuridicaRepo(){ jurica = new ArrayList<>();}

    public void inserirF(PessoaJuridica pessoa){ jurica.add(pessoa);}

    public void alterar(PessoaJuridica pessoaAntiga, PessoaJuridica pessoaNova){
        int index = jurica.indexOf(pessoaAntiga);
        if(index != -1){
            jurica.set(index, pessoaNova);
        }

    }

    public void remove(PessoaJuridica pessoa){ jurica.remove(pessoa);}

     public PessoaJuridica ob(int id){
        for(PessoaJuridica pessoa : jurica){
         if(pessoa.getId() == id){ return pessoa; }}return null;}


    public List<PessoaJuridica> obterTodos(){
        return new ArrayList<>(jurica);
    }
}
