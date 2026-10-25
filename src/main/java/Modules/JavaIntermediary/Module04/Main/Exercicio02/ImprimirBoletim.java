package Modules.JavaIntermediary.Module04.Main.Exercicio02;

import Modules.JavaIntermediary.Module04.Entity.Exercicio02.Aluno;

public class ImprimirBoletim {
    public void imprimir(Aluno aluno){
        System.out.println("--------------------------------");
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Nota_final: " + aluno.nota_final);
    }
}
