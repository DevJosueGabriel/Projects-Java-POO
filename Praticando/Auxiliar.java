public class Auxiliar extends Pessoa {
@Override
public void printarNome(){
    System.out.println("Nome do auxiliar: " + getNome());
}
@Override
public void printarIdade(){
    System.out.println("Idade do auxiliar: " + getIdade());
}
@Override
public void printarSetor(){
    System.out.println("Salário do auxiliar: " + getSalario());
}
@Override
public void printarSalario(){
    System.out.println("O salário de auxiliar é: " + getSalario());
}
}
