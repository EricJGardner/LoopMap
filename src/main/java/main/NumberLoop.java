package main;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class NumberLoop {
    private static final Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> getUserNumbers() {
        //ask user to input 5 numbers
        System.out.println("Please type a number: ");
        Integer firstNum = scan.nextInt();
        System.out.println("Great! You entered " + firstNum);

        System.out.println("Please type another number: ");
        Integer secNum = scan.nextInt();
        System.out.println("Awesome, you entered " + secNum);

        System.out.println("Please type a number: ");
        Integer thirdNum = scan.nextInt();
        System.out.println("Sweet! You entered " + thirdNum);

        System.out.println("Please type a number: ");
        Integer fourthNum = scan.nextInt();
        System.out.println("Stupendous! You entered " + fourthNum);

        System.out.println("Please type a number: ");
        Integer fifthNum = scan.nextInt();
        System.out.println("Wonderful! You entered " + fifthNum);
        System.out.println("Now let's play with your numbers a little bit...");

        //store numbers in an array list
    ArrayList<Integer> numList = new ArrayList<>();
        numList.add(firstNum);
        numList.add(secNum);
        numList.add(thirdNum);
        numList.add(fourthNum);
        numList.add(fifthNum);
        System.out.println("First, we will just see the numbers all together in a list");
        for (int i : numList) {
            System.out.println(i);
        }

        return numList;
    }//end getUserNumbers



    //find the sum of the numbers in list
    public static int getSum(ArrayList<Integer> numberList) {
        System.out.println("Now let's see what they all add up to");
        int sum = 0;
        for (int num : numberList)
            sum += num;
        return sum;
    }
//TODO:getProduct
    //TODO:getLargest
    //TODO:getSmallest
}//end NumberLoop

            //find the product of the numbers in list
           // System.out.println("Wonder what the product of the numbers is?");

    //find the largest of the numbers in list
       // System.out.println("How about which one is the largest number?");

    //find the smallest number in list
        //System.out.println("Finally, which is the smallest?");


