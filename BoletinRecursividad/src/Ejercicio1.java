
public class Ejercicio1 {
	
    static int potencia(int base,int exponente) {
    	int potencia = 1;
    	
    	while(0<exponente) {
          exponente(potencia, base);
    	  exponente--;
    	}
    	
         return resultado;
    }
    
    static int exponente (int potencia, int base) {
    	
    	potencia = potencia*base;
    	int resultado = potencia;
    	return potencia;	
    }

    public static void main(String[] args) {
        System.out.println("La potencia de 2 elevado a 3 es "+ potencia(2,3));
    }

}
