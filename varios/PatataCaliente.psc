Algoritmo PatataCaliente
	
	Definir pregunta Como Caracter
	Definir fechaCorrecta Como Entero
	Definir fechaUsuario Como entero
	
	fechaUsuario=0;
	fechaCorrecta=1936;
	
	
	Para contador<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Cuando empezo la segunda guerra civil?",contador
		Leer fechaUsuario
		Si fechaUsuario<fechaCorrecta Entonces
			Escribir "Es menor"
		SiNo
			Si fechaUsuario>fechaCorrecta entonces
				Escribir "Es MAYOR";
			SiNo
				Si fechaUsuario=fechaCorrecta Entonces
					Escribir "LA FECHA ES CORRECTA";
					contador=11;
				FinSi
			FinSi
		Fin Si
	Fin Para
	
	
FinAlgoritmo
// variable pregunta x
//respuesta fecha  x
// empieza patat caliente  x
//10 INTENTOS
//enseño pregubnta y en cada inter le digo leer fecha
//recibo frcha compruebo si coincide y veo si es mayor o menor
// menoi error 9 intentos
//mayor igual
//IGUAL FECHA TRUE