package ExercicioAtributosMetodosEstaticos.Ex3;

import java.util.ArrayList;
import java.util.Calendar;

public class Evento {
    static final int MAX_PALESTRA = 6;
    private Calendar dataInicio;
    private Calendar dataFim;
    private Calendar horaInicio;
    private Calendar horaFim;
    private static Evento unicaInstancia;
    private ArrayList<Palestra> palestras = new ArrayList<Palestra>();
    private int qtdPalestra = 0;

    //Construtor private para poder instanciar somente um evento atraves do Singleton, para instanciar faz: Evento nomeEvento = Evento.getInstance();
    private Evento(Calendar dataInicio, Calendar dataFim, Calendar horaInicio, Calendar horaFim){
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    //"Singleton" Design Pattern: possibilita instanciar somente um objeto, ele checa se a unicaInstancia ja foi criada, se nao foi, entao cria
    public static synchronized Evento getInstance(Calendar dataInicio, Calendar dataFim, Calendar horaInicio, Calendar horaFim){
	if(unicaInstancia == null){
            unicaInstancia = new Evento(dataInicio, dataFim, horaInicio, horaFim);
	}
        return unicaInstancia;
    }
    
    void addPalestra(String titulo, String nomePalestrante, String local, Calendar dia, Calendar hora, int duracao){
        qtdPalestra++;
        if(this.qtdPalestra < Evento.MAX_PALESTRA){
            Palestra palestra = new Palestra(titulo, nomePalestrante, local, dia, hora, duracao);
            this.palestras.add(palestra);
        }
        else{
            System.out.println("Numero maximo de palestras no evento ja foi atingido!");
        }
    }
    
    void palestrasInscrito(Participante participante){
        System.out.println("Palestras que o " + participante.getNome() + " esta inscrito:");
        for(Palestra pal : palestras){
            for(Participante part : pal.getParticipantes()){
                if(part.getNome().equals(participante.getNome())){
                    System.out.println(pal.getTitulo());
                }
            }
        }
    }
    
    void printaPalestras(){
        for(Palestra pal : palestras){
            System.out.println("Participantes da palestra " + pal.getTitulo() + ":");
            for(Participante part : pal.getParticipantes()){
                System.out.println(part.getNome());
            }
        }
    }
    
    Calendar getDataInicio(){
        return this.dataInicio;
    }
    
    Calendar getDataFim(){
        return this.dataFim;
    }
    
    Calendar getHoraInicio(){
        return this.horaInicio;
    }
    
    Calendar getHoraFim(){
        return this.horaFim;
    }
    
}