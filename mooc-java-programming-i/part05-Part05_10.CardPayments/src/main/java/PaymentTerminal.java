
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        double price = 2.50;
        if(payment >= price){
            this.money += price;
            this.affordableMeals++;
            return payment - price;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double price = 4.30;
        if (payment >= price){
            this.money += price;
            this.heartyMeals++;
            return payment - price;
        }
        return payment;
    }

    public boolean eatAffordably (PaymentCard card){
        double price = 2.50;
        if(card.takeMoney(price)){
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card){
        double price = 4.30;
        if(card.takeMoney(price)){
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard (PaymentCard card, double sum){
        if(sum > 0){
            card.addMoney(sum);
            this.money += sum;
        }
    }




    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
