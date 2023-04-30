package br.com.alura.santanamusic;

public class Main {
    public static void main(String[] args) {

        Musica leonTheProfessional = new Musica();
        leonTheProfessional.setTitulo("Leon The Professional");
        leonTheProfessional.setGenero("UK Drill");
        leonTheProfessional.setArtista("Knucks");
        leonTheProfessional.setAlbum("Leon The Professional - Single");

        for (int i = 0; i < 1000; i++) {
            leonTheProfessional.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            leonTheProfessional.curtir();
        }

        System.out.println(
                "Título da música: " + leonTheProfessional.getTitulo() + "\n" +
                "Genero da música: " + leonTheProfessional.getGenero() + "\n" +
                "Artista da música: " + leonTheProfessional.getArtista() + "\n" +
                "Album da música: " + leonTheProfessional.getAlbum() + "\n" +
                "Número de reproduções da música: " + leonTheProfessional.getTotalDeReproducoes() + "\n" +
                "Número de curtidas da música: " + leonTheProfessional.getCurtidas() + "\n" +
                "=================================================>>"
        );

        Podcast podpah = new Podcast();
        podpah.setTitulo("Podpah");
        podpah.setHost("Igão e Mítico");

        for (int i = 0; i < 5000; i++) {
            podpah.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            podpah.curtir();
        }

        System.out.println(
                "Título do podcast: " + podpah.getTitulo() + "\n" +
                "Host do podcast: " + podpah.getHost() + "\n" +
                "Número de reproduções do podcast: " + podpah.getTotalDeReproducoes() + "\n" +
                "Número de curtidas do podcast: " + podpah.getCurtidas() + "\n" +
                "=================================================>>"
        );

        Favoritas favoritas = new Favoritas();
        favoritas.incluir(leonTheProfessional);
        favoritas.incluir(podpah);

    }
}