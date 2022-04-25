package ExercicioJavaAPI.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeCompras {
    private ArrayList<String> lista = new ArrayList<String>();
    
    void addLista(String produto){
        if(this.lista.contains(produto.toLowerCase())){
            System.out.println("Produto ja esta na lista");
        }
        else{
            this.lista.add(produto.toLowerCase());
        }
    }
    
    void imprimirListaDeCompras(){
        Collections.sort(lista);
        for(String produto : lista){
            System.out.println("Produto: " + produto);
        }
    }
    
    ArrayList<String> getLista(){
        return this.lista;
    }
}