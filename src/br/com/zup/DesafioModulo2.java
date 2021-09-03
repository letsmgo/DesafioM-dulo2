package br.com.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<>();


        //Apresentando o gerenciador.
        System.out.println("\n             Bem vinde ao gerenciador de funcionários 'YOU CAN'\n");
        System.out.println("Aqui você consegue inserir novos funcionários, checar as informações de todes,");
        System.out.println("de uma forma simplificada mas, sem perder os atributos tecnológicos!");
        System.out.println("Vamos começar?!\n");

        //Inserindo um funcionário no gerenciador.
        System.out.println("Começaremos com a inserção de um funcionário novo na plataforma.");
        System.out.println("Por gentileza digite o nome completo do funcionário que deseja incluir: ");
        String nome = input.nextLine();
        System.out.println("Agora insira o telefone de contato pertecente a este funcionário: ");
        String telefone = input.nextLine();
        System.out.println("Me informe agora o e-mail do funcionário: ");
        String email = input.nextLine();
        System.out.println("Por ultimo e não menos importante, o CPF do funcionário: ");
        String cpf = input.nextLine();

        funcionarios.put( "CPF " +cpf + " ", " Nome: " + nome + ", Telefone: " + telefone + ", E-mail: " + email + ".");

        System.out.println("Segue abaixo a listagem dos funcionários cadastrados: ");
        System.out.println(funcionarios);


    }
}
