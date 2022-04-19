package ExercicioConstrutor.Ex4;

public class Main {
    public static void main(String[] args) {
        Data data11 = new Data(11, 03, 1998);
        Data data12 = new Data(21, 06, 1984);
        
        Data data21 = new Data("Março", 11, 1998);
        Data data22 = new Data("Junho", 06, 1984);
        
        Data data31 = new Data(123, 2022);
        Data data32 = new Data(321, 2022);
        
        System.out.println(data11.getData1());
        System.out.println(data12.getData1());
        
        System.out.println(data21.getData2());
        System.out.println(data22.getData2());
        
        System.out.println(data31.getData3());
        System.out.println(data32.getData3());
    }
}