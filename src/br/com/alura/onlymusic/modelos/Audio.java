package br.com.alura.onlymusic.modelos;

import br.com.alura.onlymusic.classificacao.Classificavel;

public class Audio implements Classificavel {
    private String nome;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void reproduzir () {
            this.totalDeReproducoes++;
    }

    public void curtir (){
            this.curtidas ++;
    }

    public void avaliaDeZeroADez (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome da obra: "+ nome);
        System.out.println("Duração em minutos: " + duracao);
        System.out.println("Total de reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("****************************");
    }

    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }

    @Override
    public void exibeFicha() {
    }

}
