
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGreatest() {
        App app = new App();

        assertEquals(9, app.greatest(9, 5, 3));
        assertEquals(8, app.greatest(4, 8, 2));
        assertEquals(7, app.greatest(2, 3, 7));
    }
}
