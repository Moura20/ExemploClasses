import java.util.List;
import java.util.ArrayList;
public class Frota {
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Motorista> motoristas = new ArrayList<>();

    public void adcionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void adcionarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void listarFrota() {
        System.out.println("Frota de veiculos e motoristas");
        for (Motorista m : motoristas) {
            String veiculoInfo = (m.getVeiculoAtual() != null)
                    ?
                    m.getVeiculoAtual().exibirInfo()
                    : "sem veiculo";
            System.out.println(m.getNome() + "(CNH) " + m.getcnh() + ") - " + veiculoInfo);
        }
    }
}
