package org.application;

import java.util.ArrayList;

public class App {

    public static void main( String[] args ) {

        while (true) {

            Tasks tasks = new Tasks();

            Integer navigationVar = MyInput.inputInteger("""
                    Navigation menu:
                    Enter 1 to start 1st (15) task.
                    Enter 2 to start 2nd (16) task.
                    Enter 3 to start 3rd (17) task.
                    Enter any other digit to stop the program.""", Integer::valueOf);

            switch (navigationVar) {
                case 1: {
                    Integer number = MyInput.inputInteger("Enter the number:", Integer::valueOf);
                    tasks.ReverseDigits(number);
                    break;
                }
                case 2: {
                    ArrayList<Integer> numbers = new ArrayList<>();
                    tasks.CountEqToMax(numbers);

                    System.out.println("The result is:");
                    for (Integer number : numbers) {
                        System.out.println(number);
                    }
                    break;
                }
                case 3: {
                    ArrayList<Integer> numbers = new ArrayList<>();

                    System.out.println("The result is:\n" + tasks.FindMax(numbers));
                    break;
                }
                default:
                    System.exit(1);
                    break;
            }
        }
    }


}
