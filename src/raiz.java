public class raiz {
	public static double square(double numero){
		double t;
		double raizcuadrada = numero / 2;
		do 
		{
		t = raizcuadrada;
		raizcuadrada = (t + (numero / t)) / 2;
		}
		 while ((t - raizcuadrada) != 0);
		return raizcuadrada;
		}
		public static void main(String[] args)
		{
		double numero = 35;
		double raizcuadrada;
		raizcuadrada = square(numero);
		System.out.println("Numero para calcular la raiz cuadrada es : "+numero);
		System.out.println("La raíz cuadrada es : "+raizcuadrada);
		}
	
		
}
