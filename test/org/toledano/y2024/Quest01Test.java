package org.toledano.y2024;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Quest01Test {
	
	@Test
	void part1_sample_AAAAA_returns_0() {
	    String input = "AAAAA";
	    assertEquals(0, Quest01.part1(input));
	}

    @Test
    void part1_sample_ABBAC_returns_5() {
        String input = "ABBAC";
        assertEquals(5, Quest01.part1(input));
    }
}