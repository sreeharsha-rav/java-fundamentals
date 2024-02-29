public class MathOperationsImpl implements MathOperations {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int modulus(int a, int b) {
        return a % b;
    }

    @Override
    public int increment(int a) {
        return a++;
    }

    @Override
    public int decrement(int a) {
        return a--;
    }

}
