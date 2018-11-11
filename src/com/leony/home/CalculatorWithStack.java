package com.leony.home;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CalculatorWithStack {
    Deque<String> numbersStack = new ArrayDeque<>();

    public int calculate(String inputString) throws Exception {
        splitInputToDeque(inputString);

        while (!numbersStack.isEmpty()) {
            int result = 0;
            int firstNumber = Integer.valueOf(numbersStack.pop());
            String operator = numbersStack.pop();
            int secondNumber = Integer.valueOf(numbersStack.pop());

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                default:
                    break;
            }

            if (numbersStack.size() > 1) {
                numbersStack.push(String.valueOf(result));
            } else {
                return result;
            }
        }
        return 0;
    }

    private void splitInputToDeque(String inputString) throws Exception {
        String[] chunks = inputString.split(" ");
        if (chunks.length < 3) {
            throw new Exception("invalid expression");
        }
        numbersStack.addAll(Arrays.asList(chunks));
    }
}
