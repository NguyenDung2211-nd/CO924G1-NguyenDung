package mvc2.test;

import mvc2.model.CounterModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterModelTest {
    public static void main(String[] args) {
        CounterModel counter = new CounterModel();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter.getCounter());
        counter.decrement();
        System.out.println(counter.getCounter());
    }

}