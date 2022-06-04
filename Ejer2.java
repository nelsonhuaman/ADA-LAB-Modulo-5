import java.util.*;
public class Ejer2 {
	public static void main (String[]args) {
		/*Funci�n principal*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese cantidad de datos a generar");
		
		int cantidad = scan.nextInt();
		int [] array=generar(cantidad);
		System.out.println("El tiempo de ordenar "+cantidad+" numeros es: "+tiempo(array)+" nanosegundos");
	
	}
	public static long tiempo(int[]a) {
		/*Funci�n para calcular el tiempo de ordenamiento del arreglo que recibe como par�metro*/
		long inicioEjecucion=System.nanoTime();
		seleccion(a);
		long finEjecucion=System.nanoTime();
		return finEjecucion-inicioEjecucion;
	}
	public static int[] generar(int n) {
		/*Funci�n que genera un arreglo de n enteros diferentes*/
		int rango=n*5;
		int arreglo[]=new int[n];
		int i=0;
		arreglo[i]=(int)(Math.random()*rango);
		for(i=1;i<n;i++) {
			arreglo[i]=(int)(Math.random()*rango);
			for(int j=0;j<i;j++) {
				if(arreglo[i]==arreglo[j])
					i--;
			}
		}
		return arreglo;
	}
	
	public static void seleccion(int[] arreglo) {
		/*Funci�n del algoritmo de ordenamiento por selecci�n*/
	    for (int i = 0; i < arreglo.length - 1; i++) {
	        for (int j = i + 1; j < arreglo.length; j++) {
	            if (arreglo[i] > arreglo[j]) {
	                
	                int temporal = arreglo[i];
	                arreglo[i] = arreglo[j];
	                arreglo[j] = temporal;
	            }
	        }
	    }
	}
	
}
