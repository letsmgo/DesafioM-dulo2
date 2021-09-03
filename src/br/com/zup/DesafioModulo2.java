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


        //Apresentando o gerenciador.
        System.out.println("\n             Bem vinde ao gerenciador de funcionários 'YOU CAN'\n");
        System.out.println("Aqui você consegue inserir novos funcionários, checar as informações de todes,");
        System.out.println("de uma forma simplificada mas, sem perder os atributos tecnológicos!");
        System.out.println("Vamos começar?!\n");

        while (chave == true){
            //Menu interativo para o usuário.
            System.out.println("Digite 1: para inserir um funcionário;");
            System.out.println("Digite 2: para exibir a lista de funcionários cadastrados;");
            System.out.println("Digite 3: para encerrar o YOU CAN");
            opcao = input.nextInt();
            input.nextLine();

            if(opcao == 1){
                //Cadastrando funcionários.
                System.out.println("Digite o nome completo do funcionário: ");
                String nome = input.nextLine();
                System.out.println("Agora digite o telefone de contato do funcionário: ");
                String telefone = input.nextLine();
                System.out.println("Digite o e-mail para cadastro: ");
                String email = input.nextLine();
                System.out.println("Agora digite o CPF do funcionário: ");
                String cpf = input.nextLine();
                funcionarios.put("CPF: " + cpf + " ", " Nome: " + nome + " Telefone: " + telefone + " E-mail: " + email + ".");
                System.out.println("Funcionário cadastrado com sucesso!");
                System.out.println("\n O que deseja fazer agora? ");
            }
            else if (opcao == 2){
                //Exibindo a lista de funcionários.
                System.out.println("\nSegue abaixo todos os funcionários cadastrados: ");
                System.out.println(funcionarios);
                System.out.println();
            }
            else if( opcao == 3) {
                //Finalizando o gerenciador.
                System.out.println("YOU CAN finalizado com sucesso");
                chave =false;
            }
        }
    }
}
