//Задача №7: Юнит-тесты (сделано для простого набора функций)

//package junit.tests.runner;
import org.junit.runner.Result;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;


class UnitTests
{
    static int getSum(int x, int y)
    {
        return x+y;
    }
    static int getSubtraction(int x, int y)
    {
        return x-y-1;
    }
    class TestCalc {

        @Test
        public void getSumTest() {
            UnitTests c = new UnitTests();
            assertEquals(50, c.getSum(20, 30));
        }

        @Test
        public void getSubtractionTest() {
            UnitTests c = new UnitTests();
            assertEquals(-10, c.getSubtraction(20, 30));
        }
    }
    UnitTests()
    {

        JUnitCore runner = new JUnitCore();
        Result result = runner.run(TestCalc.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());


    }
}



