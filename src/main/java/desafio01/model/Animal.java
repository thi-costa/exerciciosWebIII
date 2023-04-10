package desafio01.model;

import java.util.Objects;

public class Animal {
    private String nome;
    private String alimentacao;
    private String classe;
    private Integer peso;

    public Animal(String nome, String alimentacao, String classe, Integer peso) {
        this.nome = nome;
        this.alimentacao = alimentacao;
        this.classe = classe;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome) && Objects.equals(alimentacao, animal.alimentacao) && Objects.equals(classe, animal.classe) && Objects.equals(peso, animal.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alimentacao, classe, peso);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", alimentacao='").append(alimentacao).append('\'');
        sb.append(", classe='").append(classe).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
}
