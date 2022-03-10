package activities;

import java.util.Arrays;

public class Activity2 {
	public static void main (String[] args)
	{
		int[] numarr = {10, 77, 10, 54, -11, 10};
		System.out.println("Original Array : " + Arrays.toString(numarr));
		
		int srchnum = 10;
		int sum = 30;
			
		System.out.println("Result: " + result(numarr, srchnum, sum));
	}

	private static boolean result(int[] numarr, int srchnum, int sum) {
		int temp_sum = 0;
				
		//Loop through array
        for (int number : numarr) {
            //If value is 10
            if (number == srchnum) {
                //Add them
                temp_sum += srchnum;
            }

            //Sum should not be more than 30
            if (temp_sum > sum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == sum;
	}

}
