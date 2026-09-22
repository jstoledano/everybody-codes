package org.toledano.y2024;

public class Quest01 {
	public static int part1(String input) {
		int sumOfPotions = 0;

		for (int i = 0; i < input.length(); i++) {
			sumOfPotions += numberOfPotions(input.charAt(i));
		}

		return sumOfPotions;
	}

	public static int part2(String input) {
		int sumOfPotions = 0;

		for (int i = 0; i < input.length(); i += 2) {
			sumOfPotions += numberOfPotions(input.charAt(i));
			sumOfPotions += numberOfPotions(input.charAt(i + 1));

			if (input.charAt(i) != 'x' && input.charAt(i + 1) != 'x') {
				sumOfPotions += 2;
			}
		}

		return sumOfPotions;
	}

	public static int part3(String input) {
		int sumOfPotions = 0;

		for (int i = 0; i < input.length(); i += 3) {
			int monsterCount = 0;

			for (int a = 0; a <= 2; a++) {
				sumOfPotions += numberOfPotions(input.charAt(i + a));
				monsterCount += input.charAt(i + a) != 'x' ? 1 : 0;
			}

			sumOfPotions += switch (monsterCount) {
				case 3 -> 6;
				case 2 -> 2;
				default -> 0;
			};
		}

		return sumOfPotions;
	}

	static int numberOfPotions(char c) {
		return switch (c) {
			case 'B' -> 1;
			case 'C' -> 3;
			case 'D' -> 5;
			default -> 0;
		};
	}

}