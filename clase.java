import java.util.Scanner;
import javax.swing.JOptionPane;

public class clase{
// Como mostrar texto por consola
 public static void main(String[] args) {

   //ejemplo de imprimir texto por consola
   byte entero = 12;
     System.out.println("Núemro entero es " + entero);

     //ejemplo de datos no primitivos
   Integer numero = null;
     System.out.println("Número es " + numero);

     //Ejemplo de constante en java
   final int num = 10;
    System.out.println(num);

    //Importar datos de usuario por terminal
   Scanner entrada = new Scanner(System.in);
   int Numeros;
   System.out.println("Digite un numero ");
   Numeros = entrada.nextInt();
   System.out.println("Su dato es " + Numeros);

   //Guaradr cadenas de texto del usuario
Scanner uno = new Scanner(System.in);
   //String texto;
   
   System.out.println("digite una cadena");
   String cadenas;
    cadenas = uno.next();
    System.out.println(cadenas);
    
// Tipos de datos primitivos
int numer = 0; //Pesa 4bytes tamaño 32          
long NúmeroLargo = 0; //Pesa 8bytes, tamaño 64        	
char letra = 'a';  //pesa 1byte tamaño 16           	
double puntodecimal = 0.0d;//pesa 8bytes tamaño 64
float puntoflotante = 0.0f;//pesa 4bytes tamaño 32
boolean  VerdaderoFalso = true; //pesa 1byte
String cadena = "mauricio correa";// pesa 1bythe por caracter 
    System.out.println(numer );
    System.out.println(NúmeroLargo );
    System.out.println(letra );
    System.out.println(puntodecimal );
    System.out.println(puntoflotante );
    System.out.println(VerdaderoFalso );
    System.out.println(cadena );

//importar letras
Scanner letrass = new Scanner(System.in); 
char letras;
letras = letrass.next().charAt(0);
System.out.println(letras);

//ejemplo JOptionPane

//Ingresar datos
String manuela;
int edad;
char amor;
double py;
manuela = JOptionPane.showInputDialog("Cual es su nombre? ");
edad = Integer.parseInt(JOptionPane.showInputDialog("Cual es su edad?"));
amor = JOptionPane.showInputDialog("La amas").charAt(0);
py = Double.parseDouble(JOptionPane.showInputDialog("Dgita el valor de py "));

//Mostrar datos
JOptionPane.showMessageDialog(null, "el nombre de ella es " + manuela);
JOptionPane.showMessageDialog(null, "su edad es" + edad);
JOptionPane.showMessageDialog(null, amor);
JOptionPane.showMessageDialog(null, py);

//Operadores arigmeticos
float numero1, number2, suma, resta, multiplicacion, divicion, resto;

Scanner operadore = new Scanner(System.in);
System.out.println("Digite dos numero: ");
numero1 = operadore.nextFloat();
number2 = operadore.nextFloat();
 suma = numero1 + number2;
 resta = numero1 - number2;
 multiplicacion = numero1 * number2;
 divicion = numero1 / number2;
 resto = numero1 % number2;
 System.out.println("La suma es: " + suma);
 System.out.println("La resta es: " + resta );
 System.out.println("La multiplicacion es: " + multiplicacion);
 System.out.println("La divicion es: " + divicion);
 System.out.println("El resto es: " + resto);

 //Conbinados con asignacion
int manu = 10;
manu = manu + 5;
System.out.print(manu);
}

//Tipos de datos no primitivos 

// Interger es un dato no primitivo y sirve para guardar datos null
// de variables enteras "numeros"

//Constantes 
// las constantes en java son como las variables, lo que cambia
// es la palabra que se le agrega la palabra 'final' en el inicio 
// de la declaracion

//Entrada de datos
//para importar los datos se debe importar la libreria
//java.utilis.scaner

//entrada y saida de datos con JOptionPane

//operadodes arigmeticos
//
}


