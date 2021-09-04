package br.com.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<>();

        boolean chave = true;
        int opcao = 0;
        String cpf = "";
        String nome = "";
        String email = "";
        String telefone = "";


        //Apresentando o gerenciador.
        System.out.println("\n             Bem vinde ao gerenciador de funcionários 'YOU CAN'\n");
        System.out.println("Aqui você consegue inserir novos funcionários, checar as informações de todes,");
        System.out.println("de uma forma simplificada mas, sem perder os atributos tecnológicos!");
        System.out.println("Vamos começar?!\n");

        while (chave == true) {
            //Menu interativo para o usuário.
            System.out.println("Digite 1: para inserir um funcionário;");
            System.out.println("Digite 2: para exibir a lista de funcionários cadastrados;");
            System.out.println("Digite 3: para remover um funcionário do cadastro;");
            System.out.println("Digite 4: para encerrar o YOU CAN.");
            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                //Cadastrando funcionários.
                System.out.println("Digite o nome completo do funcionário: ");
                nome = input.nextLine();
                System.out.println("Agora digite o telefone de contato do funcionário: ");
                telefone = input.nextLine();
                System.out.println("Digite o e-mail para cadastro: ");
                email = input.nextLine();
                System.out.println("Agora digite o CPF do funcionário: ");
                cpf = input.nextLine();
                if (funcionarios.size() != 0) {
                    for (String verificarCpf : funcionarios.keySet()) {
                        if (verificarCpf.equals(cpf)) {
                            System.out.println("CPF já foi inserido!");
                        } else {
                            System.out.println("Funcionário cadastrado com sucesso!");
                            System.out.println("\n O que deseja fazer agora? ");
                        }

                    }
                } else {
                    funcionarios.put(cpf, " Nome: " + nome + ". Telefone: " + telefone + ". E-mail: " + email + ".");
                    System.out.println("Funcionário cadastrado com sucesso!");
                    System.out.println("\n O que deseja fazer agora? ");
                }
                funcionarios.put(cpf, " Nome: " + nome + ". Telefone: " + telefone + ". E-mail: " + email + ".");

            } else if (opcao == 2) {
                //Exibindo a lista de funcionários.
                for (String referencia : funcionarios.keySet()) {
                    System.out.println(funcionarios.get(referencia) + " CPF: " + referencia);

                }
            } else if (opcao == 3) {
                //Removendo um funcionário do gerenciador.
                System.out.println("Digite o CPF do funcionário a ser removido");
                String cpfASerDeletado = input.nextLine();
                String cpfDeletado = "";

                for (String cpfFuncionario : funcionarios.keySet()) {
                    if (cpfFuncionario.equals(cpfASerDeletado)) {
                        System.out.println("Funcionário removido com sucesso.");
                        cpfDeletado = cpfASerDeletado;
                    }
                }
                funcionarios.remove(cpfDeletado);
            } else if (opcao == 4) {
                //Finalizando o gerenciador.
                System.out.println("YOU CAN finalizado com sucesso");
                chave = false;
            } else {
                System.out.println("Opção não reconhecida, por favor, digite uma opção válida.\n");
            }

        }
    }
}





