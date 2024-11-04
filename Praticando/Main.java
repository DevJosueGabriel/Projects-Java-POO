public class Main {
    public static void main(String[] args){
    Gerente g = new Gerente();
    g.setNome("Josué");
    g.setIdade(14);
    g.setSalario(2200);
    g.setSetor("Administrativo");

    System.out.println("\n-----Gerente-----");
   g.printarNome();
   g.printarIdade();
   g.printarSetor();
   g.printarSalario();

    Auxiliar a = new Auxiliar();
    a.setNome("Matheus");
    a.setIdade(20);
    a.setSalario(2200);
    a.setSetor("Administrativo");

    System.out.println("\n-----Auxiliar-----");
    a.printarNome();
    a.printarIdade();
    a.printarSetor();
    a.printarSalario();
    }
}
