package veiculosEcliente;

public class Veiculos {
    private String placa;
    private String cor;
    private int numPag;
    private float capTanque;
    private int velocidadeMax;
    private float consumoMedio;

    public Veiculos() {
    }

    public Veiculos(String placa, String cor, int numPag, float capTanque, int velocidadeMax, float consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numPag = numPag;
        this.capTanque = capTanque;
        this.velocidadeMax = velocidadeMax;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public float getCapTanque() {
        return capTanque;
    }

    public void setCapTanque(float capTanque) {
        this.capTanque = capTanque;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public float getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(float consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculos [placa=" + placa + ", cor=" + cor + ", numPag=" + numPag + ", capTanque=" + capTanque
                + ", velocidadeMax=" + velocidadeMax + ", consumoMedio=" + consumoMedio + "]";
    }
}
