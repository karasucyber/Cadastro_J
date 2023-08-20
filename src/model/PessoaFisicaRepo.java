package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class PessoaFisicaRepo {
     /* Lista privada para armazenar pessoas */
     private List<PessoaFIsica> pessoas;

     public PessoaFisicaRepo(){
         pessoas = new ArrayList<>();
     }

     public void inserir(PessoaFIsica pessoa){
         pessoas.add(pessoa);
     }

     public void alterar(PessoaFIsica pessoaAntiga, PessoaFIsica pessoaNova){
         int index = pessoas.indexOf(pessoaAntiga);
         if (index != -1){
             pessoas.set(index,pessoaNova);
         }
     }
    public void excluir(PessoaFIsica pessoa) {
        pessoas.remove(pessoa);
    }

    public PessoaFIsica obter(int id){
             for(PessoaFIsica pessoa : pessoas){
             if(pessoa.getId() == id){
                 return  pessoa;
             }
         }
        return null;
    }
    public List<PessoaFIsica> obterTodos(){
         return new ArrayList<>(pessoas);
    }

    public class  PessoaJuridicaRepo{
    }
}

/*  indexOf é usado para encontrar os índices das strings  */
/* List é usada para criar coleções ordenadas de elementos */
