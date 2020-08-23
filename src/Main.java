import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static final int MILLION = 1_000_000;
    public static final int ONE_HUNDRED_THOUSANDS = 100_000;

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Sample sample = new Sample();
        linkedList = sample.addRandomNumbers(linkedList, MILLION);
        arraylist = sample.addRandomNumbers(arraylist, MILLION);

        long l = System.currentTimeMillis();
        linkedList = sample.getNumbers(linkedList, ONE_HUNDRED_THOUSANDS);
        System.out.println((System.currentTimeMillis() - l) * 1000);

        l = System.currentTimeMillis();
        arraylist = sample.getNumbers(arraylist, ONE_HUNDRED_THOUSANDS);
        System.out.println((System.currentTimeMillis() - l) * 1000);
    }
}