package org.toledano.y2024;

import java.util.stream.Collectors;

public class Quest02 {

    public static int part1(String input) {
        int runicWordsCount = 0;

        var cleanedInput = input
            .lines()
            .filter(line -> !line.isBlank())
            .collect(Collectors.toList());
        var words = cleanedInput.get(0).substring("WORDS:".length()).split(",");
        var runicWords = cleanedInput.get(1);

        for (var word : words) {
            int index = 0;
            while ((index = runicWords.indexOf(word, index)) != -1) {
                runicWordsCount++;
                index++;
            }
        }

        return runicWordsCount;
    }

    public static int part2(String input) {
        var runicSymbolsCount = 0;

        var cleanedInput = input.lines()
            .filter(line -> !line.isBlank())
                    .collect(Collectors.toList());

        var words = cleanedInput.get(0).substring("WORDS:".length()).split(",");
        var inscriptionLines = cleanedInput.subList(1, cleanedInput.size());

        for (var line : inscriptionLines){
            for (var word : words) {
                int index = 0;
                while ((index = line.indexOf(word, index)) != -1) {
                    runicSymbolsCount += word.length();
                    index++;
                }
            }
        }

        
       return runicSymbolsCount;
    } 

}
