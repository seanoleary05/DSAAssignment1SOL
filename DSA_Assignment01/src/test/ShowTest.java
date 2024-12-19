import models.Performance;
import org.junit.jupiter.api.Test;
import models.Show;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShowTest {
    Show<Object> testShow = new Show<>("testShow", 140, "12th", "13th", 19.99);


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testShow = new Show<>("testShow", 140, "12th", "13th", 19.99);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        testShow = null;
    }

    @org.junit.jupiter.api.Test
    void setShowRunTimeTest() {
        assertEquals(140, testShow.getShowRunTime());
        testShow.setShowRunTime(201); // upper bound: this should fail and runtime should remain at 140
        assertEquals(140, testShow.getShowRunTime());
        testShow.setShowRunTime(50);
        assertEquals(50, testShow.getShowRunTime());
        testShow.setShowRunTime(29); // lower bound: this should fail and runtime should remain at 50
        assertEquals(50, testShow.getShowRunTime());

    }

    @org.junit.jupiter.api.Test
    void setShowTitleTest() {
        assertEquals("testShow", testShow.getShowTitle());
        testShow.setShowTitle("12345678901234567890123456789012346578901"); //upper bound: 41 length string, this should fail
        assertEquals("testShow", testShow.getShowTitle());
        testShow.setShowTitle("ANewTypeOfShow");
        assertEquals("ANewTypeOfShow", testShow.getShowTitle());
        testShow.setShowTitle("123"); // lower bound: 3 length string, this should fail
        assertEquals("ANewTypeOfShow", testShow.getShowTitle());


    }
}

