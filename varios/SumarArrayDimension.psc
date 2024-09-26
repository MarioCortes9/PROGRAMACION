Proceso SumarArrayDimension
    Definir num Como Entero
    Escribir "Ingresa la cantidad de elementos del array:"
    Leer num
	Definir suma Como Entero
	suma = 0
	
    Dimension array[num];
    
    Para i<-1 hasta num con paso 1 hacer
        Escribir "Ingresa el número ", i , ":"
        Leer array[i]
    Fin Para
	

    Para i<-1 hasta num Con Paso  1 Hacer
        suma = suma + array[i]
    Fin Para
	
    Escribir "La suma de los elementos es: ", suma
Fin Proceso


