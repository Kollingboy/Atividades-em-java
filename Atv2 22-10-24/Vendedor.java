public class Vendedor {
    private String nome;
    private double comissao;
    private double salarioBase;

    public String getNome (){
        return nome;

    }
    public double getComissao(){
        return this.comissao * 0.1;

    }
    public double getSalarioBase(){
        return salarioBase;

    }
    public void getComissao(double comissao){
        this.comissao = comissao;

    }
    public void getSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;

    }
    public void getNome(String nome){
        this.nome = nome;

    }
}
