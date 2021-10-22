package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Test {
	
//	public class Operaciones {
//		
//		public static int add(int x, int y) {
//			return x + y;
//		}
//		
//	}
	
	static List<String> colors = new ArrayList<String>();
	static List<Integer> numeros = new ArrayList<Integer>();
	//static List<String> nombres = new ArrayList<String>();

	public static void main(String[] args) {
		colors = Arrays.asList("Azul","Rojo","Verde");
		numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//nombres = Arrays.asList("Gonzalo","Francisco","Pedro");
		
		int a = numeros.stream().reduce(0, Integer::sum);
		int b = numeros.stream().collect(Collectors.summingInt(Integer::intValue));
		
		hasColorImperative("Rojo");
		hasColorFuncional("Rojo");
		
		System.out.println( suma() );
		//System.out.println( "Pares: " + getPares() );
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void hasColorImperative(String color) {
		boolean hasRed = false;
		for (String currentColor : colors) {
			if (currentColor.equals(color)) {
				hasRed = true;
				break;
			}
		}
		System.out.println("Imperativa -> Existe el color rojo: " + hasRed);
	}
	
	public static void hasColorFuncional( String color ) {
		System.out.println("Funcional -> Existe el color rojo: " + colors.contains(color));
	};
	
	public static int suma() {
		return numeros.stream().mapToInt( x -> x ).sum();
	}
	
//	public static List<Integer> getPares() {
//		return (List<Integer>) numeros.stream().filter( x -> x % 2 == 0 );
//	}

}
