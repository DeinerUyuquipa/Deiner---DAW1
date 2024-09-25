package alumno;

import java.util.Scanner;

public class Alumno {

	public static void main(String[] args) {
		Scanner alumno = new Scanner(System.in);
		
		System.out.println("A continuación pon tu nombre: ");
		String nombre = alumno.next();

		
		System.out.println("Nota de Fol: ");
		double mat1= alumno.nextInt();		
		System.out.println("Nota de Pro: ");
		double mat2=alumno.nextInt();
		System.out.println("Nota de Ingles: ");
		double mat3=alumno.nextInt();
		System.out.println("Nota de LM");
		double mat4=alumno.nextInt();
		System.out.println("Nota de BBDD");
		double mat5=alumno.nextInt();

		
		double media=(mat1+mat2+mat3+mat4+mat5)/5;
		
		if(media>=5 ||media<=10){
			System.out.println("El alumno "+ nombre+ " tiene una media de "
					+media+ "por lo tanto es apto");
		}else {
			System.out.println("El alumno "+ nombre+ " tiene una media de"
					+media+ "por lo tanto no es apto");
		}

	}

}
