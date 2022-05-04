package ExercicioHerancaPolimorfismo.Ex2v2;

public class PessoaJuridica extends Contato {
    protected String razaoSocial;
    protected int cnpj;
    protected double faturamento;
    
    public PessoaJuridica(String razaoSocial, int cnpj, String endereco, double faturamento){
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }
}