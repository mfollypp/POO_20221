package ExercicioHerancaPolimorfismo.Ex2v2;

public class PessoaFisica extends Contato {
    protected String nome;
    protected long cpf;
    protected String aniversario;
    
    public PessoaFisica(String nome, long cpf, String endereco, String aniversario){
        super(endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.aniversario = aniversario;
    }
}