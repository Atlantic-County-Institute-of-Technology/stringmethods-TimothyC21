// Timothy Creelman
// 12-4-2023

import java.util.Scanner;

public class INSTRUCTIONS {
    public static void main(String[] args) {

        /*
        Your program should first decode this block of text and display it.
        Then, prompt the user for a name.
        Take that name and output the following:
        The name in reverse,
        the Reverse order in ALL CAPITALS,
        the original string using CaMeL cAsE,
        and finally the original string in ASCII.
        DO NOT USE ANY STRING MANIPULATION METHODS.
        */

        //Takes string of values and converts them into array by plitting into new index every space
        String instructions = "89 111 117 114 32 112 114 111 103 114 97 109 32 115 104 111 117 108 100 32 102 105 114 115 116 32 100 101 99 111 100 101 32 116 104 105 115 32 98 108 111 99 107 32 111 102 32 116 101 120 116 32 97 110 100 32 100 105 115 112 108 97 121 32 105 116 46 32 84 104 101 110 44 32 112 114 111 109 112 116 32 116 104 101 32 117 115 101 114 32 102 111 114 32 97 32 110 97 109 101 46 32 84 97 107 101 32 116 104 97 116 32 110 97 109 101 32 97 110 100 32 111 117 116 112 117 116 32 116 104 101 32 102 111 108 108 111 119 105 110 103 58 32 84 104 101 32 110 97 109 101 32 105 110 32 114 101 118 101 114 115 101 44 32 116 104 101 32 82 101 118 101 114 115 101 32 111 114 100 101 114 32 105 110 32 65 76 76 32 67 65 80 73 84 65 76 83 44 32 116 104 101 32 111 114 105 103 105 110 97 108 32 115 116 114 105 110 103 32 117 115 105 110 103 32 67 97 77 101 76 32 99 65 115 69 44 32 97 110 100 32 102 105 110 97 108 108 121 32 116 104 101 32 111 114 105 103 105 110 97 108 32 115 116 114 105 110 103 32 105 110 32 65 83 67 73 73 46 32 68 79 32 78 79 84 32 85 83 69 32 65 78 89 32 83 84 82 73 78 71 32 77 65 78 73 80 85 76 65 84 73 79 78 32 77 69 84 72 79 68 83 46 13 10";
        String[] values = instructions.split("\\s+");
        for (int i = 0; i < values.length; i++) {
            //each ASCII value converted to int, then printed as corresponding character
            int ASCII_Value = Integer.valueOf(values[i]);
            System.out.print((char)ASCII_Value);
        }

        //Scanner reads user input for name
        Scanner findName = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String user = findName.nextLine();

        //BACKWARDS
        //Loops through username starting from last index
        System.out.println();
        for (int i = user.length(); i > 0; i--) {
            //prints character at index
            System.out.print(user.charAt(i - 1));
        }

        //BACKWARDS ALL CAPS
        //Loops though username starting from last index
        System.out.println();
        for (int i = user.length(); i > 0; i--) {
            //if character is lowercase, switch to uppercase, then print
            char letterVal = user.charAt(i-1);
            if (letterVal > 96) {
                System.out.print((char)(letterVal - 32));
            } else {
                System.out.print(letterVal);
            }
        }

        //CAMEL CASE
        //Loops through username
        System.out.println();
        for (int i = 0; i < user.length(); i++) {
            char letterVal = user.charAt(i);
            if (letterVal == 32) {              //if character is a space, print the space
                System.out.print(letterVal);
            } else if (i % 2 == 0) {            //if character is in even index, make uppercase (first check if not already uppercase) 
                if (letterVal > 96) {
                    System.out.print((char)(letterVal - 32));
                } else {
                    System.out.print(letterVal);
                }
            } else {                            //if character is in odd index, make lowercase (first check if not already lowercase)
                if (letterVal < 96) {
                    System.out.print((char)(letterVal + 32));
                } else {
                    System.out.print(letterVal);
                }
            }
        }

        //CONVERT TO ASCII
        //Loops through username
        System.out.println();
        for (int i = 0; i < user.length(); i++) {
            //convert character into integer ASCII Value then print
            int character = user.charAt(i);
            System.out.print(character + " ");
        }
    }
}
