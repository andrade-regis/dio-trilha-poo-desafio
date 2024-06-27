package aparelhos;

import funcionalidades.*;

// Compreendo que o iPad não existia na época do lançamento do iPhone
// porém inclui outro aparelho para ilustrar o exercicio.

public class Ipad implements ReprodutorMusical, NavegadorInternet{
    
    public void exibirPagina(String url){
        System.out.println("iPad abrindo página: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("iPad abrindo nova aba");
    }

    public void atualizarPagina(){
        System.out.println("iPad atualizando página");
    }

    public void tocar(){
        System.out.println("iPad reproduzindo música");
    }

    public void pausar(){
        System.out.println("iPad pausando música");
    }

    public void selecionarMusica(String musica){
        System.out.println("iPad reproduzindo faixa " + musica);
    }

}
