public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Ricardo");
        pf.setIdade(22);
        pf.setCpf(1234567891);
        pf.setSexo("Masculino");
        pf.printarDados();

        System.out.println("\n");
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Josué");
        pj.setIdade(24);
        pj.setSexo("Masculino");
        pj.setCnpj(00010651230010);
        pj.printarDados();
    }
}
