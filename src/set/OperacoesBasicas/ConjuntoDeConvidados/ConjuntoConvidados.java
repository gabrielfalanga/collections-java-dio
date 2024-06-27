package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidados;

    // construtor
    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }

    //métodos
    public void adicionarConvidado(String nome, int codigoConvite) {
        setConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        for (Convidado convidado : setConvidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                setConvidados.remove(convidado);
                break;
            }
        }
    }

    public int contarConvidados(){
        return setConvidados.size();
    }

    public void exibirConvidados() {
        for (Convidado convidado : setConvidados) {
            System.out.println(convidado.getNome() + " ___ " + convidado.getCodigoConvite());
        }
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("N° de Convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("gabriel", 0);
        conjuntoConvidados.exibirConvidados();
        System.out.println("N° de Convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("debora", 1);
        conjuntoConvidados.exibirConvidados();
        System.out.println("N° de Convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("josé", 2);
        conjuntoConvidados.exibirConvidados();
        System.out.println("N° de Convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);
        conjuntoConvidados.exibirConvidados();
        System.out.println("N° de Convidados: " + conjuntoConvidados.contarConvidados());
    }
}
