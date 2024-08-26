import funcionalidades.aparelhoTelefonico;
import funcionalidades.navegarInternet;
import funcionalidades.reprodutorMusical;

public class celular {
    public static void main(String[] args) {
        System.out.println("Reprodutor Musical");
        reprodutorMusical reprodutorMusical = new reprodutorMusical();
        reprodutorMusical.pausar();
        reprodutorMusical.tocar();
        reprodutorMusical.selecionarMusica("Angra");

        System.out.println("\nAparelho Telefonico");
        aparelhoTelefonico aparelhoTelefonico = new aparelhoTelefonico();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar("840202334");
        aparelhoTelefonico.iniciarCorreioDeVoz();

        System.out.println("\nNavegar na Internet");
        navegarInternet navegarInternet = new navegarInternet();
        navegarInternet.adicionarNovaAba();
        navegarInternet.atualizarPagina();
        navegarInternet.exibirPagina("Google");

    }
}
