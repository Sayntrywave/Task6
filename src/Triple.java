public class Triple<T> {
    private T a;
    private T b;
    private T c;

    public Triple(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
