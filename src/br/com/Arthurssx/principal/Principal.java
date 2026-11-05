package br.com.Arthurssx.principal;

import br.com.Arthurssx.modelos.MinhasPreferidas;
import br.com.Arthurssx.modelos.Musica;
import br.com.Arthurssx.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Canção do Sol");
        minhaMusica.setArtista("Henrique Mendonça");
        minhaMusica.setAlbum("Álbum de demonstração");
        minhaMusica.setGenero("Instrumental");
        minhaMusica.setDuracao(240.5);

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
            minhaMusica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Java Coders");
        podcast.setApresentador("Sigma Coders");
        podcast.setDescricao("Uma conversa sobre Java e orientação a objetos.");
        podcast.setDuracao(1800);

        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
            podcast.reproduzir();
        }

        minhaMusica.exibirFichaTecnica();
        System.out.println();
        podcast.exibirFichaTecnica();

        System.out.println();
        System.out.println("--- Recomendações ---");
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);
    }
}
