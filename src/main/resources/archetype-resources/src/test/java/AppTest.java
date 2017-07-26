package ${package};

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class AppTest {
    @Test
    public void testGreeting() {
        App app=new App();
        assertThat(app.getGreeting()).isEqualTo("Hello, world");
    }
}