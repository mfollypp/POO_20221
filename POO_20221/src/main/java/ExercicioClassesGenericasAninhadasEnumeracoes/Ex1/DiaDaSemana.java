package ExercicioClassesGenericasAninhadasEnumeracoes.Ex1;

public class DiaDaSemana {
    private DiasDaSemana dia;
    
    boolean ehDiaUtil(){
        if(this.dia != dia.SAB && this.dia != dia.DOM){
            return true;
        }
        return false;
    }
    
    void setDia(DiasDaSemana dia){
        this.dia = dia;
    }
}