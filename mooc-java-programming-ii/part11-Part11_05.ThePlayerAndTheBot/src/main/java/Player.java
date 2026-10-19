public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void play() {
    }

    public void printName() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}