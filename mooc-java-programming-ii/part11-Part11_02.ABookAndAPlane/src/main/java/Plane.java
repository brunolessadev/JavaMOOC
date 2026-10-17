public class Plane {
    private String ID;
    private String model;
    private int yearOfIntroduction;

    public Plane(String ID, String model, int yearOfIntroduction) {
        this.ID = ID;
        this.model = model;
        this.yearOfIntroduction = yearOfIntroduction;
    }

    public String getID() {
        return ID;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIntroduction() {
        return yearOfIntroduction;
    }

    public String toString() {
        return this.ID + " (" + this.model + "), " + this.yearOfIntroduction;
    }
}