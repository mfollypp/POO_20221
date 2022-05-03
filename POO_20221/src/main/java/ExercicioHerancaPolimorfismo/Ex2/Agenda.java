package ExercicioHerancaPolimorfismo.Ex2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Object> contatos = new ArrayList<Object>();
    
    void addAgenda(Object obj){
        this.contatos.add(obj);
    }
    
    ArrayList<Object> getAgenda(){
        return this.contatos;
    }
    
    void printaAgenda(){
        for(Object obj : contatos){
            System.out.println("Contato:");
            if(obj instanceof PessoaFisica){
                System.out.println("    -Nome: " + ((PessoaFisica) obj).nome);
                System.out.println("    -CPF: " + ((PessoaFisica) obj).cpf);
                System.out.println("    -Endereco: " + ((PessoaFisica) obj).endereco);
                System.out.println("    -Aniversario: " + ((PessoaFisica) obj).aniversario);
            }
            if(obj instanceof PessoaJuridica){
                System.out.println("    -Razao Social: " + ((PessoaJuridica) obj).razaoSocial);
                System.out.println("    -CNPJ: " + ((PessoaJuridica) obj).cnpj);
                System.out.println("    -Endereco: " + ((PessoaJuridica) obj).endereco);
                System.out.println("    -Faturamento: R$" + ((PessoaJuridica) obj).faturamento);
            }
            System.out.println("");
        }
    }
    
    void procuraContato(int cadastro){
        for(Object obj : contatos){
            if(obj instanceof PessoaFisica){
                if(((PessoaFisica) obj).cpf == cadastro){
                    System.out.println("Contato Pessoa Fisica:");
                    System.out.println("    -Nome: " + ((PessoaFisica) obj).nome);
                    System.out.println("    -CPF: " + ((PessoaFisica) obj).cpf);
                    System.out.println("    -Endereco: " + ((PessoaFisica) obj).endereco);
                    System.out.println("    -Aniversario: " + ((PessoaFisica) obj).aniversario);
                }
            }
            if(obj instanceof PessoaJuridica){
                if(((PessoaJuridica) obj).cnpj == cadastro){
                    System.out.println("Contato Pessoa Juridica:");
                    System.out.println("    -Razao Social: " + ((PessoaJuridica) obj).razaoSocial);
                    System.out.println("    -CNPJ: " + ((PessoaJuridica) obj).cnpj);
                    System.out.println("    -Endereco: " + ((PessoaJuridica) obj).endereco);
                    System.out.println("    -Faturamento: R$" + ((PessoaJuridica) obj).faturamento);
                }
            }
        }
        System.out.println("");
    }
}