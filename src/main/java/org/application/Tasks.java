package org.application;

import java.util.ArrayList;

public class Tasks {

    private int maxValue = 0;

    public void ReverseDigits(Integer number) {
        if (number == 0) return;

        System.out.println(number % 10);

        ReverseDigits(number / 10);
    }

    public void CountEqToMax(ArrayList<Integer> numbers) {
        Integer currNum = -1, max = 0;

        while (currNum != 0) {

            currNum = MyInput.inputInteger("Enter the next number:", Integer::valueOf);

            if (currNum > max) {
                max = currNum;

                numbers.clear();
                numbers.add(currNum);
            } else if (currNum == max) {
                numbers.add(currNum);
            }
        }
    }

    public int FindMax(ArrayList<Integer> numbers) {

        if (numbers.size() == 0) {

            Integer currNum = -1;

            while (currNum != 0) {
                currNum = MyInput.inputInteger("Enter the next number:", Integer::valueOf);
                numbers.add(currNum);
            }
        }

        if (numbers.size() == 1) {
            maxValue = numbers.get(0);
        } else if (numbers.size() > 1){
            maxValue = (FindMax(new ArrayList<>(numbers.subList(0, numbers.size() - 1))) > numbers.get(numbers.size() - 1) ? maxValue : numbers.get(numbers.size() - 1));
        }

        return maxValue;
    }
}
