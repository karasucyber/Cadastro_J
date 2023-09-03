import model.PessoaFIsica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaFisicaRepo repoPF = new PessoaFisicaRepo();
         PessoaJuridicaRepo repoPJ = new PessoaJuridicaRepo();
        String nomeArquivoPF = "pessoas_fisicas.bin";
        String nomeArquivoPJ = "pessoas_juridicas.bin";

        int opcao;

        do {
            System.out.println("=== Menu de Opções ===");
            System.out.println("1. Incluir");
            System.out.println("2. Alterar");
            System.out.println("3. Excluir");
            System.out.println("4. Exibir pelo ID");
            System.out.println("5. Exibir todos");
            System.out.println("6. Salvar dados");
            System.out.println("7. Recuperar dados");
            System.out.println("0. Finalizar");

            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        System.out.println("Você deve inserir o id");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o nome");
                        String nome = scanner.nextLine();
                        System.out.println("Qual seria a idade ?");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o CPF");
                        String cpf = scanner.nextLine();
                        PessoaFIsica pessoa = new PessoaFIsica(idade, nome, id, cpf);
                        repoPF.inserir(pessoa);
                        repoPF.imprimirTodos();


                        repoPF.obterTodos();
                        System.out.println("operação finalizada");

                    } else if (tipo == 2) {
                        System.out.println("Você deve inserir id");
                        int id = scanner.nextInt();
                        System.out.println("Você deve inserir o nome");
                        String nome = scanner.next();
                        System.out.println("Qual seria a idade ?");
                        int idade = scanner.nextInt();;
                        System.out.println("você deve inserir o cpf");
                        String cnpj = scanner.next();
                        PessoaJuridica pesssoa = new PessoaJuridica(idade,nome,id,cnpj);
                        repoPJ.inserir(pesssoa);


                        System.out.println("operação finalizada");
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.println("----------------");
                        repoPF.imprimirTodos();
                        System.out.println("use os dados acima para inserir corretamente os dados");
                        System.out.println("----------------");
                        System.out.println("Os campos a seguir será para inserção do novo cadastro");
                        System.out.println("Você deve inserir o id");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o nome");
                        String name = scanner.nextLine();
                        System.out.println("Qual seria a idade ?");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o CPF");
                        String cpf = scanner.nextLine();
                        PessoaFIsica pessoaNova = new PessoaFIsica(idade,name,id,cpf);
                        System.out.println("---------------------------------");



                         PessoaFIsica pessoaAntiga = new PessoaFIsica(idade,name,id,cpf);
                         repoPF.alterar(pessoaAntiga, pessoaNova);

                    } else if (tipo == 2) {
                        // Pedir ao usuário o ID da pessoa jurídica que deseja alterar
                        System.out.println("Informe o ID da pessoa jurídica que deseja alterar:");
                        int idParaAlterar = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha

                        PessoaJuridica pessoaExistente = repoPJ.obter(idParaAlterar);

                        if (pessoaExistente != null) {
                            System.out.println("Informe os novos dados:");

                            System.out.println("Você deve inserir o nome:");
                            String novoNome = scanner.nextLine();

                            System.out.println("Qual seria a idade?");
                            int novaIdade = scanner.nextInt();
                            scanner.nextLine(); // Consumir a quebra de linha

                            System.out.println("Você deve inserir o novo CPF:");
                            String novoCNPJ = scanner.nextLine();

                            // Atualizar apenas os campos relevantes da pessoa jurídica existente
                            pessoaExistente.setNome(novoNome);
                            pessoaExistente.setIdade(novaIdade);
                            pessoaExistente.setCnpj(novoCNPJ);

                            System.out.println("Pessoa jurídica atualizada com sucesso!");
                        } else {
                            System.out.println("Pessoa jurídica com o ID informado não encontrada.");
                        }



                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        System.out.println("----------------");
                        repoPF.imprimirTodos();
                        System.out.println("use os dados acima para inserir corretamente os dados");
                        System.out.println("----------------");
                        System.out.println("Você deve inserir o id");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o nome");
                        String nome = scanner.nextLine();
                        System.out.println("Qual seria a idade ?");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o CPF");
                        String cpf = scanner.nextLine();

                        repoPF.excluir(new PessoaFIsica(idade,nome,id,cpf));
                    } else if (tipo == 2) {
                        System.out.println("----------------");
                        repoPF.imprimirTodos();
                        System.out.println("use os dados acima para inserir corretamente os dados");
                        System.out.println("----------------");
                        System.out.println("Você deve inserir o id");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o nome");
                        String nome = scanner.nextLine();
                        System.out.println("Qual seria a idade ?");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Você deve inserir o CPF");
                        String cnpj = scanner.nextLine();

                        repoPJ.remove(new PessoaJuridica(idade,nome,id,cnpj));
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 4:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        System.out.println("Informe o ID da pessoa jurídica que deseja alterar:");
                        int idParaAlterar = scanner.nextInt();
                        scanner.nextLine();

                        repoPF.obter(idParaAlterar);
                        System.out.println();

                    } else if (tipo == 2) {
                        System.out.println("Informe o ID da pessoa jurídica que deseja alterar:");
                        int idParaAlterar = scanner.nextInt();
                        repoPJ.obter(idParaAlterar);
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 5:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        System.out.println("---------------------");
                        repoPF.imprimirTodos();
                        System.out.println("---------------------");


                    } else if (tipo == 2) {
                        System.out.println("---------------------");
                        repoPJ.imprimirTodos();
                        System.out.println("---------------------");

                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 6:
                    repoPF.persistir(nomeArquivoPF);
                    repoPJ.persistir(nomeArquivoPJ);
                    System.out.println("Dados persistidos nos arquivos.");
                    break;
                case 7:
                    repoPF.recuperar(nomeArquivoPF);
                    repoPJ.recuperar(nomeArquivoPJ);
                    System.out.println("Dados recuperados dos arquivos.");
                    break;
                case 0:
                    System.out.println("Finalizando a execução.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
