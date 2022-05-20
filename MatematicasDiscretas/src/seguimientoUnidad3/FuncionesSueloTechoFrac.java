package seguimientoUnidad3;

public class FuncionesSueloTechoFrac {

	public static void main(String[] args) {
		int suelo, techo;
		double frac;
		double num = Utilidades.leerDouble("ingrese un numero: ");
		suelo = funcionSuelo(num);
		techo = funcionTecho(num);
		frac = funcionFrac(num);
		Utilidades.imprimir("suelo(x): " + suelo + "\n techo(x): " + techo + "\n frac(x): " + frac);
	}

	public static int funcionSuelo(double num) {
		int suelo;
		if (num >= 0 || num % 1 == 0) {
			suelo = (int) (num);
		} else {
			suelo = (int) (num) - 1;
		}
		return suelo;
	}

	public static int funcionTecho(double num) {
		int techo;
		if (num % 1 == 0 || num<0) {
			techo = (int) (num);
		} else {
			techo = (int) (num) + 1;
		}
		return techo;
	}

	public static double funcionFrac(double num) {
		double frac;
		frac = num % 1;
		return frac;
	}
}
