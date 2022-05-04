package ExercicioHerancaPolimorfismo.Ex2v2;

public class Ex2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        PessoaFisica matheus = new PessoaFisica("Matheus", 111111111, "Rua Tal", "11/03/1998");
        PessoaFisica folly = new PessoaFisica("Folly", 999999999, "Rua Aquela", "03/11/1998");
        
        PessoaJuridica peixoto = new PessoaJuridica("Peixoto & CIA", 123456, "Rua PJ", 10000);
        
        agenda.addAgenda(matheus);
        agenda.addAgenda(folly);
        agenda.addAgenda(peixoto);
        
        agenda.printaAgenda();
        
        agenda.procuraContato(111111111);
        agenda.procuraContato(123456);
    }
}