package seguimientoUnidad3;

public class SumaNCuadrados {

	public static void main(String[] args) {
		int num = Utilidades.leerEntero("ingrese el numero al que se desea llegar: ");
		String suma = SumaNCuadradosEnterosPos(num);
		Utilidades.imprimir("la suma de los primeros " + num + " enteros al cuadrado es: " + suma);

	}

	public static String SumaNCuadradosEnterosPos(int num) {
		int sum=((num*(num+1)*(num*2+1))/6);
		String suma="(("+num+"("+num+"+1)(2("+num+")+1))/6="+sum;
		return suma;
	}
}
