package baseball;

import baseball.domain.Judgment;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
//        NumberGenerator generator = new NumberGenerator();
//        List<Integer> numbers = generator.createRandomNumbers();
//        System.out.println(numbers);

        Judgment judgment = new Judgment();
        int count = judgment.correctCount(Arrays.asList(2, 8, 3), Arrays.asList(1, 2, 3));
        System.out.println(count);
    }
}
