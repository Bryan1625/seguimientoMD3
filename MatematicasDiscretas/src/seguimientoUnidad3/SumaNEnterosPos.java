package seguimientoUnidad3;

public class SumaNEnterosPos {

	public static void main(String[] args) {
		int num = Utilidades.leerEntero("ingrese la cantidad de numeros enteros que desea comprobar: ");
		String sumatoria = sumatoriaNPrimerosEnterosPos(num);
		Utilidades.imprimir("La suma de los " + num + " primeros enteros positivos es: " + sumatoria);
	}

	public static String sumatoriaNPrimerosEnterosPos(int num) {
		int sum = (num * (num + 1)) / 2;
		String sumatoria = "";
		sumatoria += "(" + num + ")*(" + num + "+1))/2=" + sum + "\n";
		return sumatoria;
	}
}
