package simpsonprogfuncional;

import java.util.Random;
import java.util.Scanner;

public class SimpsonProgFuncionalVideo3 {
    private static final int MAX_FILA_TABLERO = 10; //10 FILAS
    private static final int MAX_COLUMNA_TABLERO = 10;// 10 COLUMNAS
    private static char[][] tablero;
    private static int filaBart;
    private static int columnaBart;

    private static void imprimirTablero(){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0,0],[0,1],[0,2],[0,3],ETC
                System.out.print(tablero[i][j] + " ");//IMPRIMA CASILLA
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    private static void asignarLibreACasilla(char caracter){
        //2º) Rellenar el tablero 'L'
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {

                tablero[i][j] = caracter;//RELLENA CASILLA CON CARACTER
            }
        }
    }
    private static void asignarPersonajesACasillaLibre(char caracter, int numRepeteciones){
        //4º) Asignar a Bart
        Random aleatorio = new Random();
        int filaAleatorio = -1; // SIRVE PARA INICIALIZAR ESE -1
        int columnaAleatorio = -1;
        for(int i = 0; i<numRepeteciones; i++){
            do{
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);//0-9
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);//0-9
            }while (tablero[filaAleatorio][columnaAleatorio]!='L');
            tablero[filaAleatorio][columnaAleatorio] = caracter; // CARACTER EN CASILLA ALEATORIA
        }
        if(caracter=='B'){
            filaBart = filaAleatorio;
            columnaBart = columnaAleatorio;
        }
    }
//    private static void asignarCaracterACasillasLibres(char caracter){
//        Random aleatorio = new Random();
//        // 6º) Repartir 10 Homer dentro del tablero
//        int filaAleatorioHomer;
//        int columnaAleatorioHomer;
//        for (int i = 0; i < 10; i++) {
//            do{
//                filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);//0-9
//                columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);//0-9
//            }while (tablero[filaAleatorioHomer][columnaAleatorioHomer]!='L');
//            // Cuando tablero[filaAleatorioHomer][columnaAleatorioHomer]='L'
//            tablero[filaAleatorioHomer][columnaAleatorioHomer] = caracter;
//        }
//    }

    public static void main(String[] args) {
        // 1º) Inicializo mi matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        asignarLibreACasilla('L');
        //3º) Imprimir tablero
        imprimirTablero();
        asignarPersonajesACasillaLibre('B', 1); // 1 B EN TAB
        //5º) Imprimir tablero
        imprimirTablero();
        asignarPersonajesACasillaLibre('H',10);// 10 H EN TAB
        //7º) Imprimir tablero
        imprimirTablero();
        asignarPersonajesACasillaLibre('M',10);// 10 M EN TAB
        imprimirTablero();
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();

        /*Desplazamiento de Bart*/
        /*A--> Izquierda*/
        /*S--> Abajo*/
        /*D--> Derecha*/
        /*W--> Arriba*/
        Scanner lector = new Scanner(System.in);
        /////////////////////////////////////////////////
        /*JUGAR*/
        ///////////////////////////////////////////////
        int vidas = 10;
        do{
            System.out.println("Dime el desplazamiento que quieres realizar");
            System.out.println("A--> Izquierda, S--> Abajo, D--> Derecha, W--> Arriba");
            String desplazamiento = lector.nextLine();
            System.out.println("Desplazamiento=" + desplazamiento);
            switch(desplazamiento){
                case "A":// Izquierda
                    if((columnaBart - 1) >=0){
                        columnaBart = columnaBart - 1; //Ya lo tenemos en la casilla 0, -1,
                        switch (tablero[filaBart][columnaBart]){
                            case 'H':// SI CAE HOMER  -VIDA
                                vidas = vidas-1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart+1] = 'L';// LA INICIAL ANTES DEL MOV QUEDA LIBRE
                                System.out.println("Has perdido una vida. "
                                        + "Te quedan=" + vidas + " vidas."); // PIERDES VIDA POR ENCONTRAR HOMER Y TE QUEDAN X
                                break;
                            case 'L': // EN CASO DE CASILLA L
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart+1] = 'L';
                                break;
                            case 'M':// EN CASO DE M NO PUEDES DESPLAZAR ESE BART PQ ESTAS EN LIMITE YA
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                columnaBart = columnaBart + 1;
                                break;
                        }
                    }else{
                        System.out.println("Desplazamiento prohibido. Límite de tablero.");
                    }
                    break;
                case "S":
                    if((filaBart - 1) >=0){
                       filaBart = filaBart + 1; //Ya lo tenemos en la casilla 0, -1,
                        switch (tablero[filaBart][columnaBart]){
                            case 'H':// SI CAE HOMER  -VIDA
                                vidas = vidas-1;
                                tablero[filaBart+1][columnaBart] = 'B';
                                tablero[filaBart-1][columnaBart] = 'L';// LA INICIAL ANTES DEL MOV QUEDA LIBRE
                                System.out.println("Has perdido una vida. "
                                        + "Te quedan=" + vidas + " vidas."); // PIERDES VIDA POR ENCONTRAR HOMER Y TE QUEDAN X
                                break;
                            case 'L': // EN CASO DE CASILLA L
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart-1][columnaBart] = 'L';
                                break;
                            case 'M':// EN CASO DE M NO PUEDES DESPLAZAR ESE BART PQ ESTAS EN LIMITE YA
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                filaBart = filaBart + 1;
                                break;
                        }
                    }else{
                        System.out.println("Desplazamiento prohibido. Límite de tablero.");
                    }
                    break;
                case "D":
                    if((columnaBart +1) >=0){
                        columnaBart = columnaBart + 1; //Ya lo tenemos en la casilla 0, -1,
                        switch (tablero[filaBart][columnaBart]){
                            case 'H':// SI CAE HOMER  -VIDA
                                vidas = vidas-1;
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart-1] = 'L';// LA INICIAL ANTES DEL MOV QUEDA LIBRE
                                System.out.println("Has perdido una vida. "
                                        + "Te quedan=" + vidas + " vidas."); // PIERDES VIDA POR ENCONTRAR HOMER Y TE QUEDAN X
                                break;
                            case 'L': // EN CASO DE CASILLA L
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart][columnaBart-1] = 'L';
                                break;
                            case 'M':// EN CASO DE M NO PUEDES DESPLAZAR ESE BART PQ ESTAS EN LIMITE YA
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                columnaBart = columnaBart - 1;
                                break;
                        }
                    }else{
                        System.out.println("Desplazamiento prohibido. Límite de tablero.");
                    }
                    break;
                case "W":
                    if((filaBart + 1) >=0){
                        filaBart = filaBart - 1; //Ya lo tenemos en la casilla 0, -1,
                        switch (tablero[filaBart][columnaBart]){
                            case 'H':// SI CAE HOMER  -VIDA
                                vidas = vidas-1;
                                tablero[filaBart-1][columnaBart] = 'B';
                                tablero[filaBart+1][columnaBart] = 'L';// LA INICIAL ANTES DEL MOV QUEDA LIBRE
                                System.out.println("Has perdido una vida. "
                                        + "Te quedan=" + vidas + " vidas."); // PIERDES VIDA POR ENCONTRAR HOMER Y TE QUEDAN X
                                break;
                            case 'L': // EN CASO DE CASILLA L
                                tablero[filaBart][columnaBart] = 'B';
                                tablero[filaBart+1][columnaBart] = 'L';
                                break;
                            case 'M':// EN CASO DE M NO PUEDES DESPLAZAR ESE BART PQ ESTAS EN LIMITE YA
                                System.out.println("El muro no te deja desplazarte a esta casilla.");
                                filaBart = filaBart - 1;
                                break;
                        }
                    }else{
                        System.out.println("Desplazamiento prohibido. Límite de tablero.");
                    }
                    break;
                default:
                    break;
            }
            imprimirTablero();
        }while(vidas>0);
        //////////////////////////////////////////////////

    }

}
