package ExercicioAtributosMetodosEstaticos.Ex3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar dataInicio = Calendar.getInstance();
        dataInicio.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        Calendar dataFim = Calendar.getInstance();
        dataFim.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        Calendar horaInicio = Calendar.getInstance();
        horaInicio.set(Calendar.HOUR_OF_DAY, 9);
        Calendar horaFim = Calendar.getInstance();
        horaFim.set(Calendar.HOUR_OF_DAY, 17);
        
        Evento semanaComputacao = Evento.getInstance(dataInicio, dataFim, horaInicio, horaFim);
        printaInfoEvento(semanaComputacao);
        
        semanaComputacao.addPalestra("Iniciacao Cientifica", "Vania", "IC-UFF", dataInicio, horaInicio, 30);
        semanaComputacao.addPalestra("Metodologia", "Peixoto", "Auditorio", dataInicio, horaFim, 50);
        semanaComputacao.addPalestra("Engenharia de Software", "Paula", "Sala 205", dataFim, horaInicio, 70);
        semanaComputacao.addPalestra("Game Dev", "Joao", "Xbox Company", dataFim, horaFim, 40);
        
//        semanaComputacao.printaPalestras();
        
        for(Palestra pal : semanaComputacao.getPalestras()){
            Participante matheus = new Participante(1234, "Matheus", "matheus@gmail", "Aluno");
            Participante rafael = new Participante(4321, "Rafael", "rafael@gmail", "Professor");
            Participante artur = new Participante(2314, "Artur", "artur@gmail", "Aluno");
            Inscricao.inscreve(matheus, pal);
            Inscricao.inscreve(rafael, pal);
            Inscricao.inscreve(artur, pal);
        }
        
//        semanaComputacao.printaPalestras();
        
        Participante gabriel = new Participante(3241, "Gabriel", "gabriel@gmail", "Aluno");
        Inscricao.inscreve(gabriel, semanaComputacao.getPalestras().get(0));
        Inscricao.inscreve(gabriel, semanaComputacao.getPalestras().get(1));
//        semanaComputacao.palestrasInscrito(gabriel);
        
        semanaComputacao.printaPalestras();
        
        semanaComputacao.palestrasInscrito(gabriel);
        
    }
    
    public static void printaInfoEvento(Evento evento){
        SimpleDateFormat dia = new SimpleDateFormat("EEE");
        SimpleDateFormat hora = new SimpleDateFormat("HH");
        System.out.print("Evento ocorrera de " + dia.format(evento.getDataInicio().getTime()).toUpperCase());
        System.out.print(" a " + dia.format(evento.getDataFim().getTime()).toUpperCase());
        System.out.print(" das " + hora.format(evento.getHoraInicio().getTime()));
        System.out.println("h as " + hora.format(evento.getHoraFim().getTime()) + "h");
        System.out.println("");
    }
}