
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if(this.value>0) {
            this.value--;
        }
        System.out.println(this.value);
    }
    public void reset(){
        this.value = 0;
        System.out.println(this.value);
        
    }

    // the other methods go here
}
