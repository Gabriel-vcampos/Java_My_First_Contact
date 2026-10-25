package Modules.JavaIntermediary.Module04.Main.Exercicio05;

import Modules.JavaIntermediary.Module04.Entity.Exercicio05.Livro;

public class LivroImpressao {

    public void imprimir(Livro livro){
        System.out.println("------------------------------------------------");
        System.out.println(livro.getNome() + " com quantidade: " + livro.getQuantidade() + " em estoque");
        System.out.println("\n");
    }
    public void imprimirEmprestimos(int sucessos, int falhas){
        System.out.println("Quantidade de empréstimos concluidos: " + sucessos);
        System.out.println("Quantidade de empréstimos recusados: " + falhas);
    }
}
