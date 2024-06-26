package list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    // construtor
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // métodos
    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer n : listaNumeros) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = listaNumeros.getFirst();
        for (Integer n : listaNumeros) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = listaNumeros.getFirst();
        for (Integer n : listaNumeros) {
            if (n < menorNumero) {
                menorNumero = n;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        for (Integer n : listaNumeros) {
            System.out.print(n + " | ");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somador = new SomaNumeros();

        somador.adicionarNumero(1);
        somador.exibirNumeros();
        System.out.println("Soma: " + somador.calcularSoma());
        System.out.println("Maior: " + somador.encontrarMaiorNumero());
        System.out.println("Menor: " + somador.encontrarMenorNumero());

        System.out.println("-------------");

        somador.adicionarNumero(2);
        somador.adicionarNumero(3);
        somador.exibirNumeros();
        System.out.println("Soma: " + somador.calcularSoma());
        System.out.println("Maior: " + somador.encontrarMaiorNumero());
        System.out.println("Menor: " + somador.encontrarMenorNumero());

        System.out.println("-------------");

        somador.adicionarNumero(4);
        somador.adicionarNumero(0);
        somador.exibirNumeros();
        System.out.println("Soma: " + somador.calcularSoma());
        System.out.println("Maior: " + somador.encontrarMaiorNumero());
        System.out.println("Menor: " + somador.encontrarMenorNumero());
    }
}
