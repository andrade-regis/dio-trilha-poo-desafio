import aparelhos.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iPhone = new Iphone();

        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.ligar("11 97070 7070");
        LinhaEmBranco();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("MTG Chihiro - Billie Eilish");
        LinhaEmBranco();

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("www.google.com");
        iPhone.atualizarPagina();
        LinhaEmBranco();
        
        Ipad iPad = new Ipad();

        iPad.tocar();
        iPad.pausar();
        iPad.selecionarMusica("MTG Chihiro - Billie Eilish");
        LinhaEmBranco();
        
        iPad.adicionarNovaAba();
        iPad.exibirPagina("www.google.com");
        iPad.atualizarPagina();

    }

    private static void LinhaEmBranco(){
        System.out.println("");
    }
}
