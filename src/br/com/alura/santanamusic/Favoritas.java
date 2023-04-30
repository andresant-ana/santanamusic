package br.com.alura.santanamusic;

public class Favoritas {

    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " está nos favoritos do Santana Music");
        } else {
            System.out.println(audio.getTitulo() + " está em alta");
        }
    }

}
