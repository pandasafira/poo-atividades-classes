public abstract class Veiculo {
    // atributos
    public String marca;
    public String modelo;
    private int ano;

    // métodos
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract String InformacoesVeiculos();
}