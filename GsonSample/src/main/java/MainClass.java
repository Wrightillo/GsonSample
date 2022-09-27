import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner scanThis = new Scanner(System.in);
		PersonaClassData personaje = new PersonaClassData();
		Gson gsonFinal = new GsonBuilder().create();
		
		System.out.println("Bienvenido.");
		
		System.out.println("Por favor, introduzca su nombre:");
		personaje.setNombre(scanThis.nextLine());
		
		System.out.println("A continuación, introduzca su apellido:");
		personaje.setApellido(scanThis.nextLine());
		
		System.out.println("Finalmente, indique su edad:");
		personaje.setEdad(scanThis.nextInt());
		
		System.out.println("Gracias por su colaboración.");
		
		String jsonGasonado = gsonFinal.toJson(personaje);
		System.out.println(jsonGasonado);
		
	}

}
