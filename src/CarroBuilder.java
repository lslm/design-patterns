public class CarroBuilder {
    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public CarroBuilder setNumeroPortas(int numeroPortas) {
        carro.setNumeroPortas(numeroPortas);
        return this;
    }

    public CarroBuilder setChassi(String chassi) {
        carro.setChassi(chassi);
        return this;
    }

    public CarroBuilder setAnoFabricacao(String anoFabricacao) {
        carro.setAnoFabricacao(anoFabricacao);
        return this;
    }

    public CarroBuilder setCor(String cor) {
        carro.setCor(cor);
        return this;
    }

    public Carro build() {
        return carro;
    }
}
