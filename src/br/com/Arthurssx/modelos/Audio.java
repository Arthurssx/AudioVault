package br.com.Arthurssx.modelos;

public class Audio {
    private String titulo;
    private double duracao; // Duração em segundos.
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao = 5; // Nota inicial das músicas e dos podcasts.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título deve conter texto.");
        }
        this.titulo = titulo.strip();
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (!Double.isFinite(duracao) || duracao <= 0) {
            throw new IllegalArgumentException("A duração deve ser um número positivo em segundos.");
        }
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        this.totalCurtidas++;
        this.classificacao = calcularClassificacao();
    }

    public void reproduzir() {
        this.totalReproducoes++;
        this.classificacao = calcularClassificacao();
    }

    // As subclasses sobrescrevem o cálculo e o Audio guarda o resultado no campo privado
    public int calcularClassificacao() {
        return 5;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " segundos");
        System.out.println("Reproduções: " + getTotalReproducoes());
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Classificação: " + getClassificacao() + "/10");
    }
}
