package br.com.Arthurssx.principal;

import br.com.Arthurssx.modelos.MinhasPreferidas;
import br.com.Arthurssx.modelos.Musica;
import br.com.Arthurssx.modelos.Podcast;

public class Principal {
    static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Canção do Sol");
        minhaMusica.setArtista("Henrique Mendonça");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            minhaMusica.getTotalCurtidas();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Java Coders");
        podcast.setApresentador("Sigma Coders");
        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }
        for (int i = 0; i<1000;i++) {
            podcast.reproduzir();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);

    }
}
