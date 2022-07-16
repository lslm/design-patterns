public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro(4, "034x034", "2022");

        c1.getCor();
        c1.getAnoFabricacao();
        c1.getChassi();
        c1.getNumeroPortas();

        c1.setCor("Vermelho");
        c1.getCor();
    }
}
