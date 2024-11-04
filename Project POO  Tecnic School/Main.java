import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Aluno a1 = new Aluno();
    Bolsista b1 = new Bolsista();
    Visitante v1 = new Visitante();
    
    v1.setNome("Matheus");
    v1.setIdade(22);
    v1.setSexo("Masculino");
    System.out.println(v1.toString());

    a1.setNome("Cláudio");
    a1.setMatricula(456);
    a1.setCurso("Informática");
    a1.setSexo("Masculino");
    a1.setIdade(22);

    b1.setMatricula(12);
    b1.setNome("Josué");
    b1.setBolsa(125);
    b1.setSexo("Masculino");
    b1.PagarMensalidade();

    Professor p1 = new Professor();
    p1.setSalario(2500);
    p1.setNome("José");
    p1.receberAumento();
    }
}
