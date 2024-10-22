public class Funcionario {
    private String nome;
    private double salarioBase;

    public String getNome (){
        return nome;

    }
    public double calcularSalario(){
        return salarioBase;

    }
    public void getNome(String nome){
        this.nome = nome;

    }
    public void calcularSalario(double salarioBase){
        this.salarioBase = salarioBase;

    }


}
