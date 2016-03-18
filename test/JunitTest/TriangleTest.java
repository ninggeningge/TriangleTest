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
    public void testTestTriangle1() throws Exception {//判断是否是三角形
        assertEquals(Triangle.Type.NotTriangle, Triangle.testTriangle(1,2,3));
    }
    @Test
    public void testTestTriangle2() throws Exception {//判断是否等边
        assertEquals(Triangle.Type.Equilateral, Triangle.testTriangle(2,2,2));
    }
    @Test
    public void testTestTriangle3() throws Exception {//判断是否等腰
        assertEquals(Triangle.Type.Isosceles, Triangle.testTriangle(2,2,3));
    }
    @Test
    public void testTestTriangle4() throws Exception {//盘算是否是普通三角形
        assertEquals(Triangle.Type.Scalene, Triangle.testTriangle(4,5,7));
    }
}