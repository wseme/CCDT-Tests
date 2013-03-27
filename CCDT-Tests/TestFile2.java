package ccdt.testfiles;
/*
Calculate Rectangle Area using Java Example
This Calculate Rectangle Area using Java Example shows how to calculate
area of Rectangle using it's length and width.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFile2 {
    public static void main(String[] args) {
           
            int width = 0;
            int length = 0;
                   
            try
            {
                    //read the length from console
                    BufferedReader brt = new BufferedReader(new InputStreamReader(System.in));
                   
                    System.out.println("Please enter the length of a rectangle");
                    try {
						length = Integer.parseInt(brt.readLine());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

                    //read the width from console
                    System.out.println("Please enter the width of a rectangle");
                    try {
						width = Integer.parseInt(brt.readLine());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                   
                   
            }
            //if invalid value was entered
            catch(NumberFormatException ne)
            {
                    System.out.println("Invalid value" + ne);
                    System.exit(0);
            }
            /*
             * Area of a rectangle is
             * length * width
            */
            int area2 = length* width;
            int area = length * width;
           
            System.out.println("Area of a rectangle is " + area);
    }
           
}



