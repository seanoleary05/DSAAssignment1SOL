import org.junit.jupiter.api.Test;
import models.Show;

public class ShowTest {
    Show<Object> testShow = new Show<>("testShow",140, "12th", "13th",19.99);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testShow=new Show<>("testShow",140, "12th", "13th",19.99);
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        testShow=null;
    }
}
