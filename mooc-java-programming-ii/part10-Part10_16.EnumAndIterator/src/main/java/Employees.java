import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private final List<Person> personList = new ArrayList<>();

    public void add(Person personToAdd){
        personList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        personList.addAll(peopleToAdd);
    }

    public void print(){
        personList.stream()
                .forEach(System.out::println);

    }

    public void print(Education education){
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
