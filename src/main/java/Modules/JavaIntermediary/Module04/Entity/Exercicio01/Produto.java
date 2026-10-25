package Modules.JavaIntermediary.Module04.Entity.Exercicio01;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;



    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void impressao(){
        double valor_total = this.preco * this.quantidade;
        System.out.println("-----------------------------------");
        System.out.println("Produto: " + this.nome + " | Valor total em estoque: R$ " + valor_total);
    }

}
