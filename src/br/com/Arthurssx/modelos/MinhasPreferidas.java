package br.com.Arthurssx.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é um dos sucessos do mundo");
        } else {
            System.out.println(audio.getTitulo() + " Um dos que você pode gostar");

        }
    }
}
