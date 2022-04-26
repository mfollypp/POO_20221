package ExercicioJavaAPI.Ex3v2;

import java.util.Calendar;

public class Compromisso {
    private String titulo;
    private String descricao;
    private String local;
    private Calendar data;
    
    public Compromisso(String titulo, String descricao, String local, Calendar data){
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.data = data;
}
    
    String getTitulo(){
        return this.titulo;
    }
    
    String getDescricao(){
        return this.descricao;
    }
    
    String getLocal(){
        return this.local;
    }
    
    Calendar getData(){
        return this.data;
    }
}