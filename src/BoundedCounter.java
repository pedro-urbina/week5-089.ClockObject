
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= this.upperLimit)
            this.value = newValue;
    }
    
    public int getValue() {
        return this.value;
    }

    public void next() {
        // write code here
        if (this.value == this.upperLimit)
            this.value = 0;
        else
            this.value += 1;
    }

    public String toString() {
        // write code here
        if (this.value < 10)
            return "0" + value;
        else
            return "" + value;
    }
}
