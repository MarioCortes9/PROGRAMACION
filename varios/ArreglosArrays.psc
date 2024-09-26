Algoritmo ArreglosArrays
	
	// 100 casillas con numeros aleatorios
	// grupo de celdas de memoria
	
	Definir num Como Entero
	Dimension  num[100];
	
	num[1] = Azar(100);
	num[2] = Azar(100);
	num[3] = Azar(100);
	num[4] = Azar(100);
	num[5] = Azar(100);
	num[100] = Azar(100);
	
	
	para cont<-1 hasta 100 con  paso 1 Hacer
		num[cont]<-Azar(100);
	FinPara
	
	
	
		Para cont<-1 hasta 100 con paso 1 Hacer
			Escribir "Valor en la pos=" ,cont,"=", num[cont]
			
		FinPara
		
	
	
FinAlgoritmo
