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
    public String toString() {
        return "[\n" +
                "  id = " + id + "\n" +
                "  Nome = " + nome + "\n" +
                "  Cnpj = " + cpf + "\n" +
                "  Idade = " + idade + "\n" +
                "]";
    }



}
