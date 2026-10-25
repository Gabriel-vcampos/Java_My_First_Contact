package Modules.JavaIntermediary.Module04.Main.Exercicio04;

import Modules.JavaIntermediary.Module04.Entity.Exercicio04.Conta;

public class BancoMain {
    public static void main(String[] args){
        System.out.println("------------------------------");
        System.out.println("------ Sistema de banco ------");
        System.out.println("------------------------------");


        Conta cliente1 = new Conta();
        Conta cliente2 = new Conta();
        Operacoes operacoes = new Operacoes();
        BancoImpressao imprimir = new BancoImpressao();

        cliente1.setNome("Vitória");
        cliente1.setSaldo(1535.50);

        cliente2.setNome("Nicole");
        cliente2.setSaldo(300.0);

        operacoes.Depositar(cliente1 , 500.0);
        operacoes.Sacar(cliente1 , 1000.0);

        operacoes.Sacar(cliente2 , 500);
        operacoes.Depositar(cliente2 , 1000.0);



        imprimir.Imprimir(cliente1);
        imprimir.Imprimir(cliente2);



    }
}
