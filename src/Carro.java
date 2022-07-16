public class Carro {
    private int numeroPortas;
    private String chassi;
    private String anoFabricacao;
    private String cor;

    public Carro(int numeroPortas, String chassi, String anoFabricacao) {
        this.numeroPortas = numeroPortas;
        this.chassi = chassi;
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }


    public String getAnoFabricacao() {
        return anoFabricacao;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
}
