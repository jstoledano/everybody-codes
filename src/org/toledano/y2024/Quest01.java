package org.toledano.y2024;

public class Quest01 {
    public static int part1(String input) {
    	int sumOfPotions = 0;
    	
    	for (int i = 0; i < input.length(); i++) {
    		sumOfPotions += (input.charAt(i)=='B') ? 1 : (input.charAt(i)=='C') ? 3 : 0;
    	}
    	
        return sumOfPotions;
    }
}