public class Produto {
    private String descricao;
    private Tipo tipo;
    private double preco;
    private double imposto;

    public Produto(){

    }

    public void setDescricao(String n){
        descricao = n;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setTipo(Tipo t){
        tipo = t;
        setImposto(preco * tipo.getPercentual() / 100);
    }
    private void setImposto(double i){
        imposto = i;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public void setPreco(double p){
        preco = p;
    }
    public double getPreco(){
        return preco;
    }
    public double getImposto(){
        return imposto;
    }
    public double calculaPrecoFinal(){
        return preco + imposto;
    }
}
