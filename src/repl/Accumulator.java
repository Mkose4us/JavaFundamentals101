package repl;

public class Accumulator {
    public int sum;

    public Accumulator(int sum) {
        this.sum = sum;
    }
    public int getSum(int sum){
        return sum;
    }
    public int add(int value){
        return sum+=value;
    }
    public int remove(int value){
        return sum-=value;
    }

    @Override
    public String toString() {
        return "Accumulator{" +
                "sum=" + sum +
                '}';
    }
}
