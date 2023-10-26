package baseball;

import baseball.domain.Judgment;
import baseball.domain.Referee;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(7, 8, 9), Arrays.asList(1, 2, 3));
        System.out.println(result);
    }
}
