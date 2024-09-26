Algoritmo TresNumerosMayor //Escribe un algoritmo que pida tres números y determine cuál es el mayor. 
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir n3 Como Entero
	
	Escribir "Introduce el numero 1"
	Leer n1
	Escribir "Introduce el numero 2"
	Leer n2
	Escribir "Introduce el numero 3"
	Leer n3
	
	Si n1>n2 Entonces
		si n1>n3 entonces
			si n2>n3 Entonces
				Escribir n1 ", " n2 "," n3;
			SiNo 
				Escribir n1 ", " n3 "," n2;
			FinSi
		FinSi
	SiNo
		si n1>n3 Entonces 
			Escribir n2 "," n1 "," n3;
		SiNo
			si n2>n3 entonces 
				Escribir n2 "," n3 "," n1;
			SiNo
				Escribir n3 "," n2 "," n1;
				
				
				
			FinSi
		Fin Si
	FinSi
	
FinAlgoritmo
