package com.gmd.lesson6.solid.srp;

/**
 * Created by emedinaa on 18/07/16.
 */
public class TerminalBoardPresenter implements BoardPresenter {

    private final BoardState boardState;

    public TerminalBoardPresenter(BoardState boardState) {
        this.boardState = boardState;
    }

    @Override
    public NBoard displayBoard() {
        System.out.println("TerminalBoardPresenter displayBoard");
        return new NBoard();
    }
}
