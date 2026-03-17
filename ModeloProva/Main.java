package ModeloProva;

public class Main {
    public static void main(String[] args) {


        // Passo A — Template base

        Prova template = new Prova(
                "Prova SQL - Template",
                "TEMPLATE",
                "2026-03-10",
                "BASE"
        );

        template.adicionarQuestao(new Questao("Q1", "Explique SELECT", 3));
        template.adicionarQuestao(new Questao("Q2", "Explique JOIN", 3));
        template.adicionarQuestao(new Questao("Q3", "Explique GROUP BY", 4));

        System.out.println("TEMPLATE:");
        template.printResumo();


        // Passo B — Prova 1 (Turma A)

        Prova provaA = template.copiar();
        provaA.setTurma("2o INFO A");
        provaA.setData("2026-03-20");
        provaA.setVersao("V1");

        provaA.substituirQuestao(
                "Q2",
                new Questao("Q2", "Explique INNER JOIN com exemplo", 3)
        );

        System.out.println("\nPROVA A:");
        provaA.printResumo();


        // Prova 2 — Turma B

        Prova provaB = template.copiar();
        provaB.setTurma("2o INFO B");
        provaB.setData("2026-03-21");
        provaB.setVersao("V1");

        provaB.substituirQuestao(
                "Q3",
                new Questao("Q3", "Explique GROUP BY", 5)
        );

        System.out.println("\nPROVA B:");
        provaB.printResumo();


        // Teste de cópia profunda

        System.out.println("\nTESTE DE CÓPIA PROFUNDA:");

        // Alterando Q1 da Prova A
        provaA.getQuestoes().get(0).setEnunciado("ALTERADO NA PROVA A");

        System.out.println("\nTEMPLATE após alteração:");
        template.printResumo();

        System.out.println("\nPROVA A após alteração:");
        provaA.printResumo();
    }
}