package ExercicioAtributosMetodosEstaticos.Ex3;

import java.util.ArrayList;
import java.util.Calendar;

public class Palestra {
    private String titulo;
    private String nomePalestrante;
    private String local;
    private Calendar dia;
    private Calendar hora;
    private int duracao; //minutos
    static final int MAX_PARTICIPANTES = 5;
    private int qtdParticipantes = 0;
    private ArrayList<Participante> participantes = new ArrayList<Participante>();
    
    public Palestra(String titulo, String nomePalestrante, String local, Calendar dia, Calendar hora, int duracao){
        this.titulo = titulo;
        this.nomePalestrante = nomePalestrante;
        this.local = local;
        this.dia = dia;
        this.hora = hora;
        this.duracao = duracao;
    }
    
    int vagasPalestra(){
        return Palestra.MAX_PARTICIPANTES - this.qtdParticipantes;
    }
    
    String getTitulo(){
        return this.titulo;
    }
    
    String nomePalestrante(){
        return this.nomePalestrante;
    }
    
    String getLocal(){
        return this.local;
    }
    
    Calendar getDia(){
        return this.dia;
    }
    
    Calendar getHora(){
        return this.hora;
    }
    
    int duracao(){
        return this.duracao;
    }
    
    ArrayList<Participante> getParticipantes(){
        return this.participantes;
    }
    
    int getQtdParticipantes(){
        return this.qtdParticipantes;
    }
    
    void setInscreveParticipante(){
        this.qtdParticipantes++;
    }
}