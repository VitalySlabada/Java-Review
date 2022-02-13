package PSP_pck;

public class PSP {

    String name;
    double amount;

    public PSP(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PSP_pck.PSP{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
