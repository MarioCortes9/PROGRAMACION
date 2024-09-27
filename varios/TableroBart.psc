Algoritmo TableroBart
    // 5 HOMERS
    // 1 BART
    Definir tablero Como Caracter
    Dimension tablero[10,10]
	
    // 1º) INCIALIZAR A 0
    Para fila<-1 Hasta 10 Con Paso 1 Hacer
        Para columna<-1 Hasta 10 Con Paso 1 Hacer
            tablero[fila,columna]<-'0';
        Fin Para
    Fin Para
    // 2º) 1 BART
    filaBart = Aleatorio(1,10);
    columnaBart = Aleatorio(1,10);
    tablero[filaBart, columnaBart]<-'B';
	
    // 3º) 10 HOMER
    Para conHomer<-1 Hasta 10 Con Paso 1 Hacer
        Repetir
            filaHomer<- Aleatorio(1,10);
            columnaHomer<- Aleatorio(1,10);
        Hasta Que tablero[filaHomer, columnaHomer]=='0';
        tablero[filaHomer, columnaHomer]<-'H';            
    Fin Para
    //
    Para i<-1 Hasta 10 Con Paso 1 Hacer
        Para j<-1 Hasta 10 Con Paso 1 Hacer
            Escribir Sin Saltar tablero[i,j], " "
        Fin Para
        Escribir "";
    Fin Para
	//EMPIEZA EL JUEGO
	
	Escribir "Mueve a Bart con las letras"
	
FinAlgoritmo