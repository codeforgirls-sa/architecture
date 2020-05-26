package main.model.game;

import java.util.List;

public class WordCollection {
    private char letter;

    private List<String> words;

    public WordCollection(char letter, List<String> words) {
        this.letter = letter;
        this.words = words;
    }

    public char getLetter() {
        return letter;
    }

    public List<String> getWords() {
        return words;
    }
}
