public class Main {
    public static void main(String[] args){
        Carro meuCarro = new Corsa("Azul" , "Chevrolet" , "corsa", true);
        Carro seuCarro = new Carro("verde", "Fiat", "Uno");

        ((Corsa) meuCarro).imprimir();



    }
}
