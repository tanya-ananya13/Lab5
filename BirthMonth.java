package com.company;

public class Main {


    //class validateUserBirthMonth
        //main()
            // Declare variables
            //num birthMonth
            // Prompt and input
            //output “Enter your Birth Month [1 – 12]”
                // input birthMonth
             // Process
            //if birthMonth <= 12 then
                //output “Your birth month is: " + birthMonth
            //else if birhtMonth > 12 then
                // output “You entered an incorrect month value: " + birthMonth
            //else birhtMonth < 1 then
                //output “You entered an incorrect month value: " + birthMonth
            //endIf
        //return
    // end class


    public static void main(String[] args)
    {
        int birthMonth = 11;
        System.out.println("Please enter your birth month [1-12]");
        if (birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else if (birthMonth > 12)
        {
            System.out.println("You entered an incorrect birth month: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect birth month: " + birthMonth);
        }

    }
}
