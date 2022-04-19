package ExercicioConstrutor.Ex3.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        Contato matheus = new Contato("Matheus", "98888-4444");
        agenda.addContato(matheus);
        
        agenda.printAgenda();
        
        Contato joao = new Contato("Joao", "97777-3333");
        agenda.addContato(joao);
        
        agenda.printAgenda();
    }
}