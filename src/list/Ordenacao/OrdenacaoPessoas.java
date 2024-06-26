package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // atributos
    private List<Pessoa> listaPessoas;

    // construtor
    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    // métodos
    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        // cria um clone da lista original
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        // ordena a lista clone
        Collections.sort(pessoasPorIdade);
        // retorna a lista ordenada
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        // cria um clone da lista original
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        // ordena a lista clone
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        // retorna a lista ordenada
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 10, 3.0);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 4.0);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 20, 2.0);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 5, 1.0);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("------------------");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
