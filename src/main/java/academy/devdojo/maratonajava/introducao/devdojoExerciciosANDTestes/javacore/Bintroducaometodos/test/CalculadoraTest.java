package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] Args) {
        Calculadora calculadora = new Calculadora();
        calculadora.numero1 = 2;
        calculadora.numero2 = 5;

        calculadora.soma();
    }
}
