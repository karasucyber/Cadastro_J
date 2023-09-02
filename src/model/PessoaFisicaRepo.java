package model;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

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

    public void persistir(String nomeArquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(pessoas);
            System.out.println("Dados persistidos no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void recuperar(String nomeArquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pessoas = (List<PessoaFIsica>) inputStream.readObject();
            System.out.println("Dados de Pessoa Física recuperados do arquivo: " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*  indexOf é usado para encontrar os índices das strings  */
/* List é usada para criar coleções ordenadas de elementos */
