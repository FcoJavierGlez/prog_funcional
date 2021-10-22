package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transformaciones {
	
	static List<Integer> numeros = new ArrayList<Integer>();
	static List<String> numerosString = new ArrayList<String>();
	
	public static void main(String[] args) {
		numeros = Arrays.asList(4,7,9,1,8,6,2,5,3);
		
		numerosString = convertFromIntegerToString();
		
		System.out.println( numerosString );
	}
	
	public static List<String> convertFromIntegerToString() {
		List<String> salida = new ArrayList<String>();
		for (Integer number : numeros) {
			salida.add( Integer.toString(number) );
		}		
		return salida;
	}
	
}
