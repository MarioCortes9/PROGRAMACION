package SimpsonProgFuncional;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;

public class SimpsonProgFuncionalMarioVideo2 {
    // Dimensionar el 10x10 del tablero
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;

    private static void imprimirTablero() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {     //rellenar filas[0,1...2...3]
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {  //rellenar columnas[1...2...3,0]
                System.out.print(tablero[i][j] + " ");  //ESPACIOS
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private static void asignarLibreACasilla(char caracter) {

        // 2º Rellenar el tablero 'l'

        for (int i = 0; i < MAX_FILA_TABLERO; i++) {     //rellenar filas
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {  //rellenar columnas
                tablero[i][j] = caracter;    //IMPRIMA L
            }
        }
    }

    private static void asignarPersonajesACasillasLibres(char caracter, int numRepeticiones) {
        Random aleatorio = new Random();
        int columnaAleatorio;
        int filaAleatorio;


        for (int i = 0; i < numRepeticiones; i++) {
            do {
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);// 0 a n-1 , 9 en este caso
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorio][columnaAleatorio] != 'L');
            tablero[filaAleatorio][columnaAleatorio] = caracter; // GENERE B ALEATORIAS
        }
    }

        //private static void asignarCaracterACasillasLibres(char caracter) {
        // 6º Repartir 10 Homer dentro del tablero
        //  Random aleatorio = new Random();

        //int filaAleatorioHomer;
        //int columnaAleatorioHomer;

        // for (int i = 0; i < 10; i++) {
        // do {
        // filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);// 0 a n-1 , 9 en este caso
        //  columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        // } while (tablero[filaAleatorioHomer][columnaAleatorioHomer] != 'L');// ESTO SE HACE PARA QUE LA CASILLA TENGA LA OBLIGACION A SER DISTINTA DE L Y ASI PODER PONER UNA H, NO SE SOBREESCRIBAN
        //  CUANDO tablero[filaAleatorioHomer][columnaAleatorioHomer]='L'
        //  tablero[filaAleatorioHomer][columnaAleatorioHomer] = 'H';
        //  }
        //  System.out.println("");
        // System.out.println("");



    public static void main(String[] args) {
        // 1º Inicializo matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        asignarLibreACasilla('L');
        //3º IMPRIMIR TABLERO
        imprimirTablero();
        asignarPersonajesACasillasLibres('B', 1);
        // 5º Imprimir tablero
        imprimirTablero();
        asignarPersonajesACasillasLibres('H', 10);

        imprimirTablero();
        asignarPersonajesACasillasLibres('M', 10);

        imprimirTablero();
        tablero[MAX_COLUMNA_TABLERO - 1][MAX_COLUMNA_TABLERO - 1] = 'F';
        imprimirTablero();

    }
}


