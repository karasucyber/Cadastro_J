package model;

import java.io.*;
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

     public PessoaJuridica obter(int id){
        for(PessoaJuridica pessoa : jurica){
         if(pessoa.getId() == id){ return pessoa; }}return null;}


    public List<PessoaJuridica> obterTodos(){
        return new ArrayList<>(jurica);
    }

    public void persistir(String nomeArquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(jurica);
            System.out.println("Dados persistidos no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recuperar(String nomeArquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            jurica = (List<PessoaJuridica>) inputStream.readObject();
            System.out.println("Dados de Pessoa Jurídica recuperados do arquivo: " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Restante do código da classe
}

