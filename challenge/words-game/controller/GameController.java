package main.controller;

import main.model.BusinessLogic;
import main.model.game.WordCollection;
import main.view.WordsView;

public class GameController {

    private WordCollection wordCollection;

    private BusinessLogic businessLogic;

    private WordsView wordsView;

    public GameController(WordCollection wordCollection, WordsView wordsView, BusinessLogic businessLogic) {
        this.wordCollection = wordCollection;
        this.wordsView = wordsView;
        this.businessLogic = businessLogic;
    }

    public boolean updateView(){
        wordsView.getWords( wordCollection.getLetter(), businessLogic.getWords(wordCollection) );
        return true;
    }
}