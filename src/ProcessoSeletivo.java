import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe", "Marcia", "Paulo"};
        for(String candidato : candidatos){
            entrandoEmCantato(candidato);
        }
    }

    static void entrandoEmCantato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativas++;
            } else{
                System.out.println("Contato realizado com sucesso");
            }
        }while(continuarTentando && tentativas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + "Na" + tentativas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato);
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Paulo"};

        System.out.println("Imprimindo lista de candidatos informando o indice do elemento");

        for(int i = 0; i < candidatos.length; i ++){
            System.out.println("O candidato de n" + (i+1) + " é o " + candidatos[i]);
        }

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado é o " + candidato);
        }
    }

    static void selecaoCanditados(){
        String [] candidatos = {"Felipe", "Marcia", "Paulo"};

        int cantidadosSelecionados = 0;
        int cantidadoAtua = 0;
        double salarioBase = 2000.0;
        while(cantidadosSelecionados < 5 && cantidadoAtua < candidatos.length){
            String cantidato = candidatos[cantidadoAtua];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + cantidato + " Solicitou este valor de salario: " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + cantidato + " foi selecionado");
                cantidadosSelecionados++;
            } 
            cantidadoAtua++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
