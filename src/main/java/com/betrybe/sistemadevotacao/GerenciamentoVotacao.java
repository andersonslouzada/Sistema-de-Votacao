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
      if (numero == candidato.getNumero()) {
        System.out.println("Número da pessoa candidata já utilizado!");
      } else {
        PessoaCandidata novoCandidato = new PessoaCandidata(nome, numero);
        pessoasCandidatas.add(novoCandidato);
      }
    }

  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitor : pessoasEleitoras) {
      if (cpf.equals(eleitor.getCpf())) {
        System.out.println("Pessoa eleitora já cadastrada!");
      } else {
        PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
        pessoasEleitoras.add(novoEleitor);
      }
    }

  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
