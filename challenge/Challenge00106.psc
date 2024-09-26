Algoritmo Challenge00106
	Definir user Como Entero;
	Definir n1 como Entero;
	Definir  n2 Como Entero;
	Definir sec Como Entero;
	n1=0;
	n2=0;
	user=1;
	Escribir "Cuantos numeros de la secuencia deseas generar"
	Leer user;

	Escribir "secuencia Fibonachi"
	Para i=0 Hasta user Con Paso 1 Hacer
		si (i=0) o (i=1) Entonces
			sec=1;
			n1=1;
			n2=1;
		SiNo
			sec=n1+n2;
		FinSi
		Escribir sec;
		n1=n2;
		n2=sec;
		
	Fin Para
FinAlgoritmo
