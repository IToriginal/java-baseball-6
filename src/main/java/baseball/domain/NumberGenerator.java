package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class NumberGenerator {

    public List<Integer> createRandomNumbers() {
        return Randoms.pickUniqueNumbersInRange(1, 9, 3);
    }

}
