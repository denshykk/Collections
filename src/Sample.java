import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sample {

    public List<Integer> addRandomNumbers(List<Integer> list, int MILLION) {
        for (int i = 0; i < MILLION; i++) {
            int randomNumber = (int) (Math.random() * MILLION) + 1;
            list.add(randomNumber);
        }
        return list;
    }

    public List<Integer> getNumbers(List<Integer> list, int ONE_HUNDRED_THOUSANDS) {
        for (int i = 0; i < list.size(); i++) {
            int randomNumber = (int) (Math.random() * ONE_HUNDRED_THOUSANDS) + 1;
            list.get(randomNumber);
        }
        return list;
    }
}
