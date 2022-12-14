import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Ana"));
		students.add(new Student("Amapola"));
		students.add(new Student("María"));

		List<String> nombresEstudiantes = students.stream().map(Student::getName).filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println(nombresEstudiantes.toString());
		
		IntStream.rangeClosed(1, 10).forEach(num -> System.out.println("res: "+num*2));
		
		Stream.of("BMW","Honda","Toyota").forEach(System.out::println);
		
		
	}
		

}
