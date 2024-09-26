Algoritmo Challenge009 //Escribe un algoritmo que encuentre y muestre todos los números primos entre 1 y 100.
	
	Definir acumulador Como Entero;
	acumulador=0;
	
	
	Para contador<-1  Hasta 99 Con Paso 1 Hacer
		si contador=1 Entonces
			Escribir "";
		SiNo
			
			Para i<-1 hasta contador-1 Con Paso 1 Hacer
				
				si contador%i=0 Entonces
					acumulador=acumulador+1;
				FinSi
				
			FinPara
			
			
			si acumulador<2 Entonces
				Escribir i " es primo"
			FinSi
			acumulador=0;
		FinSi
	FinPara
	
	
	
FinAlgoritmo
