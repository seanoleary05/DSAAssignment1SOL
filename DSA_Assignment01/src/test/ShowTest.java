import models.Performance;
import org.junit.jupiter.api.Test;
import models.Show;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShowTest {
    Show<Object> testShow = new Show<>("testShow", 140, "12th", "13th", 19.99);
    Performance testPerformance = new Performance("12th Jan",'M');


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
    @org.junit.jupiter.api.Test
    void setPerformanceDateTest() {
        assertEquals("12th Jan", testPerformance.getPerformanceDate());
        testPerformance.setPerformanceDate("12j"); // lower bound test, should fail
        assertEquals("12th Jan", testPerformance.getPerformanceDate());
        testPerformance.setPerformanceDate("Twelfth Of January 25"); // upper bound, should fail
        assertEquals("12th Jan", testPerformance.getPerformanceDate());
        testPerformance.setPerformanceDate("21st Jan"); // within bound, should pass
        assertEquals("21st Jan", testPerformance.getPerformanceDate());

    }
    @org.junit.jupiter.api.Test
    void setPerformanceTimeTest() {
        testPerformance.setPerformanceTime('M');
        assertEquals('M', testPerformance.getPerformanceTime());
        testPerformance.setPerformanceTime('E');
        assertEquals('E', testPerformance.getPerformanceTime());
    }
}

