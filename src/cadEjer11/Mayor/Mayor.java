package cadEjer11.Mayor;

import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in); // preparamos para poder leer por teclado
		String palabra[] = new String[5]; //creamos una tabla
		
		leerTeclado(teclado, palabra); //leemos por teclado 5 veces
		comparar(palabra); //comparamos las palabras
	}

	/**
	 * @param teclado
	 * @param palabra
	 */
	private static void leerTeclado(Scanner teclado, String[] palabra) {
		int i;
		for(i=0;i<palabra.length;i++)
		{
			System.out.println("indique la palabra "+i); //nos indica qu palabra introducimos
			palabra[i]=teclado.nextLine();// nos lee por teclado y lo mete la cadena en una tabla
		}
		teclado.close();
	}

	/**
	 * @param palabra
	 */
	private static void comparar(String[] palabra) 
	{
		int i;
		String mayor;
		mayor=palabra[0];
		for(i=0;i<palabra.length;i++)
		{
			System.out.println("comparando si "+palabra[i]+" es mayor alfabeticamente que "+mayor);
			if(palabra[i].compareTo(mayor)>0)
			{
				System.out.println(palabra[i]+" es mayor alfabeticamente que "+mayor);
				mayor=palabra[i];
			}
			
		}
		System.out.println("la palabra "+mayor+ " es alfabeticamente mayor que todas las demas palabras introducidas");
	}
}
