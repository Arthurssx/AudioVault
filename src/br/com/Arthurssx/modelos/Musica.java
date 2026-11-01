package br.com.Arthurssx.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    // Reproduções de 0 a 800 = nota 5, de 801 a 2000 = nota 8, a partir de 2001 = nota 10
    @Override
    public int calcularClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else if (this.getTotalReproducoes() > 800) {
            return 8;
        } else {
            return 5;
        }
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("MÚSICA");
        super.exibirFichaTecnica();
        System.out.println("Artista: " + getArtista());
        System.out.println("Álbum: " + getAlbum());
        System.out.println("Gênero: " + getGenero());
    }
}
