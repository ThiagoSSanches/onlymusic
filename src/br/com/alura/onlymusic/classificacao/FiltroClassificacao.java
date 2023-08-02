package br.com.alura.onlymusic.classificacao;
public class FiltroClassificacao {

    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos. " + classificavel.getClassificacao() + " estrelas.");
            System.out.println("****************************");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Está bem avaliado. " + classificavel.getClassificacao() + " estrelas.");
            System.out.println("****************************");
        } else {
            System.out.println("Pode salvar na lista para ouvir depois. " + classificavel.getClassificacao() + " estrelas.");
            System.out.println("****************************");
        }
    }
}
