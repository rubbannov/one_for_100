import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {

        int startAmount = 500;
        int refill = 1500;
        int sum;
        int total;

        if (refill > 1000) {
            sum = refill / 100;
            total = startAmount + refill + sum;
        } else {
            total = startAmount + refill;
        }

        System.out.println(total);
    }
}
