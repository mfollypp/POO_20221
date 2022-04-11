package ExercicioPoo.Ex7;

public class Pedido {
    Item pedido[] = new Item[10];
    private int i = 0;
    
    void addItem(Produto prod, int qtd){
        Item item = new Item();
        item.produto = prod;
        if(qtd > prod.qtdEstoque){
            System.out.println("Nao tem " + item.produto.nome + " suficiente");
            return;
        }
        item.qtdItem = qtd;
        prod.qtdEstoque = prod.qtdEstoque - qtd;
        pedido[i++] = item;
    }
    
    double printaPedido(){
        double somaPedido = 0;
        System.out.println("Lista de pedido:");
        for(int j = 0; pedido[j] != null; j++){
            System.out.println(pedido[j].qtdItem + "x " + pedido[j].produto.nome + " = R$" + (pedido[j].qtdItem*pedido[j].produto.preco));
            somaPedido += pedido[j].qtdItem * pedido[j].produto.preco;
        }
        System.out.println("Valor total = R$" + somaPedido);
        System.out.println();
        return somaPedido;
    }
}