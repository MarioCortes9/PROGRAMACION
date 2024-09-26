Algoritmo challenge00108
	Definir pal1 Como Caracter;
	Definir pal2 Como Caracter;
	Escribir "Introduce la palabra a comprobar"
	pal1="";
	leer pal1;
	pal1=Minusculas(pal1);
	Para  i=Longitud(pal1) Hasta 0 Con Paso -1 Hacer
		pal2=pal2+Subcadena(pal1, i, i);
	FinPara
	Si pal1=pal2 Entonces
		Escribir "La palabra " pal1 " es un palindromo"
	SiNo
		Escribir "La palabra " pal1 " no es un palindromo"
	FinSi
FinAlgoritmo
