package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Class GerenciamentoVotacao implements GereciamentoVotacaoInterface.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata novoCandidato = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(novoCandidato);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitor : pessoasEleitoras) {
      if (eleitor.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(novoEleitor);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
