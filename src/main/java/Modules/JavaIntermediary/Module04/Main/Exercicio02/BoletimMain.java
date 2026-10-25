package Modules.JavaIntermediary.Module04.Main.Exercicio02;

import Modules.JavaIntermediary.Module04.Entity.Exercicio02.Aluno;

public class BoletimMain {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        ImprimirBoletim impressao = new ImprimirBoletim();

        aluno1.setNome("Gabriel");
        aluno1.setIdade(14);
        aluno1.setNotaFinal(8.5);

        aluno2.setNome("Vitória");
        aluno2.setIdade(16);
        aluno2.setNotaFinal(7.5);

        impressao.imprimir(aluno1);
        impressao.imprimir(aluno2);

    }

}
