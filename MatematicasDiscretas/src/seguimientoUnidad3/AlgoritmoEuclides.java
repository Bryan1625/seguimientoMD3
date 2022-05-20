package seguimientoUnidad3;

public class AlgoritmoEuclides {
	
	public static void main(String []args) {
		int x= Utilidades.leerEntero("ingrese un numero entero x: ");
		int y= Utilidades.leerEntero("ingrese un numero entero y: ");
		int mcd= encontrarMCD(x,y);
		Utilidades.imprimir("el maximo comun divisor es: "+mcd);
		
	}

    public static int encontrarMCD (int x, int y){

        int min = Math.min(x, y); //Número menor del argumento. Math.min() encuentra el menor de dos números.
        int max = Math.max(x, y); //Número mayor del argumento. Math.max() encuentra el mayor de dos números.

        int resto = max % min; //Encontramos el resto de la division entera.

        if (resto ==0)
            return min; //El algoritmo recursivo se detiene cuando el resto sea 0.

        return encontrarMCD(min, resto); //Si el resto no es 0, entonces evaluamos la otra vez pero con el divisor y resto como argumentos.
    }
}
