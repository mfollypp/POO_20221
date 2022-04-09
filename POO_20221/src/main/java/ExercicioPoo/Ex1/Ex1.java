package ExercicioPoo.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.addContato();
        agenda.printAgenda();
        
        agenda.addContato();
        agenda.addContato();
        agenda.printAgenda();
    }
}
