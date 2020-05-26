package main.view;

import java.util.List;

public class WordsView {

    public void getWords(char letter, List<String> words) {
        System.out.println("Words start with letter " + letter + " : { \n" + words + "}");
    }

}
