package ExercicioJavaAPI.Ex3;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Compromisso> agenda = new ArrayList<Compromisso>();
    
    void addAgenda(String titulo, String descricao, String local, String data){
        Compromisso comp = new Compromisso(titulo, descricao, local, data);
        this.agenda.add(comp);
    }
    
    ArrayList<Compromisso> getAgenda(){
        return this.agenda;
    }
}