package org.toledano.cli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
	public static void main(String[] args) throws IOException {
		solve(2024, 1, 1, org.toledano.y2024.Quest01::part1);
		solve(2024, 1, 2, org.toledano.y2024.Quest01::part2);
		solve(2024, 1, 3, org.toledano.y2024.Quest01::part3);
	}

	private static void solve(
			int year,
			int quest,
			int part,
			java.util.function.ToIntFunction<String> solution) throws IOException {
		Path notesPath = Path.of(
				"resources/y%d/quest%02d/part%d.txt"
						.formatted(year, quest, part));

		String notes = Files.readString(notesPath).strip();
		int result = solution.applyAsInt(notes);

		System.out.printf(
				"%d · Quest %02d · Parte %d: %d%n",
				year, quest, part, result);
	}
}