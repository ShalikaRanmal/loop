import com.maxmin.MaxMinFinder;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, -15, 25, -45, 20};

        MaxMinFinder finder = new MaxMinFinder(array);
        finder.maxMinFinder();
        System.out.println("Max: " + finder.getMax());
        System.out.println("Min: " + finder.getMin());
    }
}