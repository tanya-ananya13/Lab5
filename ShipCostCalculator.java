package com.company;

public class Main {

    // Pseudocode
        // class CalculateShippingCost
            // main() // Start
                // Declare variables
                //double itemPrice
                //num shippingCost
                // Prompt and input
                //output “Enter the Item Price”
                 //input itemPrice
                // Process
                //if itemPrice >= 100 then
                    //shippingCost = 0
                //else
                    //shippingCost = itemPrice * 0.02
                //endIf
                // Output
                    //output “The shipping cost is ” + shippingCost + “and the total cost is ” + shippingCost + itemPrice
            //returns
        //end class


    public static void main(String[] args)
    {
        double itemPrice = 10;
        double shippingCost = 0;
        double totalCost = 0;
        System.out.println("Please enter the item price");
        if (itemPrice >= 100)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = itemPrice * 0.02;

        }
        totalCost = shippingCost + itemPrice;
        System.out.println("The shipping cost is $" + shippingCost + " of the item price which is $" + itemPrice + " is a total cost of $" + totalCost);
    }
}
