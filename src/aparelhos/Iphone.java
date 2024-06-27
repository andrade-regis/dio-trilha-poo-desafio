package aparelhos;

import funcionalidades.*;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    public void ligar(String numero){
        System.out.println("iPhone ligando para o número " + numero);
    }

    public void atender(){
        System.out.println("iPhone atendendo chamada");
    }

    public void iniciarCorreioVoz(){
        System.out.println("iPhone iniciando correio de voz");
    }

    public void exibirPagina(String url){
        System.out.println("iPhone abrindo página: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("iPhone abrindo nova aba");
    }

    public void atualizarPagina(){
        System.out.println("iPhone atualizando página");
    }

    public void tocar(){
        System.out.println("iPhone reproduzindo música");
    }

    public void pausar(){
        System.out.println("iPhone pausando música");
    }

    public void selecionarMusica(String musica){
        System.out.println("iPhone reproduzindo faixa " + musica);
    }

}
