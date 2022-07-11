package com.company;

public class Main {

    //class CompareInputs
        //main()
        // Declare variables
        //num input1
        //num input2
        // Prompt and input
        //output “Enter Input 1”
            //input input1
        //output “Enter Input 2”
            //input input2
        // Process
        //if input1 = input2 then
            //output “The Input 1 " + input1 + "is equal to " + input2
        //else if input1 < input2
            //output “The Input 1 " + input1 + "is less than " + input2
        //else if input1 > input2
            //output “The Input 1 " + input1 + "is greater than " + input2
        //else
            // output "You have entered a non=number for the input. Please try again."
        //endIf
        //return
    //end class


    public static void main(String[] args)
    {
	    int input1 =3;
	    int input2 =3;
	    String input = "one";
        System.out.println("Enter Input 1");
        System.out.println("Enter Input 2");
        if (input1 == input2)
        {
            System.out.println("The Input 1 " + input1 + " is equal to " + input2);
        }
        else if (input1 < input2)
        {
            System.out.println("The Input 1 " + input1 + " is less than " + input2);
        }
        else if (input1 > input2)
        {
            System.out.println("The Input 1 " + input1 + " is more than " + input2);
        }
        else
        {
            System.out.println("You have not entered an input that is not a number. Please try again." + input);
        }
    }
}
