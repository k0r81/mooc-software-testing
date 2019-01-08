package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {


    @ParameterizedTest
    @CsvSource({
            "a,1,b", "ab, 1, bc", "z,1, a",
            "a, -1, z", "ab, -1, za", "z, -1, y",
            "a!, 1, invalid"
    })
    public void algoritm(String message, int shift, String excepted){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(excepted, result);
    }
}
