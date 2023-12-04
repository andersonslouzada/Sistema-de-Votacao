package com.betrybe.sistemadevotacao;

/**
 * Abstract class Pessoa.
 */
public abstract class Pessoa {
  /**
   * The Nome.
   */
  protected String nome;

  /**
   * Getter nome.
   *
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * Setter nome.
   *
   * @param nome the nome
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
