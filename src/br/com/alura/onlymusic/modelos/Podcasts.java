package br.com.alura.onlymusic.modelos;

import br.com.alura.onlymusic.classificacao.Classificavel;

public class Podcasts extends Audio implements Classificavel{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibeFicha(){
        exibeFichaTecnica();
        System.out.println("Nome do apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
        }
}
