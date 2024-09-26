Algoritmo Challenge005
	Definir cont Como Entero;
	Definir sum Como Entero;
	Definir sal Como Logico;
	Definir  n1 Como Entero;
	Definir temp Como Caracter;
	sal=Falso;
	cont=0;
	sum=0;
	n1=0;
	Escribir "Calcular promedio"
	Mientras sal==Falso Hacer
		cont=cont+1;
		Escribir "introduce el numero " cont
		Leer n1;
		sum=sum+n1;
		Escribir "Quieres introducir mas numeros?(si,no)";
		leer temp;
		Si temp=="no" Entonces
			sal=Verdadero;
		FinSi
	Fin Mientras
	Escribir "El promedio es " sum/cont;
FinAlgoritmo
