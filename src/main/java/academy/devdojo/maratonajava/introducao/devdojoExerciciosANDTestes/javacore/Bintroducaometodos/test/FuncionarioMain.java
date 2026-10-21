package academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.introducao.devdojoExerciciosANDTestes.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioMain {
    public static void main(String[] args){

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.getNome("Vitor");
        funcionario1.getIdade(25);
        funcionario1.getSalario(new double[] {2000,4000,6000});

        funcionario2.getNome("Rafaela");
        funcionario2.getIdade(32);
        funcionario2.getSalario(new double[] {5000, 3000, 7000});


        funcionario1.imprimir();
        funcionario2.imprimir();
    }
}
