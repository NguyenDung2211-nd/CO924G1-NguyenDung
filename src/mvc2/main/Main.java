package mvc2.main;

import mvc2.controller.CounterController;
import mvc2.model.CounterModel;
import mvc2.view.CounterView;

public class Main {
    public static void main(String[] args) {
        CounterModel model = new CounterModel();
        CounterView view = new CounterView();
        CounterController controller = new CounterController(model, view);
        controller.start();
    }
}
