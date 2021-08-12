import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Vadim Khublarian on 8/12/21.
 */

public class MainTests {

    @Test
    public void returnStringHiTest1() {
        final String resultString = "Hi";
        assertEquals(resultString, Main.returnStringHi(),"The exact string \"Hi\" was not found!");
    }

}
