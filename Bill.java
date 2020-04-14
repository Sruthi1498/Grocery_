package grocery;

public class Bill {

    private User user;
    private Product product;
    private int pid;
    private int quantity;
    static double total;

    public void Bill(User user, Product pid, int quantity) {
        total = 0.00;

        this.user = user;
        this.product = pid;
        this.quantity = quantity;
        billcalc();
        displaybill();

    }

    private void billcalc() {

        Bill.total += this.quantity * product.get_price();
    }

    private void displaybill() {

        System.out.println("UID --  " + user.getUid() + " FIRSTNAME --  " + user.getFName() + "  LASTNAME --  " + user.getLName());
        System.out.println("PID --" + product.get_id() + " PNAME --" + product.get_name() + " PRICE --" + product.get_price());

    }

    public static void total() {
        System.out.printf("%.2f  ", total);

    }
}
class Discount extends Bill {

    int s = 100 - 25;
    int gst = 29;
    double final_amount;
    double amount;

    public void Discount() {
        this.amount = (s * total) / 100;
        final_calc();
    }

    public void final_calc() {
        System.out.println("amount after discount: " + amount);

        final_amount = amount + gst;
        System.out.println("Net amount with gst: " + final_amount);
        System.out.println("TOTAL AMOUNT " + final_amount);
    }
}
