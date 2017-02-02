package com.gmd.lesson6.solid.srp;

/**
 * Created by emedinaa on 18/07/16.
 */
public class Main {

    public static void main(String[] args) {

        TerminalBoardPresenter terminalBoardPresenter =
                new TerminalBoardPresenter(new BoardState());

        BrowserBoardPresenter boardPresenter =
                new BrowserBoardPresenter(new BoardState());

        terminalBoardPresenter.displayBoard();

        boardPresenter.displayBoard();
    }
}
