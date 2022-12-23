import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        //Hacer un programa que calcule e imprima la suma de tres calificaciones 
        float notauno, notados, notatres, resultadouno;
        Scanner nota1 = new Scanner(System.in);
        System.out.println("Digite tres notas: ");
        notauno = nota1.nextFloat();
        notados= nota1.nextFloat();
        notatres = nota1.nextFloat();
     resultadouno = notauno + notados + notatres;
     System.out.println("La suma de sus notas es: " + resultadouno);
    

    }

}
