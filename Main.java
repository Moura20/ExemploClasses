public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");
        pessoa.setAltura(1.90);
        pessoa.setPeso(80);
        pessoa.setcpf("11100011118");
        System.out.println("IMC de pessoa " + pessoa.getNome() + ": " + pessoa.calcularIMC());


        Produto produto = new Produto();
        produto.setNome("celular");
        produto.setPreco(1500);
        produto.aplicarDesconto(0.2);
        System.out.println("preço com desconto " + produto.getNome() + "R$ " + produto.getPreco());

    }
}
