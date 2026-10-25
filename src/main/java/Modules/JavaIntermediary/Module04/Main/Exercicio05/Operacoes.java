package Modules.JavaIntermediary.Module04.Main.Exercicio05;

import Modules.JavaIntermediary.Module04.Entity.Exercicio05.Livro;

public class Operacoes {
    public boolean emprestimosLivros(Livro livro , int quantidade){
        if(quantidade > livro.getQuantidade()){
            return false;
        } else {
            int quantidade_nova = livro.getQuantidade() - quantidade;
            livro.setQuantidade(quantidade_nova);
            return true;
        }
    }
}
