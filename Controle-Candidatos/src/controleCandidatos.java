import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class controleCandidatos {
    public static void main(String[] args) throws Exception {
        // Corrigido para List<String> em vez de String[]
        List<String> candidatosSelecionados = selecaoCandidatos();
        
        // Exibe os candidatos selecionados
        System.out.println("\nCandidatos selecionados:");
        for (String candidato : candidatosSelecionados) {
            System.out.println("O candidato " + candidato + " foi selecionado");
        }
        System.out.println("\n");
        
        for (String candidato : candidatosSelecionados) {
            entrandoEmContato(candidato);
            System.out.println("\n");
        }
    }


    public static List<String> selecaoCandidatos() {
        String [] candidatos = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gustavo", "Helena", "Isabela", "João"};

        int candidatosAtual = 0;
        int candidatosSelecionados = 0;
        double salarioBase = 2000.00;

        List<String> candidatosSelecionadosList = new ArrayList<>();
        
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salario de " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionadosList.add(candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        return candidatosSelecionadosList;
    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                System.out.println("Tentativa " + tentativasRealizadas + " de contato com " + candidato + " falhou.");
                tentativasRealizadas++;
            } 

            else {
                System.out.println("O candidato " + candidato + " atendeu.");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (!atendeu) {
            System.out.println("Não conseguimos contato com o candidato " + candidato + " após 3 tentativas.");
        }
    }


    public static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }



    public static void analisarCandidato(double salarioProposto) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioProposto)
            System.out.println("LIGAR PARA O CANDIDATO");

        else if (salarioBase == salarioProposto)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            
        else
            System.out.println("ESPERAR DEMAIS CANDIDATOS");
    }
}
