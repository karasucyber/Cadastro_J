package model;
public class PessoaFIsica extends Pessoa{

   private String cpf ;
    public PessoaFIsica(int idade, String name, int id, String cpf) {
        super(idade, name, id);

        this.cpf = cpf;

    }



    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString(){
        return cpf ;
    }
    public void exibir(){
        System.out.println("Pessoa Fisica");
        System.out.println("ID " +"" + getId()   );
        System.out.println("nome " + "" + getNome());
        System.out.println("idade " + "" +getIdade());
        System.out.println("CPF " + "" + getCpf());
        System.out.println("-----------------------------");
    }



}
