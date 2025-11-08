public class Main {
    // carro
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "BYD";
        carro.modelo = "Dolphin";
        carro.setAno(2024);
        carro.numeroPortas = 4;

        // moto

        Moto moto = new Moto();

        moto.marca = "Yamaha";
        moto.modelo = "R15 ABS";
        moto.setAno(2025);
        moto.setCilindrada(500);

        System.out.println(carro.InformacoesVeiculos());
        System.out.println(moto.InformacoesVeiculos());

    }

}
