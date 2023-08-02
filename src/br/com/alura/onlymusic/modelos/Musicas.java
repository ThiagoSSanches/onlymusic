package br.com.alura.onlymusic.modelos;

import br.com.alura.onlymusic.classificacao.Classificavel;

public class Musicas extends Audio {
    private String artista;
    private String album;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibeFicha(){
        exibeFichaTecnica();
        System.out.println("Nome do artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Gênero: " + genero);
    }


}
