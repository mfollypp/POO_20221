package ExercicioClassesGenericasAninhadasEnumeracoes.Ex2;

public class Par <F, S > {
    private F varF;
    private S varS;
    
    public Par(F varF, S varS){
        this.varF = varF;
        this.varS = varS;
    }
    
    void setValorF(F var){
        this.varF = var;
    }
    
    void setValorS(S var){
        this.varS = var;
    }
    
    F getValorF(){
        return this.varF;
    }
    
    S getValorS(){
        return this.varS;
    }
}