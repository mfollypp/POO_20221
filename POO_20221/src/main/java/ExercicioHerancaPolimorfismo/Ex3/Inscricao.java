package ExercicioHerancaPolimorfismo.Ex3;

public class Inscricao {
    
    static void inscreve(Object participante, Palestra palestra){
        palestra.setInscreveParticipante();
        if(palestra.getQtdParticipantes() < Palestra.MAX_PARTICIPANTES){
            palestra.getParticipantes().add(participante);
        }
        else{
            System.out.println("Essa palestra ja tem a capacidade maxima de participantes!");
            System.out.println("");
        }
    }
}