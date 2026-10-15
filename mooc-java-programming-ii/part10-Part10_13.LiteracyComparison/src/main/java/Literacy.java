public class Literacy implements Comparable<Literacy> {

    private String country;
    private int year;
    private String gender;
    private double literacyPercent;

    public Literacy(String country, int year, String gender, double literacyPercent) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyPercent = literacyPercent;
    }

    @Override
    public int compareTo(Literacy other) {
        return Double.compare(this.literacyPercent,(other.literacyPercent));
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;
    }
}
