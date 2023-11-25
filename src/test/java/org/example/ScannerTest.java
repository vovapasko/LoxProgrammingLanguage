package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ScannerTest {

    @Test
    void scanTokensFromString() {
        String inputString = "print \"Hello world\";";
        Scanner scanner = new Scanner(inputString);

        List<Token> actualTokens = new ArrayList<>();
        var expectedTokens = scanner.scanTokens();
        assertEquals(actualTokens, expectedTokens);
    }

    @Test
    void scanTokensFromFile() throws IOException {
        String sourceCode = Utils.getStringFromFile("resources/testfile.lox");
        Scanner scanner = new Scanner(sourceCode);

        List<Token> actualTokens = new ArrayList<>();
        var expectedTokens = scanner.scanTokens();
        assertEquals(actualTokens, expectedTokens);
    }

}