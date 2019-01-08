package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest { private GHappy gHappy;

    @BeforeEach
    public void initialize(){
        this.gHappy = new GHappy();
    }

    @Test
    public void oneLetter(){
        boolean result = gHappy.gHappy("s");
        Assertions.assertTrue(result);
    }

}
