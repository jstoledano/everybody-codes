package org.toledano.y2024;

public class Quest01 {
    public static int part1(String input) {
    	int sumOfPotions = 0;
    	
    	for (int i = 0; i < input.length(); i++) {
    		sumOfPotions += (input.charAt(i)=='B') ? 1 : (input.charAt(i)=='C') ? 3 : 0;
    	}
    	
        return sumOfPotions;
    }
    
    public static int part2(String input) {
    	int sumOfPotions = 0;
    	
    	int B = 1;
    	int C = 3;
    	int D = 5;
    	
    	for (int i = 0; i < input.length(); i+=2) {
    		if (input.charAt(i) != 'x' || input.charAt(i+1) != 'x') {
    			sumOfPotions += 2;
    		}
    		if (input.charAt(i) == 'B' || input.charAt(i+1) == 'B') {
    			sumOfPotions += B;
    		}
    		if (input.charAt(i) == 'C' || input.charAt(i+1) == 'C') {
    			sumOfPotions += C;
    		}
    		if (input.charAt(i) == 'D' || input.charAt(i+1) == 'D') {
    			sumOfPotions += D;
    		}
    		
    		    		
    	}
    	
        return sumOfPotions;
    }
}