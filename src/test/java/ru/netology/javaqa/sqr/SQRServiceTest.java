package ru.netology.javaqa.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;
//import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    @CsvSource({
            "Диапазон от 200 до 300"
    })
    public void shouldCalcExact(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(min, max);
        Assertions.assertEquals(expected, actual);
    }

}
