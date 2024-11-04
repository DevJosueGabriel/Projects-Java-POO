public class Bolsista extends Aluno {
    private int bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de  " + this.getNome());
    }
    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! PAgamento facilitado");
    }
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
