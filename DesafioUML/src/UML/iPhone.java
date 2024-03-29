package UML;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
    	System.out.println("Tocando");
    }

    @Override
    public void pausar() {
    	System.out.println("Pause");
    }

    @Override
    public void selecionarMusica() {
    	System.out.println("Selecionar Musica");
    }

    @Override
    public void ligar() {
    	System.out.println("Ligando");
    }

    @Override
    public void atender() {
    	System.out.println("Atendeu");
    }

    @Override
    public void iniciarCorreioVoz() {
    	System.out.println("Voz");
    }

    @Override
    public void exibirPagina() {
    	System.out.println("Pagina abrindo");
    }

    @Override
    public void adicionarNovaAba() {
    	System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
    	System.out.println("F5");
    }
}