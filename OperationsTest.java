import org.example.Operations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class OperationsTest {

    @Test
    public void testAdd() {
        double result = Operations.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        double result = Operations.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        double result = Operations.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        double result = Operations.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testPower() {
        double result = Operations.power(2, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSqrt() {
        double result = Operations.sqrt(9);
        assertEquals(3, result);
    }

    @Test
    public void testLog10() {
        double result = Operations.log10(100);
        assertEquals(2, result);
    }

    @Test
    public void testLog2() {
        double result = Operations.log2(8);
        assertEquals(3, result);
    }

    @Test
    public void testLog() {
        double result = Operations.log(Math.E);
        assertEquals(1, result);
    }

    @Test
    public void testAbs() {
        double result = Operations.abs(-5);
        assertEquals(5, result);
    }

    @Test
    public void testCeil() {
        double result = Operations.ceil(3.4);
        assertEquals(4, result);
    }

    @Test
    public void testFloor() {
        double result = Operations.floor(3.6);
        assertEquals(3, result);
    }

    @Test
    public void testRound() {
        double result = Operations.round(3.5);
        assertEquals(4, result);
    }

    @Test
    public void testLogCustomBase() {
        double result = Operations.logCustomBase(2, 8);
        assertEquals(3, result);
    }

    @Test
    public void testFactorial() {
        double result = Operations.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testExp() {
        double result = Operations.exp(2);
        assertEquals(Math.exp(2), result);
    }

    @Test
    public void testDegreesToRadians() {
        double result = Operations.degreesToRadians(180);
        assertEquals(Math.PI, result);
    }

    @Test
    public void testRadiansToDegrees() {
        double result = Operations.radiansToDegrees(Math.PI);
        assertEquals(180, result);
    }

    @Test
    public void testSine() {
        double result = Operations.sin(30);
        assertEquals(0.5, result, 0.0001);
    }

    @Test
    public void testCos() {
        double result = Operations.cos(60);
        assertEquals(0.5, result, 0.0001);
    }

    @Test
    public void testTan() {
        double result = Operations.tan(45);
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void testSec() {
        double result = Operations.sec(60);
        assertEquals(2, result, 0.0001);
    }

    @Test
    public void testCosec() {
        double result = Operations.cosec(30);
        assertEquals(2, result, 0.0001);
    }

    @Test
    public void testCot() {
        double result = Operations.cot(45);
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void testSinrad() {
        double result = Operations.sinrad(Math.PI / 6);
        assertEquals(0.5, result, 0.0001);
    }

    @Test
    public void testCosrad() {
        double result = Operations.cosrad(Math.PI / 3);
        assertEquals(0.5, result, 0.0001);
    }

    @Test
    public void testTanrad() {
        double result = Operations.tanrad(Math.PI / 4);
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void testSecrad() {
        double result = Operations.secrad(Math.PI / 3);
        assertEquals(2, result, 0.0001);
    }

    @Test
    public void testCosecrad() {
        double result = Operations.cosecrad(Math.PI / 6);
        assertEquals(2, result, 0.0001);
    }

    @Test
    public void testCotrad() {
        double result = Operations.cotrad(Math.PI / 4);
        assertEquals(1, result, 0.0001);
    }

    @Test
    public void testPowerOfSum() {
        double result = Operations.powerOfSum(2, 3, 2);
        assertEquals(25, result);
    }

    @Test
    public void testPowerOfDiff() {
        double result = Operations.powerOfDiff(5, 2, 2);
        assertEquals(9, result);
    }

    @Test
    public void testAbsPower() {
        double result = Operations.absPower(-3);
        assertEquals(9, result);
    }

    @Test
    public void testInverse() {
        double result = Operations.inverse(4);
        assertEquals(0.25, result, 0.0001);
    }

    @Test
    public void testSquare() {
        double result = Operations.square(4);
        assertEquals(16, result);
    }

    @Test
    public void testCube() {
        double result = Operations.cube(3);
        assertEquals(27, result);
    }

    @Test
    public void testArcsin() {
        double result = Operations.arcsin(0.5);
        assertEquals(30, result, 0.0001);
    }

    @Test
    public void testArccos() {
        double result = Operations.arccos(0.5);
        assertEquals(30, result, 0.0001);
    }

    @Test
    public void testArctan() {
        double result = Operations.arctan(1);
        assertEquals(90, result, 0.0001);
    }

    @Test
    public void testSinh() {
        double result = Operations.sinh(0.5);
        assertEquals(0.521, result, 0.001);
    }

    @Test
    public void testCosh() {
        double result = Operations.cosh(0.5);
        assertEquals(1.127, result, 0.001);
    }

    @Test
    public void testTanh() {
        double result = Operations.tanh(0.5);
        assertEquals(0.462, result, 0.001);
    }
    @Test
    public void testRoundUp() {
        double result = Operations.roundUp(3.4);
        assertEquals(4, result);
    }

    @Test
    public void testRoundDown() {
        double result = Operations.roundDown(3.6);
        assertEquals(3, result);
    }

    @Test
    public void testModulus() {
        double result = Operations.modulus(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMinimum() {
        double result = Operations.minimum(5, 3);
        assertEquals(3, result);
    }

    @Test
    public void testMaximum() {
        double result = Operations.maximum(5, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAverage() {
        double result = Operations.average(5, 3);
        assertEquals(4, result);
    }

    @Test
    public void testGeoaverage() {
        double result = Operations.geoaverage(4, 9);
        assertEquals(6, result);
    }

    @Test
    public void testHarmaverage() {
        double result = Operations.harmaverage(4, 9);
        assertEquals(5.53846, result, 0.0001);
    }

    @Test
    public void testPercentage() {
        double result = Operations.percentage(3, 5);
        assertEquals(60, result);
    }

    @Test
    public void testHarmnum() {
        double result = Operations.harmnum(3);
        assertEquals(1.8333333333333333, result, 0.0001);
    }

    @Test
    public void testSumofn() {
        double result = Operations.sumofn(3);
        assertEquals(6, result);
    }

    @Test
    public void testSum2ofn() {
        double result = Operations.sum2ofn(3);
        assertEquals(14, result);
    }

    @Test
    public void testSum3ofn() {
        double result = Operations.sum3ofn(3);
        assertEquals(36, result);
    }

    @Test
    public void testSumkofn() {
        double result = Operations.sumkofn(3, 2);
        assertEquals(14, result);
    }

}
