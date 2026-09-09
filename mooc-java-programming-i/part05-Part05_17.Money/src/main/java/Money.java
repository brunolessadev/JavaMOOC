
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {

        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        return new Money(totalEuros,totalCents);
    }

    public boolean lessThan(Money compared){

        int totalCentsThis = (this.euros * 100) + this.cents;
        int totalCentsCompared = (compared.euros() * 100) + compared.cents();

        return totalCentsThis < totalCentsCompared;
    }

    public Money minus(Money decreaser){
        int totalCentsThis = (this.euros * 100) + this.cents;
        int totalCentsDecreaser = (decreaser.euros() * 100) + decreaser.cents();

        int diffCents = totalCentsThis - totalCentsDecreaser;

        if(diffCents <= 0){
            return new Money(0,0);
        }

        int newEuros = diffCents / 100;
        int newCents = diffCents % 100;

        return  new Money(newEuros, newCents);
    }

}
