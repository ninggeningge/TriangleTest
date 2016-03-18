package JunitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ningge on 16/3/18.
 */
public class TriangleTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTestTriangle() throws Exception {
        assertEquals(Triangle.Type.NotTriangle, Triangle.testTriangle(1,2,3));
        assertEquals(Triangle.Type.Equilateral, Triangle.testTriangle(2,2,2));
        assertEquals(Triangle.Type.Equilateral, Triangle.testTriangle(2,2,2));
        assertEquals(Triangle.Type.Isosceles, Triangle.testTriangle(2,2,3));
        assertEquals(Triangle.Type.Isosceles, Triangle.testTriangle(2,5,3));
    }
}