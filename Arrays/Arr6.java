package Smart;

import java.util.Arrays;

public class Arr6 {

	    public static int[] distributeCandies(int candies, int num_people) {
	        int[] distribution = new int[num_people];
	        int total = 0;
	        int i = 0;

	        // Distribute candies while they last
	        while (candies > 0) {
	            distribution[i % num_people] += Math.min(++total, candies);
	            candies -= total;
	            i++;
	        }

	        return distribution;
	    }

	    public static void main(String[] args) {
	        int candies = 7;
	        int num_people = 4;
	        System.out.println(Arrays.toString(distributeCandies(candies, num_people))); // Output: [1, 2, 3, 1]

	        candies = 10;
	        num_people = 3;
	        System.out.println(Arrays.toString(distributeCandies(candies, num_people))); // Output: [5, 2, 3]
	    }
	}

	
	
	/*
	    public static int[] distributeCandies(int candies, int num_people) {
	        int[] distribution = new int[num_people];
	        int i = 0;
	        int currentCandy = 1;

	        // Keep distributing candies until none are left
	        while (candies > 0) {
	            // Find the index of the person who will receive candies
	            int index = i % num_people;

	            // Distribute the lesser of currentCandy or remaining candies
	            distribution[index] += Math.min(currentCandy, candies);

	            // Reduce the number of remaining candies
	            candies -= currentCandy;

	            // Increment for the next round of candy distribution
	            currentCandy++;
	            i++;
	        }

	        return distribution;
	    }

	    public static void main(String[] args) {
	        int candies = 7;
	        int num_people = 4;
	        System.out.println(Arrays.toString(distributeCandies(candies, num_people))); // Output: [1, 2, 3, 1]

	        candies = 10;
	        num_people = 3;
	        System.out.println(Arrays.toString(distributeCandies(candies, num_people))); // Output: [5, 2, 3]
	    }
	    */

