public class GerenciarConta{
    public static void main(String[] args){
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000;
        System.out.println("Saldo atual: " + minhaConta.saldo);
        double novoSaldo = 5000;

        if(novoSaldo < 0){
            System.out.println("Não posso mudar para esse saldo");
        } else{
            minhaConta.saldo = novoSaldo;
            System.out.println("Meu saldo atual é: " + minhaConta.saldo);
        }
        
    }
}