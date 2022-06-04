import java.util.*;
 
public class Ejer1 {
	static int a;
    private static void permutar(int[] arr, int index){
    	
    	/*Función para hallar todas las permutaciones posibles y enviar cada permutacion para ser validado*/
    	
        if(index >= arr.length - 1){ 
            String per="";
            for(int i = 0; i < arr.length - 1; i++){
                per=per+arr[i];
            }
            if(arr.length > 0) {
                per=per+arr[arr.length - 1];
            }
            validacion(per,a);
            return;
        }

        for(int i = index; i < arr.length; i++){ 
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            
            permutar(arr, index+1);
           
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }
    public static void validacion(String a,int n) {
    	
    	/*Función para hallar una división valida e imprimirla */
    	String d1,d2;
    	d1=a.substring(0,a.length()/2);
    	d2=a.substring(a.length()/2,a.length());
    	int divisor, dividendo;
    	
    	divisor=Integer.parseInt(d1);
    	dividendo=Integer.parseInt(d2);
    	
    	
        if(divisor%dividendo==0) {
        	int m=divisor/dividendo;
        	if(m==n) {
        		System.out.println(d1+"/"+d2+"="+m);
        	}
        }
    }
 
    public static void main(String[] args) {
    	/*Función principal*/
    	System.out.println("Ingrese n");
    	Scanner scan = new Scanner(System.in);
    	a=scan.nextInt();
    	permutar(new int[]{0,1,2,3,4,5,6,7,8,9},0);
    }
}