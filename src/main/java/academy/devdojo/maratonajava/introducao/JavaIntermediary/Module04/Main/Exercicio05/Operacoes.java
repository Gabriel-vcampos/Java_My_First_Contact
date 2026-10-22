package academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Main.Exercicio05;

import academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Entity.Exercicio05.Livro;

public class Operacoes {
    public boolean emprestimosLivros(Livro livro , int quantidade){
        if(quantidade > livro.quantidade){
            return false;
        } else {
            livro.quantidade -= quantidade;
            return true;
        }
    }
}
