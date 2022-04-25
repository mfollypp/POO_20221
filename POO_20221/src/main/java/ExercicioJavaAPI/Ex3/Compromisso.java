package ExercicioJavaAPI.Ex3;

public class Compromisso {
    private String titulo;
    private String descricao;
    private String local;
    private String data;
    
    public Compromisso(String titulo, String descricao, String local, String data){
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
    
    String getData(){
        return this.data;
    }
}