public class Gerente {
    private String nome;
    private double bonus;
    private double salarioBase;

    public String getNome (){
        return nome;

    }
    public double getBonus(){
        return bonus;

    }
    public double calcularSalario(){
        return this.salarioBase * 0.2;

    }
    public void getBonus(double bonus){
        this.bonus = bonus;

    }
    public void calcularSalario(double salarioBase){
        this.salarioBase = salarioBase;

    }
    public void getNome(String nome){
        this.nome = nome;

    }

}
