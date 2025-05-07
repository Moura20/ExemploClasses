import javax.swing.*;

public class Caminhao extends Veiculo {
    private float capacidadeCarga;

    public Caminhao(String marca, String modelo,int ano,float capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }
    @Override
    public String exibirInfo() {
        return super.exibirInfo() + "|capacidadeCarga:" + capacidadeCarga + "toneladas";
    }
}
