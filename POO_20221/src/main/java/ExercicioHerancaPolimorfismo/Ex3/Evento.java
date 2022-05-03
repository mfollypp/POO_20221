package ExercicioHerancaPolimorfismo.Ex3;

import java.util.ArrayList;
import java.util.Calendar;

public class Evento {
    static final int MAX_PALESTRA = 4;
    private Calendar dataInicio;
    private Calendar dataFim;
    private Calendar horaInicio;
    private Calendar horaFim;
    private static Evento unicaInstancia;
    private ArrayList<Palestra> palestras = new ArrayList<Palestra>();
    static int qtdPalestra = 0;

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
            System.out.print("Numero maximo de palestras no evento ja foi atingido! ");
            System.out.println(titulo + " nao pode ser adicionada!");
            System.out.println("");
        }
    }
    
    void palestrasInscrito(Object participante){
        if(participante instanceof Aluno){
            System.out.println("Palestras que o " + ((Aluno) participante).getNome() + " esta inscrito:");
            for(Palestra pal : palestras){
                for(Object part : pal.getParticipantes()){
                    if(part instanceof Aluno){ //Se remover essa linha da erro de "cast" (Professor cannot be cast to Aluno por exemplo)
                        if(((Aluno) part).getNome().equals(((Aluno) participante).getNome())){
                            System.out.println(pal.getTitulo());
                        }
                    }
                }
            }
        }
        if(participante instanceof Professor){
            System.out.println("Palestras que o " + ((Professor) participante).getNome() + " esta inscrito:");
            for(Palestra pal : palestras){
                for(Object part : pal.getParticipantes()){
                    if(part instanceof Professor){ //Se remover essa linha da erro de "cast"
                        if(((Professor) part).getNome().equals(((Professor) participante).getNome())){
                            System.out.println(pal.getTitulo());
                        }
                    }
                }
            }
        }
        if(participante instanceof Funcionario){
            System.out.println("Palestras que o " + ((Funcionario) participante).getNome() + " esta inscrito:");
            for(Palestra pal : palestras){
                for(Object part : pal.getParticipantes()){
                    if(part instanceof Funcionario){
                        if(((Funcionario) part).getNome().equals(((Funcionario) participante).getNome())){
                            System.out.println(pal.getTitulo());
                        }
                    }
                }
            }
        }
    }
    
    void printaPalestras(){
        for(Palestra pal : palestras){
            System.out.println("Participantes da palestra " + pal.getTitulo() + ":");
            for(Object part : pal.getParticipantes()){
                if(part instanceof Aluno){
                    System.out.println(((Aluno) part).getNome());
                }
                if(part instanceof Professor){
                    System.out.println(((Professor) part).getNome());
                }
                if(part instanceof Funcionario){
                    System.out.println(((Funcionario) part).getNome());
                }
            }
            System.out.println("");
        }
        System.out.println("");
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
    
    ArrayList<Palestra> getPalestras(){
        return this.palestras;
    }
    
}