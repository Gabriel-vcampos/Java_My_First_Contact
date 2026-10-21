package academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Main.Exercicio01;
import academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Entity.Exercicio01.Produto;

public class ProdutoMain {
    public static void main(String[] args){
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("Abacaxi");
        produto1.setPreco(10.50);
        produto1.setQuantidade(40);

        produto2.setNome("Detergente");
        produto2.setPreco(3.75);
        produto2.setQuantidade(80);

        produto1.impressao();
        produto2.impressao();

    }
}
