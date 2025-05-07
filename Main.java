public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();
        Carro carro = new Carro("gol","Quadrado",4,2020);
        Caminhao caminhao = new Caminhao("volvo", "FH",2018,25.0f);
        Motorista joao = new Motorista("João", "123456");
        Motorista ricardo = new Motorista("Ricardo", "654321");
            joao.atribuirVeiculo(carro);
            ricardo.atribuirVeiculo(caminhao);

            frota.adcionarVeiculo(carro);
            frota.adcionarVeiculo(caminhao);
            frota.adcionarMotorista(joao);
            frota.adcionarMotorista(ricardo);

            frota.listarFrota();
            joao.dirigir();
            ricardo.dirigir();





    }
}
