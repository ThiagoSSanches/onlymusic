package br.com.alura.onlymusic.main;

import br.com.alura.onlymusic.classificacao.FiltroClassificacao;
import br.com.alura.onlymusic.modelos.Musicas;
import br.com.alura.onlymusic.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musicas kingOfMyHeart = new Musicas();
        kingOfMyHeart.setNome("King of My Heart");
        kingOfMyHeart.setDuracao(3);
        kingOfMyHeart.reproduzir();
        kingOfMyHeart.reproduzir();
        kingOfMyHeart.curtir();
        kingOfMyHeart.avaliaDeZeroADez(4);
        kingOfMyHeart.avaliaDeZeroADez(8);
        kingOfMyHeart.setArtista("YoungMin You");
        kingOfMyHeart.setAlbum("Chill Cinematic Piano Worship");
        kingOfMyHeart.setGenero("Instrumental");
        kingOfMyHeart.exibeFicha();
        FiltroClassificacao filtro = new FiltroClassificacao();
        filtro.filtra(kingOfMyHeart);


        Podcasts motivacao = new Podcasts();
        motivacao.setNome("O segredo dos vencedores");
        motivacao.setDuracao(50);
        motivacao.reproduzir();
        motivacao.curtir();
        motivacao.curtir();
        motivacao.curtir();
        motivacao.avaliaDeZeroADez(10);
        motivacao.setApresentador("Cláudio Duarte");
        motivacao.exibeFicha();
        filtro.filtra(motivacao);

    }
}