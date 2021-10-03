package br.com.dio.model;

import java.util.Objects;

public class Gato {

    private String nome;
    private String cor;
    private String CPF;

    public Gato() {
    }

    public Gato(String nome, String cor, String CPF) {
        this.nome = nome;
        this.cor = cor;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(CPF, gato.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, CPF);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
