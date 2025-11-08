public class Carro extends Veiculo {
    public int numeroPortas;

    @Override
    public String InformacoesVeiculos() {
        return "Carro: " + marca + " " + modelo +
                " | Ano: " + getAno() +
                " | Portas: " + numeroPortas;
    }

}
