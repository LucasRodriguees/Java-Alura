import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class teste {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("javaScript", 150));
		cursos.add(new Curso("java", 8));
		cursos.add(new Curso("c", 55)); 
		
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

		Stream<Curso> streamDeCurso = cursos.stream()
				.filter(c -> c.getAlunos() > 50);
		streamDeCurso.forEach(c -> System.out.println(c.getNome()));
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);


	}

}
