public class GerenciadorDeCarteira{
    public static void main(String[] args){
    Pessoa p1;
    p1 = new Pessoa();
    p1.nome = "Josué Gabriel";
    p1.idade = 22;
    p1.profissao = "Assistente Administrativo";
    p1.dinheiroNaCarteira = 5000;
    System.out.println("Salário de " + p1.nome + " = " + p1.dinheiroNaCarteira);
    p1.receber(2200);
    System.out.println(p1.nome + " tem " + p1.dinheiroNaCarteira + " reais.");
    p1.gastar(200);
    System.out.println(p1.nome + " tem " + p1.dinheiroNaCarteira + " reais.");
    Pessoa p2 = new Pessoa();
    p2.nome = "João Silveira";
    p2.idade = 30;
    p2.profissao = "Delegado";
    p2.dinheiroNaCarteira = 20000;
    System.out.println("Salário de " + p2.nome + " = " + p2.dinheiroNaCarteira);
    p2.receber(400);
    System.out.println(p2.nome + " tem " + p2.dinheiroNaCarteira + " reais");
    p2.gastar(500);
    System.out.println(p2.nome + " tem agora " + p2.dinheiroNaCarteira + " reais");
}
}