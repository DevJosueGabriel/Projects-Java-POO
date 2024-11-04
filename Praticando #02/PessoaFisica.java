public class PessoaFisica extends Pessoa {
    private long cpf;

    @Override
    public void fazerLogin(){
        System.out.println("Login de Pessoa Física efetuado com sucesso!");
    }
    @Override
    public void printarDados(){
      System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() + "\nCPF: " + getCpf());
    }
    
    public long getCpf() {
      return this.cpf;
    }
    public void setCpf(long cpf) {
      this.cpf = cpf;
    }
}