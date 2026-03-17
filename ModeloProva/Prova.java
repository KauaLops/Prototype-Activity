package ModeloProva;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    private String titulo;
    private String turma;
    private String data;
    private String versao;
    private List<Questao> questoes;

    public Prova(String titulo, String turma, String data, String versao) {
        this.titulo = titulo;
        this.turma = turma;
        this.data = data;
        this.versao = versao;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao q) {
        questoes.add(q);
    }


    public Prova copiar() {
        Prova nova = new Prova(this.titulo, this.turma, this.data, this.versao);

        for (Questao q : this.questoes) {
            nova.adicionarQuestao(q.copiar());
        }

        return nova;
    }

    public int totalPontos() {
        int total = 0;
        for (Questao q : questoes) {
            total += q.getPontos();
        }
        return total;
    }

    public void substituirQuestao(String id, Questao nova) {
        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getId().equals(id)) {
                questoes.set(i, nova);
                return;
            }
        }
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void printResumo() {
        System.out.println("----------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Turma: " + turma);
        System.out.println("Data: " + data);
        System.out.println("Versão: " + versao);
        System.out.println("Total de pontos: " + totalPontos());
        System.out.println("Questões:");

        for (Questao q : questoes) {
            System.out.println("- " + q.getId() + " (" + q.getPontos() + " pts)");
        }
    }
}