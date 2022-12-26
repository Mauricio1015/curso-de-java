import java.util.Scanner;
import javax.swing.JOptionPane;

public class clase{
// Como mostrar texto por consola
 /**
 * @param args
 */
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
manu =+ 5; 
System.out.print(manu);

//Incremento o drecemento 
//++ o --
manu++;
manu--;

//Clase Math

//sacar la raiz cuadrada de un numero sqrt
double raiz = Math.sqrt(9);
System.out.println(raiz);
//Nota la forma antrios es utilisada para bariables double si se necesita un int
// se debe agregar algo más
int rais = (int)Math.sqrt(9);// de esta manera se puede almacenar una variable de tipo etero
System.out.println(rais);

//elevacion pow
double base = 5, exponente = 2;
double resul = Math.pow(base, exponente);
System.out.println(resul);

//redondear round
double nu11 = 4.55;
long erul = Math.round(nu11);
System.out.println(erul);

//Ramdom random
double Ramdom = Math.random();
System.out.println(Ramdom);

//Condicionales if y if else
int  datous, dato = 5;

datous = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
if(datous == dato){
  JOptionPane.showMessageDialog(null, "el numeo es 5");
}
else{
  JOptionPane.showMessageDialog(null, "El numero es diferente " );
}

//Condicionales switch
int torres;
torres = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 1 y 5: "));
switch(torres){
    case 1: JOptionPane.showMessageDialog(null, "es numero 1");
   break;
   case 2: JOptionPane.showMessageDialog(null, "es el numero 2" );
   break;
   case 3: JOptionPane.showMessageDialog(null, "es el numero 3" );
   break;
   case 4: JOptionPane.showMessageDialog(null, "es el numero 4" );
   break;
   case 5: JOptionPane.showMessageDialog(null, "es el numero 5" );
   break;
  default: JOptionPane.showMessageDialog(null, "el numero no esta en el rrango");
}

//Operador ternario
int della;
String mensaje;
della = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
mensaje = (della%2==0) ? "el numero es par" : " el numero es impar";

//Ciclos while
int i = 1;
while(i<=10){
  System.out.println(i);
  i++;
}
//ciclo do while
do{
  System.out.println(i);
  i++;
}while(i<=10);

//Ciclo for 
for(int b=10; b>=11; b++){
  System.out.println(b);

}

//Array en java 
//Tipo_de_variable[] Nombre_del_arry = new Tipo_de_variable[dimencion del array];
int[] eda = new int[4];//asi se declara un array
//para ingresar datos al array e:
eda[0] = 5;//aca estamos indicando que en la primera pocicion de array va a ir el dato 5
eda[1] = 2;
eda[2] = 3;
//para ingresar todos los datos de una vez se hace de la siguiente forma
int[] eje ={6,2,5};
for (int q = 0; q < 3; q++){
  System.out.println(eje[q]);
}

//For each
String[] nombres = {"alejo","mauricio","manuela", "marcela", "torres", "giraldo"};
for(String a:nombres){
  System.out.println(a);
}

//metodos de ordenamiento de arreglos
//metodo burbuja
Scanner Manu = new Scanner(System.in);
int arreglo[],elementosnumber, aux;
elementosnumber = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));
arreglo = new int[elementosnumber];//le asignamos el numero de elementos al arrglo
for(int q=0; q<elementosnumber;q++){
  
   System.out.println((q+1)+" Digite un número: ");
   arreglo[q] = entrada.nextInt();
  }

  for(int q=0;q<elementosnumber;q++){
    for(int j=0; j<(elementosnumber-1); j++){
      if(arreglo[j]> arreglo[j+1]){
        aux = arreglo[j];
        arreglo[j+1] = aux;

      }

    }

  }

  //Mostrando el arrglo de forma creciente
  System.out.println("arreglo ordenado de forma creciente: ");
  for(int q=0; q<elementosnumber;q++){
    System.out.println(arreglo[1]+"_");
  }
  //Mostrar el arreglo de forma decreciente
  System.out.println("Arreglo de forma drecreciente");
  for(int q=(elementosnumber-1);q>=0;q--){
    System.out.println(arreglo[q]+"_");
  }

  //Ordenamiento por incesccion
  //si
   //numerozq>numeroActual
       //cambio
 
Scanner entra = new Scanner(System.in);
int arregloa[], ele, pos, au;
ele = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos"));
arregloa = new int[ele];
System.out.println("Digite el arrego");
for(int q = 0; q<ele; q++){
  System.out.println((q+1)+"digite un numero: ");
  arreglo[q] = entra.nextInt();


}
//Ordenamiento por insercion
   for(int q =0; q<ele; q++){
       pos = q;
       au = arregloa[q];
       while((pos>0) && (arregloa[pos-1]> au)){
         arregloa[pos] = arreglo[pos-1];
         pos--;
        }
        arregloa[pos] = au;

    }  
//inprecion en foema acendente
System.out.println("Orden Asendente");
for(int q=0;q <ele; q++){
System.out.println(arregloa[q]+" - ");
}
System.out.println("");

//orden decendente
 System.out.println("Orden Desendente");
for(int q=(ele-1);q>=0;q--){
  System.out.println(arregloa[q]+" - ");

}
System.out.println("");


//orden por seleccion
//1.Busca el minimo elemento de la lista.
//2.Intercambiar con el primer elemento
//3.Buscar el minimo de resto de la lista
//4.Intercambiar con el segundo
//5.Y asi sucesivamente
Scanner seleccion = new Scanner(System.in);
int arre[],element,min,auxi;
element = Integer.parseInt(JOptionPane.showInputDialog("Digite el # de elementos del arreglo"));
arre = new int[element];
System.out.println("datos para llenar el arreglo");
for(int q=0;q<element;q++){
  System.out.println((q+1)+" Digita un numero");
  arre[q] = seleccion.nextInt();
}
for(int q=0;q<element;q++){
  min = q;
  for(int j=q+1;j<element;j++){
    if(arre[j]<arre[min]){
      min = j;
    }
    auxi =arre[q];
    arre[q]=arre[min];
    arre[min]=auxi;
  }
  
   
}
System.out.println("Orden acendente");
  for(int q=0;q<element;q++){
    System.out.println(arre[q]+" - ");

  }
   System.out.println("");
   System.out.println("orden decendente");
   for(int q=(element-1); q>=0;q--){
    System.out.print(arre[q]+" - ");
   }
//busqueda secuncial
int bus[]= {4,2,5,1,3};
int dat;
boolean ban = false;

dat = Integer.parseInt(JOptionPane.showInputDialog("digite el numero a buscar"));
//busqueda secuencial
int t=0;
while(t<5 && ban == false){
  if(bus[t] == dat);{
  ban = true;
  }
}
if(ban==false){
  JOptionPane.showMessageDialog(null, "el numero no esta en el arreglo");
}
else{
  JOptionPane.showMessageDialog(null, "el numero esta en el arreglo en la pocicion "+(t-1));
}

//Busqueda binaria "se requiere que este ordenado acendentemente"
int binario[] = {1,2,3,4,5};
int dad, inf, sup,mita, p;
boolean band = false;
dad =Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar"));

//algoritmo
inf=0;
sup=5;
p=0;
mita = (inf+sup)/2;
while(inf<=sup && p<5){
  if(binario[mita] ==dad){
    band=true;
    break;

  }
  if(binario[mita]>dato){
    sup = mita;
    mita = (inf+sup)/2;
  }
  if(binario[mita]<dato){
    inf = mita;
    mita = (inf+sup)/2;
  }
  p++;
}
if(band == true){
  JOptionPane.showMessageDialog(null,"El numero fue encontrado en en la posicion:  "+mita );
} 
else{
  JOptionPane.showMessageDialog(null, "No encontramos el numero en el programa");
}

//matrices o arreglos de tablas
Scanner manuelaTorres = new Scanner(System.in);
int matriz[][], nFilass,nCol;
nFilass = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de filas" ));
nCol = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de columnas" ));
matriz = new int[nFilass][nCol];
System.out.println("Digite la matriz");
for (int q=0;q<nFilass;q++) {
  for(int j=0;j<nCol;j++){
    System.out.print("Matriz ["+q+"]["+j+"]: ");
    matriz[q][j] = manuelaTorres.nextInt();

  }
}
System.out.println("la matriz es: "); 
for(int q=0; q<3; q++){//numero de filas
   for(int m=0;m<3;m++){//numero de columnas
    System.out.print(matriz[q][m]);

   }
   System.out.println("");
 }
 //funciones
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
//el operaror para saber si una var es distinta a otra es !=
}


