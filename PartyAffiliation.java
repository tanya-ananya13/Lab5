package com.company;

public class Main {

    //class PartyAffiliation
        //main()
            // Declare variables
            //String affiliation
            // Prompt and input
            //output “Enter your party affiliation”
                //input affiliation
            // Process and output
            //If affiliation = "Democrat" then
                //output “You get a Democratic Donkey."
            //else if affiliation = "Republican" then
                //output “You get a Republican Elephant."
            //else affiliation = "Independent" then
                //output “You get an Independent Man."
            // endIf
        //return
    //end class


    public static void main(String[] args) {
        String affiliation = "Independent";
        System.out.println("Please enter your party affiliation");
        if (affiliation == "Democrat") {
            System.out.println("You get a Democratic Donkey");
        }
        else if (affiliation == "Republican")
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (affiliation == "Independent")
        {
            System.out.println("You get an Independent Man");
        }
        else
        {
            System.out.println("You have entered a different party: " + affiliation);
        }
    }
}
