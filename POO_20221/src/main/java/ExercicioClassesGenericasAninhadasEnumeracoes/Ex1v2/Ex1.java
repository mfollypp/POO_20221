package ExercicioClassesGenericasAninhadasEnumeracoes.Ex1v2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
//        DiaDaSemana dds = new DiaDaSemana(DiasDaSemana.SEG);
//        printaDia(dds);
        DiaDaSemana dds = new DiaDaSemana();
        
        dds.setDia(DiasDaSemana.QUA);
        printaDia(dds);
        dds.setDia(DiasDaSemana.DOM);
        printaDia(dds);
        
        criaChecaDia();
        criaChecaDia();
    }
    
    public static void printaDia(DiaDaSemana dds){
        if(dds.ehDiaUtil()){
            System.out.println(dds.getDia() + " e dia util!");
        }
        else{
            System.out.println(dds.getDia() + " nao e dia util!");
        }
    }
    
    public static void criaChecaDia(){
        DiaDaSemana diaDS = new DiaDaSemana();
        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("Entre com o dia que deseja checar se e util ou nao:");
        str = input.nextLine();
        
        if(str.toLowerCase().equals("segunda") || str.toLowerCase().equals("seg")){
            diaDS.setDia(DiasDaSemana.SEG);
            printaDia(diaDS);
        }
        if(str.toLowerCase().equals("terca") || str.toLowerCase().equals("ter")){
            diaDS.setDia(DiasDaSemana.TER);
            printaDia(diaDS);
        }
        if(str.toLowerCase().equals("quarta") || str.toLowerCase().equals("qua")){
            diaDS.setDia(DiasDaSemana.QUA);
            printaDia(diaDS);
        }
        if(str.toLowerCase().equals("quinta") || str.toLowerCase().equals("qui")){
            diaDS.setDia(DiasDaSemana.QUI);
            printaDia(diaDS);
        }
        if(str.toLowerCase().equals("sexta") || str.toLowerCase().equals("sex")){
            diaDS.setDia(DiasDaSemana.SEX);
            printaDia(diaDS);
        }
        if(str.toLowerCase().equals("sabado") || str.toLowerCase().equals("sab")){
            diaDS.setDia(DiasDaSemana.SAB);
            printaDia(diaDS);
        }
        if(str.toLowerCase().equals("domingo") || str.toLowerCase().equals("dom")){
            diaDS.setDia(DiasDaSemana.DOM);
            printaDia(diaDS);
        }
    }
}