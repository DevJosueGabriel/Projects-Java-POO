public class PessoaJuridica extends Pessoa{
    private long cnpj;

    @Override
    public void fazerLogin(){
        System.out.println("Login de Pessoa Jurídica efetuado com sucesso!");
    }
    @Override
    public void printarDados(){
      System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() + "\nCNPJ: " + getCnpj());
    }
    public long getCnpj() {
        return this.cnpj;
}
public void setCnpj(long cnpj){
    this.cnpj = cnpj;
}
}