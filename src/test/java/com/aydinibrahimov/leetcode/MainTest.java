package com.aydinibrahimov.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainWhenCalledThenOutputIsCorrect() {
        // Arrange
        String[] args = {};
        String expectedOutput = "UUU UUU CCCRRRCCCRRR ";

        // Act
        Main.main(args);

        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMainWhenCalledThenOutput() {
        // Arrange
        String[] args = {};
        String expectedOutput = "UUU UUU CCCRRRCCCRRR ";

        // Act
        Main.main(args);

        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }
}