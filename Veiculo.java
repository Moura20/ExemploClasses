import java.security.PublicKey;

public class Veiculo {
     protected String marca;
    protected String modelo;
    protected int ano;
    protected float velocidade = 0.0f;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void Acelerar() {
        velocidade += 10;

    }

    public void Freiar() {
        velocidade = Math.max(0, velocidade - 10);
    }
    public String exibirInfo(){
        return marca + " - " + modelo + " - (" + ano + ") - " + velocidade + " km/h";
    }

}
