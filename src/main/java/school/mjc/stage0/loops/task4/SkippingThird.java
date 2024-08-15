package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {

        for(int res = 1; res <= lastPrinted; res++) {
            if (lastPrinted <= 0) {
                System.out.println("");
            }
            if (res == 3 || res == 6 || res == 9) {
                continue;
            }
            System.out.println(res);
        }

    }
}
