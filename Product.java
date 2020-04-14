package grocery;

public class Product {

    int pid;
    private String pname;
    private int price;

    /**
     *
     * @param pid
     * @param pname
     * @param price
     */
    public Product(int pid, String pname, int price) {
        this.pname = pname;
        this.pid = pid;
        this.price = price;

    }

    public void set_name(String pname) {
        this.pname = pname;
    }

    public void set_id(int pid) {
        this.pid = pid;
    }

    public void set_price(int price) {
        this.price = price;
    }

    public String get_name() {
        return pname;
    }

    public int get_id() {
        return pid;
    }

    public int get_price() {
        return price;
    }

}
