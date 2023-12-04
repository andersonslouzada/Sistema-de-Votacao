package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * The type Principal.
 */
public class Principal {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    boolean candidato = true;
    boolean eleitor = false;
    boolean votacao = false;

    int option = 1;

    while (candidato) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      option = Integer.parseInt(scanner.nextLine());

      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String name = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int number = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.cadastrarPessoaCandidata(name, number);
      } else {
        candidato = false;
        eleitor = true;
      }
    }
    
    while (eleitor) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      option = Integer.parseInt(scanner.nextLine());

      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String name = scanner.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(name, cpf);
      } else {
        eleitor = false;
        votacao = true;
      }
    }

    while (votacao) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      option = Integer.parseInt(scanner.nextLine());

      switch (option) {
        case 1:
          System.out.println("Entre com o cpf da pessoa eleitora:");
          String cpf = scanner.nextLine();
          System.out.println("Entre com o número da pessoa candidata:");
          int number = Integer.parseInt(scanner.nextLine());
          gerenciamentoVotacao.votar(cpf, number);
          break;

        case 2:
          gerenciamentoVotacao.mostrarResultado();
          break;

        case 3:
          gerenciamentoVotacao.mostrarResultado();
          votacao = false;
          break;
      }
    }
  }
}
