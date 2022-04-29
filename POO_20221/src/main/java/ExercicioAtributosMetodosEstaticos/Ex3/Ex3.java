package ExercicioAtributosMetodosEstaticos.Ex3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex3 {
    public static void main(String[] args) {
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
        
        
        
    }
    
    public static void printaInfoEvento(Evento evento){
        SimpleDateFormat dia = new SimpleDateFormat("EEE");
        SimpleDateFormat hora = new SimpleDateFormat("HH");
        System.out.print("De " + dia.format(evento.getDataInicio().getTime()).toUpperCase());
        System.out.print(" a " + dia.format(evento.getDataFim().getTime()).toUpperCase());
        System.out.print(" das " + hora.format(evento.getHoraInicio().getTime()));
        System.out.println("h as " + hora.format(evento.getHoraFim().getTime()) + "h");
    }
}