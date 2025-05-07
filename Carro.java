public class Carro extends Veiculo {
     private int numPortas;

     public Carro(String marca, String modelo, int numPortas,int ano) {
         super(marca, modelo, ano);
         this.numPortas = numPortas;
     }
     @Override
    public String exibirInfo() {
         return super.exibirInfo() + "\nNumero de Portas: " + numPortas;
     }

}
