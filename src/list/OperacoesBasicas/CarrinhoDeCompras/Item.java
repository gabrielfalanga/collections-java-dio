package list.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
    // atributos
    private String nome;
    private double preco;

    // construtor
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // toString
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
