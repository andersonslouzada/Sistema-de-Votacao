package com.betrybe.sistemadevotacao;

/**
 * Class Pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Instantiates a new Pessoa candidata.
   *
   * @param nome   the nome
   * @param numero the numero
   */
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  /**
   * Getter numero.
   *
   * @return the numero
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Setter numero.
   *
   * @param numero the numero
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Getter votos.
   *
   * @return the votos
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Increments votos.
   */
  public void receberVoto() {
    this.votos += 1;
  }
}
