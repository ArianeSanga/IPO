public class USMoney {
    private int dollars;
    private int cents;

    public USMoney(int dollars, int cents) {
        if (cents < 0 || cents > 99) {
            dollars += cents / 100;
            cents = cents % 100;
        }

        this.dollars = dollars;
        this.cents = cents;
    }

    public USMoney plus(USMoney other) {
        int newDollars = this.dollars + other.dollars;
        int newCents = this.cents + other.cents;

        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents = newCents % 100;
        }

        return new USMoney(newDollars, newCents);
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    public static void main(String[] args) {
        USMoney x = new USMoney(5, 80);
        USMoney y = new USMoney(1, 90);
        USMoney result = x.plus(y);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x.plus(y): " + result);
    }
}
