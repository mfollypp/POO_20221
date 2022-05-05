package ExercicioClassesGenericasAninhadasEnumeracoes.Ex1v2;

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
    
//    public DiaDaSemana(DiasDaSemana dia){
//        this.dia = dia;
//    }
    
    DiasDaSemana getDia(){
        return this.dia;
    }
}