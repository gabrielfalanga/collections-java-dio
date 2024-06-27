package set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;


    //construtor
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //toString
    @Override
    public String toString() {
        return "{" + nome + ", " + numero + "}";
    }

    //equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
