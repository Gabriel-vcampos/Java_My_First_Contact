package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Aintroducaoclasses.domain.test;

import academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] Args){
        Estudante estudante = new Estudante();
        estudante.Nome = "Gabriel";
        estudante.Idade = 23;
        estudante.sexo = 'M';

        System.out.println("O nome do estudante é: " + estudante.Nome + " com idade de: " + estudante.Idade + " do sexo: " + estudante.sexo);
    }
}
