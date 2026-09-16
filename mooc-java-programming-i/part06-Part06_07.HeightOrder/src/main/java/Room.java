import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personArrayList;

    public Room() {
        this.personArrayList = new ArrayList<>();
    }

    public void add(Person person){
        this.personArrayList.add(person);
    }

    public boolean isEmpty(){
        return this.personArrayList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personArrayList;
    }

    public Person shortest(){

        if(personArrayList.isEmpty()){
            return null;
        }else{

            Person shortestPerson = this.personArrayList.get(0);

            for(Person p : this.personArrayList){
                if(shortestPerson.getHeight() > p.getHeight()){
                    shortestPerson = p;
                }
            }
            return shortestPerson;
        }
    }

    public Person take(){

        if ( personArrayList.isEmpty()){
            return null;
        }
            Person shortestIsPerson = this.shortest();
        personArrayList.remove(shortestIsPerson);
        return shortestIsPerson;
    }
}
