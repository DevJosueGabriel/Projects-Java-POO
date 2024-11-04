package projetopessoas;
public class ProjetoPessoas{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(20);

        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setIdade(18);

        
        p3.setNome("Cláudio");
        p3.setSexo("M");
        p3.setIdade(35);

        p4.setNome("Fabiana");
        p4.setSexo("M");
        p4.setIdade(35);

        System.out.println("Nome: " + p1.getNome() + " Sexo: " + p1.getSexo() + " Idade: " + p1.getIdade());
        System.out.println("Nome: " + p2.getNome() + " Sexo: " + p2.getSexo() + " Idade: " + p2.getIdade());
        System.out.println("Nome: " + p3.getNome() + " Sexo: " + p3.getSexo() + " Idade: " + p3.getIdade());
        System.out.println("Nome: " + p4.getNome() + " Sexo: " + p4.getSexo() + " Idade: " + p4.getIdade());

        
    }
}
