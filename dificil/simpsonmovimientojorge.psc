Algoritmo simpson
	
	Definir tabsim Como Caracter;
	Definir cont Como Entero;
	Definir bartX Como Entero;
	Definir bartY Como Entero;
	Definir sal Como Logico;
	Definir rand Como Entero;
	Definir vidas Como Entero;
	Definir mov Como Caracter;
	Definir temp Como Caracter;
	vidas=0;
	Dimension tabsim[5, 5];
	sal=Falso;
	cont=0;
	Para i=1 hasta 5 Hacer
		para j=1 Hasta 5 Hacer
			tabsim[i, j]="0";
		FinPara
	FinPara
	//hommers
	Mientras cont<5 Hacer
		Para i=1 hasta 5 Hacer
			para j=1 Hasta 5 Hacer
				rand=azar(2);
				si rand=1 y tabsim[i, j]=="0" Entonces
					tabsim[i, j]="H";
					cont=cont+1;
					si cont=5 Entonces
						i=5;
						j=5;
					FinSi
				FinSi
			FinPara
		FinPara
	FinMientras
	//bart
	Mientras sal=Falso Hacer
		bartX=azar(4)+1;
		bartY=azar(4)+1;
		si tabsim[bartX, bartY]=="0" Entonces
			tabsim[bartX, bartY]="B";
			sal=Verdadero;
		FinSi
	FinMientras
	
	//Mostrar tablero
	//	Para i=1 hasta 5 Hacer
	//		Escribir Sin Saltar i " ";
	//		para j=1 Hasta 5 Hacer
	//			Escribir Sin Saltar tabsim[i, j] " ";
	//		FinPara
	//		Escribir "";
	//	FinPara
	//Bucle de juego
	sal=Falso;
	vidas=5;
	Mientras sal==falso Hacer
		si vidas==0 Entonces
			Escribir "Has perdido"
			sal=Verdadero;
		SiNo
			Si tabsim[5, 5]=="B" Entonces
				Escribir "Has ganado";
				sal=Verdadero;
			SiNo
				//pendiente de poner Funcion
				Escribir "Vidas: " vidas;
				Para i=1 hasta 5 Hacer
					Escribir Sin Saltar i " ";
					para j=1 Hasta 5 Hacer
						Escribir Sin Saltar tabsim[i, j] " ";
					FinPara
					Escribir "";
				FinPara
				
				Escribir "Hacia donde te mueves Bart?(W,A,S,D)";
				Leer mov;
				
				Si mov=="w" Entonces
					bartX=bartX-1;
					temp=tabsim[bartX, bartY];
					Si temp=="H" Entonces
						vidas=vidas-1;
					FinSi
					tabsim[bartX, bartY]="B";
					tabsim[bartX+1, bartY]="0";
				SiNo
					Si mov=="s" Entonces
						bartX=bartX+1;
						temp=tabsim[bartX, bartY];
						Si temp=="H" Entonces
							vidas=vidas-1;
						FinSi
						tabsim[bartX, bartY]="B";
						tabsim[bartX-1, bartY]="0";
					SiNo
						Si mov=="d" Entonces
							bartY=bartY+1;
							temp=tabsim[bartX, bartY];
							Si temp=="H" Entonces
								vidas=vidas-1;
							FinSi
							tabsim[bartX, bartY]="B";
							tabsim[bartX, bartY-1]="0";
						SiNo
							Si mov=="a" Entonces
								bartY=bartY-1;
								temp=tabsim[bartX, bartY];
								Si temp=="H" Entonces
									vidas=vidas-1;
								FinSi
								tabsim[bartX, bartY]="B";
								tabsim[bartX, bartY+1]="0";
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinMientras
FinAlgoritmo