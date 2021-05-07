/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg4;

import java.util.Scanner;

/**
 *
 * @author OscarRuiz
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Introduzca un número de las siguentes opciones: ");
        System.out.println("1:- Impresion en Codigo Morse");
        System.out.println("2:- Personajes de Star Wars ");
        System.out.println("3:- Quizz Sobre Java");
        int numero = st.nextInt();
        System.out.println();
        //metodo donde se encuentra el Switch
        escoger(numero);

    }
    public static void escoger(int numeroIndicado){
        Scanner st = new Scanner(System.in);
        switch(numeroIndicado){
            case 1:
                System.out.println("-------------------------------------------");
                System.out.println("||||||||||||||| Clave Morse |||||||||||||||");
                System.out.println("-------------------------------------------");
                System.out.println();
                System.out.println("Introduce una frase: ");
                String frase = st.nextLine().toUpperCase();
                char carFrase[] = frase.toCharArray();
                arrayList();
                bucle(frase, carFrase);
                System.out.println(Pago(frase, carFrase));
                break;
                
            case 2:
                
                System.out.println("-------------------------------------------");
                System.out.println("||||||||| Personajes de Star Wars |||||||||");
                System.out.println("-------------------------------------------");
                System.out.println();
                
                System.out.println("Introduce un genero");
                System.out.println("male, female, n/a, hermaphrodite");
                String genero = st.nextLine();
                Personajes();
                recorrido(genero);
                break;
                
            case 3:
                
                System.out.println("-------------------------------------------");
                System.out.println("||||||||||||||| Quizz  Java |||||||||||||||");
                System.out.println("-------------------------------------------");
                System.out.println();
                preguntasQuizz();
                incisosQuizz();
                recorrido();
                System.out.println();
                System.out.println("Obtuviste un " + contador + "0 de Calificacion");
                break;
                
            default:
                System.out.println("Introduce un numero correcto");
        
        }
    }    
    public static String[][] aCodigo;
    
    public static void arrayList(){
        aCodigo = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
//------------------------------------------------------------------------------
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
    }
    public static String caracter(char car) {
        int numCa = (int) car;
        return aCodigo[numCa - 65][0] + " " + aCodigo[numCa - 65][1];
    }
    
    public static void bucle(String frase, char carFrase[]){
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                System.out.println("");
            } else {
                System.out.println(caracter(carFrase[i]));
            }
        }
    }
    
    public static String Pago(String frase, char carFrase[]){
        int contador = 1;
        int precio = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                contador++;
            }
        }
        if(contador <= 5){
            precio = 10;
        } else{
            precio = ((contador - 5) * 3) + 10;
        }
        return "Numero de palabras: " + contador + "\n" + "Son $" + precio + " pesos";
    }
    static String[][] allPersonajes; 
    static String sexo;
    public static void Personajes(){
        allPersonajes = new String[16][3];
            
        allPersonajes[0][0] = "Luke Skywalker";
        allPersonajes[0][1] = "172";
        allPersonajes[0][2] = "male";
        allPersonajes[1][0] = "R2-D2";
        allPersonajes[1][1] = "96";
        allPersonajes[1][2] = "n/a";
        allPersonajes[2][0] = "C-3PO";
        allPersonajes[2][1] = "167";
        allPersonajes[2][2] = "n/a";
        allPersonajes[3][0] = "Darth Vader";
        allPersonajes[3][1] = "202";
        allPersonajes[3][2] = "male";
        allPersonajes[4][0] = "Leia Organa";
        allPersonajes[4][1] = "150";
        allPersonajes[4][2] = "female";
        allPersonajes[5][0] = "Owen Lars";
        allPersonajes[5][1] = "178";
        allPersonajes[5][2] = "male";
        allPersonajes[6][0] = "Beru Whitesun lars";
        allPersonajes[6][1] = "165";
        allPersonajes[6][2] = "female";
        allPersonajes[7][0] = "R5-D4";
        allPersonajes[7][1] = "97";
        allPersonajes[7][2] = "n/a";
        allPersonajes[8][0] = "Biggs Darklighter";
        allPersonajes[8][1] = "183";
        allPersonajes[8][2] = "male";
        allPersonajes[9][0] = "Obi-Wan Kenobi";
        allPersonajes[9][1] = "182";
        allPersonajes[9][2] = "male";
        allPersonajes[10][0] = "Yoda";
        allPersonajes[10][1] = "66";
        allPersonajes[10][2] = "male";
        allPersonajes[11][0] = "Jek Tono Porkins";
        allPersonajes[11][1] = "180";
        allPersonajes[11][2] = "male";
        allPersonajes[12][0] = "Jabba Desilijic Tiure";
        allPersonajes[12][1] = "175";
        allPersonajes[12][2] = "hermaphrodite";
        allPersonajes[13][0] = "Han Solo";
        allPersonajes[13][1] = "180";
        allPersonajes[13][2] = "male";
        allPersonajes[14][0] = "Chewbacca";
        allPersonajes[14][1] = "228";
        allPersonajes[14][2] = "male";
        allPersonajes[15][0] = "Anakin Skywalker";
        allPersonajes[15][1] = "188";
        allPersonajes[15][2] = "male"; 
    }
    public static void recorrido(String genero){
        sexo = genero;
        for (int i = 0; i < allPersonajes.length; i++) {
            if(allPersonajes[i][2].equals(sexo)){
                System.out.println(allPersonajes[i][0]);
                System.out.println(allPersonajes[i][1]);
                System.out.println(allPersonajes[i][2]);
                System.out.println();
            }
        }
    }    
    public static String[][] preguntas;
    public static String[][] incisos;
    public static int contador;
    public static void preguntasQuizz() {
        preguntas = new String[10][2];
        preguntas[0][0] = "¿Cuál es la sintaxis correcta para imprimir un comentario en Java?";
        preguntas[0][1] = "0";
        preguntas[1][0] = "¿De que manera se insertan comentarios en cualquier línea en Java?";
        preguntas[1][1] = "1";
        preguntas[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto en Java?";
        preguntas[2][1] = "2";
        preguntas[3][0] = "¿De que manera se crea una variable que almacene un numero entero como el 5?";
        preguntas[3][1] = "0";
        preguntas[4][0] = "¿Qué operador se utiliza para comparar o asignar dos valores en Java?";
        preguntas[4][1] = "1";
        preguntas[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        preguntas[5][1] = "2";
        preguntas[6][0] = "¿De que manera se crea una instrucción que se usa para crear una clase en Java?";
        preguntas[6][1] = "0";
        preguntas[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? en Java";
        preguntas[7][1] = "1";
        preguntas[8][0] = "¿Que operador se utiliza para la multuplicaion de numeros en Java?";
        preguntas[8][1] = "2";
        preguntas[9][0] = "De que manera de es la sintaxis de la sentacia If en Java";
        preguntas[9][1] = "0";
    }

    public static void incisosQuizz() {
        incisos = new String[10][3];
        incisos[0][0] = "System.out.println(''comentario'');";
        incisos[0][1] = "imprimir( Hello World )";
        incisos[0][2] = "print ('' comentario'');";
        incisos[1][0] = "/* This is a comment";
        incisos[1][1] = "// de  esta forma";
        incisos[1][2] = "# de esta forma";
        incisos[2][0] = "myString(texo)";
        incisos[2][1] = "string(comentario)";
        incisos[2][2] = "String";
        incisos[3][0] = "int x = 5;";
        incisos[3][1] = "entero num x = 5";
        incisos[3][2] = "double x = 5;";
        incisos[4][0] = ">=";
        incisos[4][1] = "==";
        incisos[4][2] = "=< y >=";
        incisos[5][0] = "{arreglo}";
        incisos[5][1] = "(variable)";
        incisos[5][2] = "[]";
        incisos[6][0] = "class";
        incisos[6][1] = "MyClass name; {";
        incisos[6][2] = "class(name)";
        incisos[7][0] = "class MyClass = new myObj();";
        incisos[7][1] = "MyClass myObj = new MyClass();";
        incisos[7][2] = "new myObj = MyClass();";
        incisos[8][0] = "**";
        incisos[8][1] = "X o (por)";
        incisos[8][2] = "*";
        incisos[9][0] = "if (x > y) {";
        incisos[9][1] = "(if x > y);";
        incisos[9][2] = "if x > y then {;";
    }
    public static void recorrido(){
        String respuesta;
        Scanner st = new Scanner(System.in);
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(preguntas[i][0]);
            System.out.println("0.- " + incisos[i][0]);
            System.out.println("1.- " + incisos[i][1]);
            System.out.println("2.- " + incisos[i][2]);
            System.out.println();
            System.out.print("Escribe la respuesta correcta: ");
            respuesta = st.nextLine();
            if(preguntas[i][1].equals(respuesta)){
                contador++;
            }
        }
    }
    public static int contador(){
        return contador;
    }
    
}
