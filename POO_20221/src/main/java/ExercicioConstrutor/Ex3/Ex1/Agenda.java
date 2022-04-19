package ExercicioConstrutor.Ex3.Ex1;

public class Agenda {
    private int i = 0;
    Contato agenda[] = new Contato[10];
    
    void addContato(Contato contato){
        if(i < 10){
            agenda[i] = new Contato();
            agenda[i] = contato;
            i++;
        }
    }
    
    void printAgenda(){
        System.out.println("Agenda:");
        for(int j = 0; j < agenda.length; j++){
            if(agenda[j] != null){
                System.out.println("-Contato " +(j+1)+ ":");
                System.out.println("-Nome: " +agenda[j].getNome());
                System.out.println("-Numero: " +agenda[j].getNumero());
                System.out.println();
            }
        }
    }
}
