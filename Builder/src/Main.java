public class Main {
    public static void main(String[] args) {
        Carro c1 = new CarroBuilder()
                .setChassi("Teste")
                .setAnoFabricacao("2020")
                .setCor("Vermelho")
                .setNumeroPortas(4)
                .build();

        System.out.println(c1);
    }
}
