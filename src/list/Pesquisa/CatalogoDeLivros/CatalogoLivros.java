package list.Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    // construtor
    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    // métodos
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();

        // se tiver livros na lista
        if (! listaLivros.isEmpty()) {

            for (Livro livro : listaLivros) {
                // se o autor do livro for o do parâmetro
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    // adiciona à lista de livros do autor
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosDoIntervalo = new ArrayList<>();

        // se tiver livros na lista
        if (! listaLivros.isEmpty()) {

            for (Livro livro : listaLivros) {
                // se o ano está entre os anos informados
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    // adiciona à lista de livros do período
                    livrosDoIntervalo.add(livro);
                }
            }
        }
        return livrosDoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroDoTitulo = null;

        // se tiver livros na lista
        if (! listaLivros.isEmpty()) {

            for (Livro livro : listaLivros) {
                // se tiver o título igual o parâmetro
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    // atribui o livro ao livro pesquisado
                    livroDoTitulo = livro;
                    break;
                }
            }
        }
        return livroDoTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor de 1 e 2", 2020);
        catalogo.adicionarLivro("Livro 2", "Autor de 1 e 2", 2020);
        catalogo.adicionarLivro("Livro 3", "Autor de 3", 2022);
        catalogo.adicionarLivro("Livro 4", "Autor de 4 e 5", 2022);
        catalogo.adicionarLivro("Livro 5", "Autor de 4 e 5", 2023);
    }
}
