public class Moto extends Veiculo {
    private int Cilindrada;

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.Cilindrada = cilindrada;
    }

    @Override
    public String InformacoesVeiculos() {
        return "Moto: " + marca + " " + modelo +
                " | Ano: " + getAno() +
                " | Cilindrada: " + Cilindrada + "cc";
    }
}