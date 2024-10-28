package com.mycompany.foottometers;

// Our main app class
public class FootToMeters {
    
    // Method that returns a conversion from a foot to a meter.
    public static double footToMeter(double foot){
        double meterResult = 0.305 * foot;
        return meterResult;
    }
   
    // Method that returns a conversion from a meter to a foot.
    public static double meterToFoot(double meter){
        double footResult = 3.279 * meter;
        return footResult;
    }

    // Our main method where our program runs. 
    public static void main(String[] args) {
        
        // Array of feet we want to convert to meters, and meters we want to convert into feet. 
        double[] footData = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};  
        double[] meterData = {20.0, 25.0, 30.0, 35.0, 40.0, 45.0, 50.0, 55.0, 60.0, 65.0}; 
        
        // Printing the top of the table
        System.out.println("Feet    Meters  |   Meters   Feet");
        System.out.println("=================================");
        System.out.println("0.00    0.00        0.00     0.00");
        
        /* A for loop to calculate the Feet to Meters, and Meters to Feet. We 
        use the length of the footdata list as our sentinel value or loop stopping
        point as the length is similar to the other list. */
        for (int i = 0; i < footData.length; i++){
            
            // Results
            String resultFoot = Double.toString(meterToFoot(meterData[i]));
            String resultMeter = Double.toString(footToMeter(footData[i])); 
            
            // Current Foot and Meter
            String currentFoot = Double.toString(footData[i]);
            String currentMeter = Double.toString(meterData[i]);
            
            System.out.println(currentFoot + "     " + resultMeter + "       " + currentMeter + "     " + resultFoot);
            
        }
        
    }
}
