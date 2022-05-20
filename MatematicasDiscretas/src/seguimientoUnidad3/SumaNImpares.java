package seguimientoUnidad3;

public class SumaNImpares {

	public static void main(String[] args) {
		int num = Utilidades.leerEntero("ingrese la cantidad de numeros enteros que desea comprobar: ");
		String suma = sumatoriaNPrimerosImparesPos(num);
		Utilidades.imprimir("La suma de los primeros " + num + " impares es: " + suma);
	}

	public static String sumatoriaNPrimerosImparesPos(int num) {
		int sum = 0;
		String suma = "";
		int can = 1;
		for (int i = 1; can <= num; i++) {
			if (i % 2 != 0) {
				sum += i;
				can++;
				if (i < num) {
					suma += i + "+";
				} else {
					suma += i + "=";
				}
			}
		}
		suma += sum;
		return suma;
	}
}
