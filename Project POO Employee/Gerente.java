public class Gerente extends Pessoa {
@Override
public void printarNome(){
System.out.println("Nome do gerente: " + getNome());
}
@Override
public void printarIdade(){
System.out.println("Idade do gerente: " + getIdade());
}
@Override
public void printarSetor(){
System.out.println("Setor do gerente: " + getSetor());
}  
@Override
public void printarSalario(){
System.out.println("O salário de gerente é: " + getSalario() * 2);
}
}

