package br.com.Arthurssx.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    // Curtidas de 0 a 300 = nota 5, de 301 a 500 = nota 8, a partir de 501 = nota 10
    @Override
    public int calcularClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else if (this.getTotalCurtidas() > 300) {
            return 8;
        } else {
            return 5;
        }
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("PODCAST");
        super.exibirFichaTecnica();
        System.out.println("Apresentador: " + getApresentador());
        System.out.println("Descrição: " + getDescricao());
    }
}
