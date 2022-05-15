package ExercicioClassesAbstratasInterfaces.Ex5;

public class ItemVenda implements Recebivel {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double totalizarReceita(){
        return quantidade * precoUnitario;
    }
    
    @Override
    public void printaReg(){
        System.out.println("Item Venda: ");
        System.out.println("Nome produto: " + this.produto);
        System.out.println("Quantidade produto: " + this.quantidade);
        System.out.println("Preco por produto: " + this.precoUnitario);
        System.out.println("");
    }
}