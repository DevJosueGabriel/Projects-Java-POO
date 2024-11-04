import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {
    Vendedor v = new Vendedor();
    Freelancer f = new Freelancer();

    v.setNome("Carlos");
    v.setSalarioBase(2000);
    v.setComissao(3000);

    System.out.println("Salário vendedor: " + obterSalarioDoFuncionario(v));

    f.setNome("Clara");
    f.setDiasTrabalhados(20);
    f.setValorDia(150);

    System.out.println("Salário free lancer: " + obterSalarioDoFuncionario(f));
    }
    
    public static float obterSalarioDoFuncionario(Funcionario funcionario){
        float resposta = funcionario.calcularSalarioFinal();
        return resposta;
    }
    
    
}
