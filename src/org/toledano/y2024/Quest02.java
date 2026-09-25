package org.toledano.y2024;

import java.util.stream.Collectors;

public class Quest02 {

    public static int part1(String input) {
        int runicWordsCount = 0;

        var nonEmptyInput = input
            .lines()
            .filter(line -> !line.isBlank())
            .collect(Collectors.toList());
        var words = nonEmptyInput.get(0).substring("WORDS:".length()).split(",");
        var runicWords = nonEmptyInput.get(1).split(" ");

        for (var word :runicWords) {
            for (var w : words) {
                if (word.contains(w)) {
                    runicWordsCount++;
                }
            }
        }
        
        
        return runicWordsCount;
    }

}
