package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {


    public TextArea textDisplay;
    private ArrayList<String> numbersList = new ArrayList<>();
    private ArrayList<String> operatorsList = new ArrayList<>();
    private boolean isInputNumber = true;

    public void addNumber(String num) {
        String display = textDisplay.getText() + num;
        textDisplay.setText(display);

        // makes sure they don't add operators twice
        if (isInputNumber == false) {
            isInputNumber = true;
        }
    }

    public void addOperator(String operator) {
        if (isInputNumber == true) {
            isInputNumber = false;
            numbersList.add(textDisplay.getText());
            textDisplay.setText("");
            operatorsList.add(operator);
        }


    }



    public void button0(ActionEvent actionEvent) {
        if (textDisplay.getText() != null || textDisplay.getText() != "") {
            addNumber("0");
        }
    }

    public void buttonEqual(ActionEvent actionEvent) {
    }

    public void buttonPlus(ActionEvent actionEvent) {
        addOperator("plus");
    }

    public void button1(ActionEvent actionEvent) {
        addNumber("1");
    }

    public void button2(ActionEvent actionEvent) {
        addNumber("2");
    }

    public void button3(ActionEvent actionEvent) {
        addNumber("3");
    }

    public void buttonMinus(ActionEvent actionEvent) {
        addOperator("minus");
    }

    public void button4(ActionEvent actionEvent) {
        addNumber("4");
    }

    public void button5(ActionEvent actionEvent) {
        addNumber("5");
    }

    public void button6(ActionEvent actionEvent) {
        addNumber("6");
    }

    public void buttonMultiply(ActionEvent actionEvent) {
        addOperator("Multiply");
    }

    public void button7(ActionEvent actionEvent) {
        addNumber("7");
    }

    public void button8(ActionEvent actionEvent) {
        addNumber("8");
    }

    public void button9(ActionEvent actionEvent) {
        addNumber("9");
    }


    public void buttonC(ActionEvent actionEvent) {
    }

    public void buttonDelete(ActionEvent actionEvent) {
    }
}
