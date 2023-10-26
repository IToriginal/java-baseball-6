package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RefereeTest {

    private Referee referee;
    private static final List<Integer> answer = Arrays.asList(1, 2, 3);

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @DisplayName("일부 경우의 수를 사용하여 결과 테스트")
    @ParameterizedTest
    @CsvSource({"1,2,3,0볼 3스트라이크",
            "7,8,9,낫싱",
            "2,3,1,3볼 0스트라이크",
            "1,3,2,2볼 1스트라이크"})
    public void compare(int number1, int number2, int number3, String expected) {
        List<Integer> player = Arrays.asList(number1, number2, number3);
        String actual = referee.compare(answer, player);
        assertThat(actual).isEqualTo(expected);
    }
}