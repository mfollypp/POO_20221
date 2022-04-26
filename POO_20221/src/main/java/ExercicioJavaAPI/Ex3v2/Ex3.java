package ExercicioJavaAPI.Ex3v2;

import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex3 {
    
    public static void printaAgenda(Agenda agenda, Calendar d){
        Scanner input = new Scanner(System.in);
        String tipoPrint;
        SimpleDateFormat formatoPadrao = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoExtenso = new SimpleDateFormat("dd MMMMM yyyy");

        System.out.println("Deseja printar a data por extenso?");
        tipoPrint = input.nextLine();
        
        System.out.println("Agenda de Compromissos:");
        System.out.println("");
        if(tipoPrint.equals("s") || tipoPrint.equals("sim")){
            for(Compromisso comp : agenda.getAgenda()){
                if(d.get(Calendar.DAY_OF_YEAR) == comp.getData().get(Calendar.DAY_OF_YEAR)){
                    System.out.println("Titulo: " + comp.getTitulo());
                    System.out.println("Descricao: " + comp.getDescricao());
                    System.out.println("Local: " + comp.getLocal());
                    System.out.println("Data por extenso: " + formatoExtenso.format(comp.getData().getTime()));
                    System.out.println("");
                }
            }
        }
        else{
            for(Compromisso comp : agenda.getAgenda()){
                if(d.get(Calendar.DAY_OF_YEAR) == comp.getData().get(Calendar.DAY_OF_YEAR)){
                    System.out.println("Titulo: " + comp.getTitulo());
                    System.out.println("Descricao: " + comp.getDescricao());
                    System.out.println("Local: " + comp.getLocal());
                    System.out.println("Data formatada: " + formatoPadrao.format(comp.getData().getTime()));
                    System.out.println("");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String titulo;
        String descricao;
        String local;
        String checa;
        String inputData;
//        int dia;
//        int mes;
//        int ano;
        
        DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        while(true){
            Calendar data = Calendar.getInstance();
            System.out.println("Deseja inserir um compromisso?");
            checa = input.nextLine();
            if(checa.equals("nao") || checa.equals("n")) break;
            
            System.out.println("Digite o titulo do compromisso:");
            titulo = input.nextLine();
            System.out.println("Digite uma descricao do compromisso:");
            descricao = input.nextLine();
            System.out.println("Digite o local do compromisso:");
            local = input.nextLine();
            System.out.println("Entre com a data do compromisso (dd/MM/yyyy):");
            inputData = input.nextLine();
            try{
                data.setTime(inputFormat.parse(inputData));
            }
            catch (ParseException except) {
                except.printStackTrace();
            }
//            System.out.println("Digite o dia, mes e ano do compromisso:"); //da input sozinho no "checa" qnd recomeça o while
//            dia = input.nextInt();
//            mes = input.nextInt();
//            ano = input.nextInt();
//            
//            data.set(ano, mes, dia);
            
            agenda.addAgenda(titulo, descricao, local, data);
        }
        System.out.println("Digite a data que deseja checar a agenda: (dd/MM/yyyy)");
        Calendar checaData = Calendar.getInstance();
        inputData = input.nextLine();
            try{
                checaData.setTime(inputFormat.parse(inputData));
            }
            catch (ParseException except) {
                except.printStackTrace();
            }
        printaAgenda(agenda, checaData);

    }
}