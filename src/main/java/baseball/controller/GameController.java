package baseball.controller;

import baseball.model.GameModel;
import baseball.view.GameView;

public class GameController {

    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
    }

    public void runGame() {

        view.showStartMessage();
        int userInput = view.getUserInput();

    }
}
