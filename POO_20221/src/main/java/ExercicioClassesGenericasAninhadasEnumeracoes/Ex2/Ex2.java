package ExercicioClassesGenericasAninhadasEnumeracoes.Ex2;

public class Ex2 {
    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<String, Integer>("Dez", 10);
        Par<Double, String> par2 = new Par<Double, String>(5.0, "Cinco");
        
        System.out.println(par1.getValorF() + " = " + par1.getValorS());
        System.out.println(par2.getValorF() + " = " + par2.getValorS());
    }
}