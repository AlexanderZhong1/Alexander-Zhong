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
    private boolean clickEqual = false;
    private boolean newEquation = false;

    public void addNumber(String num) {
        if (newEquation == true) {
            textDisplay.setText("");
        }
        String display = textDisplay.getText() + num;
        textDisplay.setText(display);

        // makes sure they don't add operators twice
        if (isInputNumber == false || newEquation == true) {
            isInputNumber = true;
            clickEqual = false;
            newEquation = false;
        }
    }

    public void addOperator(String operator) {
        if (isInputNumber == true && !textDisplay.getText().isEmpty() && newEquation != true) {
            isInputNumber = false;
            numbersList.add(textDisplay.getText());
            textDisplay.clear();
            operatorsList.add(operator);
        }


    }



    public void button0(ActionEvent actionEvent) {
        if (textDisplay.getText() != null || textDisplay.getText() != "") {
            addNumber("0");
        }
    }

    public void buttonEqual(ActionEvent actionEvent) {
        if (textDisplay.getText().isEmpty() == false) {
            String currentNumber = textDisplay.getText();
            numbersList.add(currentNumber);
        }

        if (numbersList.size() >= 2 && clickEqual == false && !operatorsList.isEmpty()) {
            clickEqual = true;
            isInputNumber = false;
            int total = Integer.parseInt(numbersList.get(0));
            for (int x = 1; x < numbersList.size(); x++) {
                if (operatorsList.get(x - 1) == "plus") {
                    total += Integer.parseInt(numbersList.get(x));
                }
                else if (operatorsList.get(x - 1) == "minus") {
                    total -= Integer.parseInt(numbersList.get(x));
                }
                else if (operatorsList.get(x - 1) == "multiply") {
                    total *= Integer.parseInt(numbersList.get(x));
                }

            }
            textDisplay.setText(Integer.toString(total));
            numbersList.clear();
            operatorsList.clear();
            newEquation = true;
        }
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
        addOperator("multiply");
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
        textDisplay.setText("Cleared");
        numbersList.clear();
        operatorsList.clear();
        newEquation = true;
        isInputNumber = true;
        clickEqual = true;

    }

    public void buttonDelete(ActionEvent actionEvent) {
        if (newEquation == false && textDisplay.getText().isEmpty() == false) {

            textDisplay.setText(textDisplay.getText().substring(0, textDisplay.getText().length() - 1));
        }
    }
}
