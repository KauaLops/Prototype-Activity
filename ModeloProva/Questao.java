package ModeloProva;

public class Questao {
    private String id;
    private String enunciado;
    private int pontos;

    public Questao(String id, String enunciado, int pontos) {
        this.id = id;
        this.enunciado = enunciado;
        this.pontos = pontos;
    }

    public String getId() {
        return id;
    }


    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getPontos() {
        return pontos;
    }

    public Questao copiar() {
        return new Questao(this.id, this.enunciado, this.pontos);
    }

    @Override
    public String toString() {
        String trecho = enunciado.length() > 20
                ? enunciado.substring(0, 20) + "..."
                : enunciado;

        return id + " (" + pontos + " pts): " + trecho;
    }
}