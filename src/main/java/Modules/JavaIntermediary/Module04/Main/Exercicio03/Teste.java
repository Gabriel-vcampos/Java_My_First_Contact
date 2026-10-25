package Modules.JavaIntermediary.Module04.Main.Exercicio03;

import Modules.JavaIntermediary.Module04.Entity.Exercicio03.Numeros;

public class Teste {
    public static void main(String[] args){
        Numeros numeroDecimal = new Numeros();
        Alterador alterador = new Alterador();
        int numeroInteiro = 10;
        numeroDecimal.numeroDecimal = 10.0;


        alterador.alterarInteiro(numeroInteiro);
        alterador.alterarDecimal(numeroDecimal);


        System.out.println(numeroInteiro);
        System.out.println(numeroDecimal.numeroDecimal);




    }
}
