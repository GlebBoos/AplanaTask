//Задача №7: Юнит-тесты (сделано для простого набора функций)

//package junit.tests.runner;
import org.junit.runner.Result;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;


class UnitTests
{
    static int Sum(int x, int y) {
        return x+y;
    }
    static int Subtraction(int x, int y) {
        return x-y;
    }
    static int Multiplication(int x, int y) {
        return x*y;
    }
    static int Div(int x, int y) {
        return x/y;
    }
    static int Mod(int x, int y) {
        return x%y;
    }
    class TestCalc {

        @Test
        public void SumTest() {
            UnitTests c = new UnitTests();
            assertEquals(50, c.Sum(20, 30));
        }

        @Test
        public void SubtractionTest() {
            UnitTests c = new UnitTests();
            assertEquals(-10, c.Subtraction(20, 30));
        }
        @Test
        public void MultiplicationTest() {
            UnitTests c = new UnitTests();
            assertEquals(6, c.Multiplication(2, 3));
        }
        @Test
        public void DivTest() {
            UnitTests c = new UnitTests();
            assertEquals(2, c.Div(10, 5));
        }
        @Test
        public void ModTest() {
            UnitTests c = new UnitTests();
            assertEquals(1, c.Mod(82, 9));
        }
    }
    UnitTests()
    {
        System.out.println("");
        System.out.println("Задание №7 (Боос Глеб) ");
        System.out.println("");

        JUnitCore core = new JUnitCore();
        core.run(TestCalc.class);
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(TestCalc.class);
        System.out.println("Запущено тестов: " + result.getRunCount());
    }
}



