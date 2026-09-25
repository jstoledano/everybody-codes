package org.toledano.y2024;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Quest02Test {

    @Test
    void part1_sample_returns_4() {
        String input = """
                WORDS:THE,OWE,MES,ROD,HER

                AWAKEN THE POWER ADORNED WITH THE FLAMES BRIGHT IRE
                """;
        assertEquals(4, Quest02.part1(input));
    }

    @Test
    void part2_sample_full_inscription_returns_42() {
        var input = """
            WORDS:THE,OWE,MES,ROD,HER,QAQ
            
            AWAKEN THE POWE ADORNED WITH THE FLAMES BRIGHT IRE
            THE FLAME SHIELDED THE HEART OF THE KINGS
            POWE PO WER P OWE R
            THERE IS THE END
            QAQAQ
            """;
        
        assertEquals(42, Quest02.part2(input));
    }
}
