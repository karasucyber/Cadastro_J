import model.PessoaFIsica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

import java.io.IOException;
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
                        // Implementar inclusão de Pessoa Física
                    } else if (tipo == 2) {
                        // Implementar inclusão de Pessoa Jurídica
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        // Implementar alteração de Pessoa Física
                    } else if (tipo == 2) {
                        // Implementar alteração de Pessoa Jurídica
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        // Implementar exclusão de Pessoa Física
                    } else if (tipo == 2) {
                        // Implementar exclusão de Pessoa Jurídica
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 4:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        // Implementar exibição pelo ID de Pessoa Física
                    } else if (tipo == 2) {
                        // Implementar exibição pelo ID de Pessoa Jurídica
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                case 5:
                    System.out.print("Escolha o tipo (1 para Pessoa Física, 2 para Pessoa Jurídica): ");
                    tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (tipo == 1) {
                        // Implementar exibição de todas as Pessoa Físicas
                    } else if (tipo == 2) {
                        // Implementar exibição de todas as Pessoa Jurídicas
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
