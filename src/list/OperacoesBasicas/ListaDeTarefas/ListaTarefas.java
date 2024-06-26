package list.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        // remove todas as tarefas que possuem a descrição parâmetro

        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        int contador = 1;
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(contador + ". " + tarefa.getDescricao());
            contador++;
        }
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        System.out.println("N° total de tarefas: " + lista.obterNumeroTotalTarefas());

        System.out.println("\n------------\n");

        lista.adicionarTarefa("Acordar");
        lista.obterDescricoesTarefas();
        System.out.println("N° total de tarefas: " + lista.obterNumeroTotalTarefas());

        System.out.println("\n------------\n");

        lista.adicionarTarefa("Arrumar a cama");
        lista.obterDescricoesTarefas();
        System.out.println("N° total de tarefas: " + lista.obterNumeroTotalTarefas());

        System.out.println("\n------------\n");

        lista.removerTarefa("Acordar");
        lista.obterDescricoesTarefas();
        System.out.println("N° total de tarefas: " + lista.obterNumeroTotalTarefas());
    }
}
