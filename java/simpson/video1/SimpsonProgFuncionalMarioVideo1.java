package SimpsonProgFuncional;

import java.util.Random;

public class SimpsonProgFuncionalMarioVideo1 {
    // Dimensionar el 10x10 del tablero
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;

    public static void main(String[] args) {
        // 1º Inicializo matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        // 2º Rellenar el tablero 'l'

        for (int i = 0; i < MAX_FILA_TABLERO; i++) {     //rellenar filas
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {  //rellenar columnas
                tablero[i][j] = 'L';    //IMPRIMA L
            }
        }

        //3º IMPRIMIR TABLERO
        imprimirTablero();
        //NUNCA APROVECHAR EL MISMO FOR PARA MAS DE UNA COSA , NO MEZCLA TAREAS

        System.out.println("");
        System.out.println("");
        System.out.println("");
        //4º Asignar a Bart

        Random aleatorio = new Random(); //funcion aleatorio=random
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);// 0 a n-1 , 9 en este caso
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        tablero[filaAleatorio][columnaAleatorio] = 'B'; // GENERE B ALEATORIAS

        // 5º Imprimir tablero
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {     //rellenar filas[0,1...2...3]
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {  //rellenar columnas[1...2...3,0]
                System.out.print(tablero[i][j] + " ");  //ESPACIOS
            }
            System.out.println("");
        }

        // 6º Repartir 10 Homer dentro del tablero

        int filaAleatorioHomer;
        int columnaAleatorioHomer;

        for (int i = 0; i < 10; i++) {
            do {
                filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);// 0 a n-1 , 9 en este caso
                columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorioHomer][columnaAleatorioHomer] != 'L');// ESTO SE HACE PARA QUE LA CASILLA TENGA LA OBLIGACION A SER DISTINTA DE L Y ASI PODER PONER UNA H, NO SE SOBREESCRIBAN
            //  CUANDO tablero[filaAleatorioHomer][columnaAleatorioHomer]='L'
            tablero[filaAleatorioHomer][columnaAleatorioHomer] = 'H';
        }
        System.out.println("");
        System.out.println("");

        //7º Imprimir tablero

        imprimirTablero();
        int filaAleatorioMuro;
        int columnaAleatorioMuro;
        for (int i = 0; i < 10; i++) {
            do {
                filaAleatorioMuro = aleatorio.nextInt(MAX_FILA_TABLERO);// 0 a n-1 , 9 en este caso
                columnaAleatorioMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
            } while (tablero[filaAleatorioMuro][columnaAleatorioMuro] != 'L');// ESTO SE HACE PARA QUE LA CASILLA TENGA LA OBLIGACION A SER DISTINTA DE L Y ASI PODER PONER UNA H, NO SE SOBREESCRIBAN
            //  CUANDO tablero[filaAleatorioHomer][columnaAleatorioHomer]='L'
            tablero[filaAleatorioMuro][columnaAleatorioMuro] = 'M';

        }
        imprimirTablero();
        tablero[MAX_FILA_TABLERO - 1][MAX_COLUMNA_TABLERO - 1] = 'F';
        imprimirTablero();
    }
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
}


