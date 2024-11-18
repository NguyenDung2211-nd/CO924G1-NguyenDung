package mvc2.controller;

import mvc2.model.CounterModel;
import mvc2.view.CounterView;


public class CounterController {
    private CounterModel model ;
    private CounterView view ;

    public CounterController(CounterModel model, CounterView view){
        this.model = model;
        this.view = view;
    }
    public void start(){
        boolean running = true;
        while(running){
            view.displayCounter(model.getCounter());
            int choise = view.getChoise();
            switch(choise){
                case 1 :
                    model.increment();
                    break;
                case 2 :
                    model.decrement();
                    break;
                case 3 :
                    model.reset();
                    break;
                case 4 :
                    running = false;
                    System.out.println("Đã thoát.");
                    break;
                default :
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
