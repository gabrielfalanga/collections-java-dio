package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    public List<Item> carrinho;

    // construtor
    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    // métodos
    public void adicionarItem(String nome, double preco) {
        carrinho.add(new Item(nome, preco));
    }

    public void removerItem(String nome) {
        List<Item> itensARemover = new ArrayList<>();

        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensARemover.add(item);
            }
        }
        carrinho.removeAll(itensARemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : carrinho) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens() {
        for (Item item : carrinho) {
            System.out.println(item.getNome() + " ___ " + item.getPreco());
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        System.out.println("Total: R$" + carrinho.calcularValorTotal());

        carrinho.adicionarItem("Pão", 1.5);
        carrinho.exibirItens();
        System.out.println("Total: R$" + carrinho.calcularValorTotal());

        System.out.println("\n----------------------\n");

        carrinho.adicionarItem("Manteiga", 10.0);
        carrinho.exibirItens();
        System.out.println("Total: R$" + carrinho.calcularValorTotal());

        System.out.println("\n----------------------\n");

        carrinho.adicionarItem("Leite", 7.8);
        carrinho.exibirItens();
        System.out.println("Total: R$" + carrinho.calcularValorTotal());

        System.out.println("\n----------------------\n");

        carrinho.removerItem("pão");
        carrinho.exibirItens();
        System.out.println("Total: R$" + carrinho.calcularValorTotal());
    }
}