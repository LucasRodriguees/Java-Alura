import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.*;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora online");
		palavras.add("caelum");

		// Collections.sort(palavras, comparador);

		//palavras.sort(Comparator.comparing(String::length)); 
		palavras.sort(String.CASE_INSENSITIVE_ORDER);

			/*if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0; */
			   
			 //Integer.compare(s1.length(), s2.length())
				
		System.out.println(palavras);
		
		/*
		 * for (String p : palavras) { System.out.println(p); }
		 */

		palavras.forEach(

		System.out::println

		);
		
		new Thread(() -> 
		System.out.println("Executando um Runnable")).start();
		    


	}

}