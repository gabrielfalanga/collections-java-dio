package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    //construtor
    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    //métodos
    public void adicionarContato(String nome, int numero) {
        setContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(setContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : setContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : setContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));
    }
}