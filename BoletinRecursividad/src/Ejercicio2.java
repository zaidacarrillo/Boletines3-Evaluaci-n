
public class Ejercicio2 {

	public static  main(String[] args) {
		int cociente = 0;
		 int division (int dividendo, int divisor) {
			  while (dividendo >0) {
				  cociente++;
				  dividendo = dividendo-divisor;	
				  return cociente;
				} 
			
		  }
		System.out.println("La división de 2 entre 2 es "+ division(2,2));

	}


}
