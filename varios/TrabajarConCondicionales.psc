Algoritmo TrabajarConCondicionales
	
	Definir edad Como Entero
	
	Escribir "Dame tu edad: "
	
	Leer edad
	
	// >40 maduritos
	//>= 18 joven@s
	// >=11 juniors
	// >= 6  pequeñajos
	
	
	
	
	Si edad > 40 Entonces
		Escribir "Maduritos "
		
	SiNo
		
		si edad <40 y edad >= 18 entonces 
			escribir "jovenes"
		SiNo
			
			si edad >= 11 y edad <= 18 Entonces
				escribir "juniors "
			SiNo
				
				si edad >=6 y edad <=11 Entonces
					
					escribir "pequeñajos "
				FinSi
			FinSi
			
		Fin Si
	FinSi
	
	
	
FinAlgoritmo
