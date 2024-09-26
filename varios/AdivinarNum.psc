Algoritmo AdivinarNum
    Definir num Como Entero;
    Dimension num[100];
    Para cont<-1 Hasta 100 Con Paso 1 Hacer
        num[cont]<- Azar(99)+1; // Aleatorio. 1 al 100
    Fin Para
    Para cont<-1 Hasta 100 Con Paso 1 Hacer
        Escribir Sin Saltar num[cont], " "
    Fin Para
	Escribir "Adivina los números"
    Para intentos<-1 Hasta 10 Con Paso 1 Hacer
        Escribir "Dame 1 número"
        Leer numUsuario
        Para cont1<-1 Hasta 100 Con Paso 1 Hacer
            Si num[cont1] = numUsuario Entonces
                num[cont1] = 0;
            Fin Si
			
        Fin Para
    Fin Para
	
FinAlgoritmo

