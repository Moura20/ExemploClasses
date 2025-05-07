public class Motorista {
    private String nome;
    private String cnh;
    private  Veiculo veiculoAtual;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }
    public void atribuirVeiculo(Veiculo veiculo) {
            this.veiculoAtual = veiculo;
    }
    public void removerVeiculo(Veiculo veiculo){
        this.veiculoAtual = null;
    }
    public void dirigir(){
        if(veiculoAtual != null){
            System.out.println(nome + " dirige a veiculo " + veiculoAtual.modelo);
        }else{
            System.out.println(nome + " não esta dirigindo nenhum veiculo");
        }
    }
    public String getNome() {
        return nome;
    }
    public String getcnh() {
        return cnh;
    }
    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }

}
