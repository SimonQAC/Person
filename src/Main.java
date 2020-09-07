import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Person> people = new ArrayList<>();
	public static void main(String[] args) {

		Person Jake = new Person("Jake",20,"CEO");
		Person Sam = new Person("Sam",10,"Waitor");
		Person Laura = new Person("Laura",22,"Duty Manager");

	
		//Lister test = new Lister();
		//System.out.println(test);



        people.add(Sam);
        people.add(Jake);
        people.add(Laura);
        System.out.println(people);
        
        findPerson("Laura");
     }
	public static void findPerson(String name) {
		for (Person p : people) {
			if (p.getName().equals(name)) {
				System.out.println(name + " found");
			}
		}
	}

	
}