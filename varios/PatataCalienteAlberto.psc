Algoritmo PatataCalienteAlberto
	Definir pregunta Como Caracter
    Definir respuestaReal Como Entero
	definir respuestaUsuario Como Entero
	definir intentos Como Entero
	
	//nicializacion
	
	pregunta = "¿ En que año comenzo la 2 guerra mundial?"
	respuestaReal = 1939;
	intentos = 10;
	respuestaUsuario = 0;
	
	//ejecucion del juego
	Escribir  "Comienza el juego"
	Para contador<-1 Hasta intentos Con Paso 1 Hacer
		Escribir 	pregunta 
		Escribir "Dime una respuesta numerica"
		Leer respuestaUsuario
		
		Si respuestaUsuario>respuestaReal Entonces
			Escribir  "error"
			Escribir "la respuesta correcta es menor"
		FinSi
		
		Si respuestaUsuario<respuestaReal Entonces
			Escribir  "error"
			Escribir "la respuesta correcta es mayor"
		FinSi
		
		Si respuestaUsuario=respuestaReal Entonces
			escribir "correcto"
			Escribir "has acertado"
			escribir "eres el mejor"
			contador=10;
		FinSi
		
	Fin Para
	
	
	
FinAlgoritmo
