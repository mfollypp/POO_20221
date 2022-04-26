package ExercicioJavaAPI.Ex3v2;

import java.util.ArrayList;
import java.util.Calendar;

public class Agenda {
    private ArrayList<Compromisso> agenda = new ArrayList<Compromisso>();
    
    void addAgenda(String titulo, String descricao, String local, Calendar data){
        Compromisso comp = new Compromisso(titulo, descricao, local, data);
        this.agenda.add(comp);
    }
    
    ArrayList<Compromisso> getAgenda(){
        return this.agenda;
    }
}