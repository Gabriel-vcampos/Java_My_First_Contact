package academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Main.Exercicio04;

import academy.devdojo.maratonajava.introducao.JavaIntermediary.Module04.Entity.Exercicio04.Conta;

public class Operacoes {

    public void Depositar(Conta cliente, double saldo){
        System.out.println("\n");
        System.out.println("Iniciando Depósito. . .");
        System.out.println("Valor inserido no sistema para depositar: " + saldo);
        cliente.saldo += saldo;
        System.out.println("Cliente: "+ cliente.nome);
        System.out.println("Saldo após o depósito: " + cliente.saldo);
    }

    public void Sacar(Conta cliente, double saldo){
        if(cliente.saldo == 0){
            System.out.println("\n");
            System.out.println("Saldo com valor 0!");
            System.out.println("Cancelando a operação de Saque!");
        } else if(saldo > cliente.saldo){
            System.out.println("\n");
            System.out.println("Quantia inserida maior que o Saldo Atual!");
            System.out.println("Tente novamente!");
            System.out.println("Cancelando a operação de Saque!");
        } else {
            System.out.println("\n");
            System.out.println("Iniciando Saque. . .");
            System.out.println("Valor inserido no sistema para realizar o saque: " + saldo);
            cliente.saldo -= saldo;
            System.out.println("Cliente: "+ cliente.nome);
            System.out.println("Saldo após o saque: " + cliente.saldo);
        }
    }


}
