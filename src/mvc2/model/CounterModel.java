package mvc2.model;

public class CounterModel {
    private int counter;

    public CounterModel(){
    }

    public CounterModel(int counter){
        this.counter = counter;
    }

    public int getCounter(){
        return counter;
    }
    public void setCounter(int counter){
        this.counter = counter;
    }

    public void increment(){
        this.counter++;
    }
    public void decrement(){
        this.counter--;
    }
    public void reset(){
        this.counter = 0;
    }
}
