package main;

import main.controller.GameController;
import main.model.BusinessLogic;
import main.model.game.WordCollection;
import main.view.WordsView;

import java.util.ArrayList;
import java.util.List;


public class Tdd {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Bus");
        words.add("Book");
        words.add("Baking");
        words.add("Ball");


        WordCollection wordCollection = new WordCollection('B', words);
        GameController gameController = new GameController(wordCollection, new WordsView(), new BusinessLogic());

       gameController.updateView();
    }
}
