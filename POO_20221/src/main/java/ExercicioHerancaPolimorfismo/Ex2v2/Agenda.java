package ExercicioHerancaPolimorfismo.Ex2v2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    void addAgenda(Contato cont){
        this.contatos.add(cont);
    }
    
    ArrayList<Contato> getAgenda(){
        return this.contatos;
    }
    
    void printaAgenda(){
        for(Contato cont : contatos){
            System.out.println("Contato:");
            if(cont instanceof PessoaFisica){
                System.out.println("    -Nome: " + ((PessoaFisica) cont).nome);
                System.out.println("    -CPF: " + ((PessoaFisica) cont).cpf);
                System.out.println("    -Endereco: " + ((PessoaFisica) cont).endereco);
                System.out.println("    -Aniversario: " + ((PessoaFisica) cont).aniversario);
            }
            if(cont instanceof PessoaJuridica){
                System.out.println("    -Razao Social: " + ((PessoaJuridica) cont).razaoSocial);
                System.out.println("    -CNPJ: " + ((PessoaJuridica) cont).cnpj);
                System.out.println("    -Endereco: " + ((PessoaJuridica) cont).endereco);
                System.out.println("    -Faturamento: R$" + ((PessoaJuridica) cont).faturamento);
            }
            System.out.println("");
        }
    }
    
    void procuraContato(int cadastro){
        for(Contato cont : contatos){
            if(cont instanceof PessoaFisica){
                if(((PessoaFisica) cont).cpf == cadastro){
                    System.out.println("Contato Pessoa Fisica:");
                    System.out.println("    -Nome: " + ((PessoaFisica) cont).nome);
                    System.out.println("    -CPF: " + ((PessoaFisica) cont).cpf);
                    System.out.println("    -Endereco: " + ((PessoaFisica) cont).endereco);
                    System.out.println("    -Aniversario: " + ((PessoaFisica) cont).aniversario);
                }
            }
            if(cont instanceof PessoaJuridica){
                if(((PessoaJuridica) cont).cnpj == cadastro){
                    System.out.println("Contato Pessoa Juridica:");
                    System.out.println("    -Razao Social: " + ((PessoaJuridica) cont).razaoSocial);
                    System.out.println("    -CNPJ: " + ((PessoaJuridica) cont).cnpj);
                    System.out.println("    -Endereco: " + ((PessoaJuridica) cont).endereco);
                    System.out.println("    -Faturamento: R$" + ((PessoaJuridica) cont).faturamento);
                }
            }
        }
        System.out.println("");
    }
}