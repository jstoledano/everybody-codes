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
        var runicWords = nonEmptyInput.get(1);

        for (var word :  words) {
            int index = 0;
            while ((index = runicWords.indexOf(word, index)) != -1) {
                runicWordsCount++;
                index++;
            }
        }
        
        return runicWordsCount;
    }

}
