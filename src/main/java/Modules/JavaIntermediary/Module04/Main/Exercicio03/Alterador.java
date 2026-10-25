package Modules.JavaIntermediary.Module04.Main.Exercicio03;

import Modules.JavaIntermediary.Module04.Entity.Exercicio03.Numeros;

public class Alterador {

    public int alterarInteiro(int numeroInteiro){
        numeroInteiro = 99;
        return numeroInteiro;
    }

   public void alterarDecimal(Numeros numeroDecimal){
       numeroDecimal.numeroDecimal =  99.99;
   }
}
