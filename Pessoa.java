public class Pessoa {
    private String nome;
    private String cpf;
    private double peso;
    private double altura;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getcpf(){
        return cpf;
    }
    public void setcpf(String cpf){
        if(validarCpf(cpf)){
            this.cpf = cpf;
        }else {
            System.out.println(" CPF invalido deve conter 11 digitos ");
        }
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double calcularIMC(){
        if (altura > 0 ){
            return peso/(altura * altura);
        }else {
            System.out.println(" Altura invalida ");
            return 0;
        }

    }
    private boolean validarCpf( String cpf){
        return cpf != null && cpf.matches("\\d{11}");
    }
}
