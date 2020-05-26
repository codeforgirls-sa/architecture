package main.model;

import main.model.game.WordCollection;

import java.util.ArrayList;
import java.util.List;

public class BusinessLogic {

    public List<String> getWords(WordCollection wordCollection){

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        if ( ! vowels.contains(wordCollection.getLetter()))
            return (wordCollection.getWords());
        else
            throw new RuntimeException();

    }

}
