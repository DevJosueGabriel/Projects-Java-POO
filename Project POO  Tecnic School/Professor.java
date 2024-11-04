public class Professor extends Pessoa {
    private String especialidade;
    private int salario;
    public void receberAumento(){
        int novoSalario = this.salario * 2;
        System.out.println("Seu salário recebeu aumento e será de: " + novoSalario);
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}