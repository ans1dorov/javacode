package lessone10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BadMarks {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> badMarks = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(ThreadLocalRandom.current().nextInt(11));
        }

        System.out.println(list);
        for (Integer integer : list) {
            if (integer <= 3) {
                badMarks.add(integer);

            }
            list.removeAll(badMarks);
            System.out.println(list);
            System.out.println(badMarks);

        }


    }
}
