package ExercicioJavaAPI.Ex3;

import java.util.Scanner;

public class Ex3 {
    public static void printaAgenda(Agenda agenda){
        for(Compromisso comp : agenda.getAgenda()){
            System.out.println("Titulo: " + comp.getTitulo());
            System.out.println("Descricao: " + comp.getDescricao());
            System.out.println("Local: " + comp.getLocal());
            System.out.println("Data: " + comp.getData());
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        String titulo;
        String descricao;
        String local;
        String data;
        String checa;
        Scanner input = new Scanner(System.in);
        
        Agenda agenda = new Agenda();
        
        while(true){
            System.out.println("Deseja inserir um compromisso?");
            checa = input.nextLine();
            if(checa.equals("nao") || checa.equals("n")) break;
            
            System.out.println("Digite o titulo do compromisso:");
            titulo = input.nextLine();
            System.out.println("Digite uma descricao do compromisso:");
            descricao = input.nextLine();
            System.out.println("Digite o local do compromisso:");
            local = input.nextLine();
            System.out.println("Digite a data do compromisso:");
            data = input.nextLine();
            
            agenda.addAgenda(titulo, descricao, local, data);
        }
        
        System.out.println("Agenda de compromissos:");
        System.out.println("");
        printaAgenda(agenda);
    }
}