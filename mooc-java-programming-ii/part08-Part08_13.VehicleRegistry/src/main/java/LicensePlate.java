
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        } else if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        LicensePlate compared = (LicensePlate) object;

        return this.country.equals(compared.country) && this.liNumber.equals(compared.liNumber);
    }
    @Override
    public int hashCode() {
        if (this.country == null) {
            return this.liNumber.hashCode();
        }
        return this.country.hashCode() + this.liNumber.hashCode();
    }
}
