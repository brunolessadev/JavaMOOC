
public class HealthStation {

    private int weighingsCount;
    public HealthStation(){
        this.weighingsCount = 0;
    }

    public int weigh(Person person) {
        this.weighingsCount++;
        return person.getWeight();
    }

    public void feed(Person person){
        int pesoAtual = person.getWeight();
        person.setWeight(pesoAtual + 1);
    }

    public int weighings(){
        return this.weighingsCount;
    }

}
