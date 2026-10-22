package academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Main.Exercicio05;

import academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Entity.Exercicio05.Livro;

public class LivroMain {
    public static void main(String[] args){
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Operacoes operacoes = new Operacoes();
        LivroImpressao livroimprimir = new LivroImpressao();
        int sucessos = 0;
        int falhas = 0;
        boolean resultado = true;

        System.out.println("---------------------------");
        System.out.println("    Sistema de livraria    ");
        System.out.println("---------------------------");
        System.out.println("Livros em estoque: \n");


        livro1.setNome("Dom Casmurro");
        livro1.setQuantidade(3);

        livro2.setNome("O Cortiço");
        livro2.setQuantidade(4);

        resultado = operacoes.emprestimosLivros(livro1 , 2);
        if(resultado){
            sucessos++;
        }else{
            falhas++;
        }
        resultado = operacoes.emprestimosLivros(livro2 , 5);
        if(resultado){
            sucessos++;
        }else{
            falhas++;
        }
        resultado = operacoes.emprestimosLivros(livro1 , 1);
        if(resultado){
            sucessos++;
        }else{
            falhas++;
        }

        livroimprimir.imprimir(livro1);
        livroimprimir.imprimir(livro2);
        livroimprimir.imprimirEmprestimos(sucessos , falhas);

    }
}
