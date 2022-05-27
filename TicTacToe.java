package com.bridgeLabz.WorkshopProgram;

public class TicTacToe {

    private int counter;
    private int char[] posn = new char[10];
    private char player;

    public static void main(String[] args) {
        System.out.println("Welcome to workshop program TicTacToe game ");

    }
    public void newBoard()
    {
        char[] posndef = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i;
        counter = 0;
        player = 'X';
        for (i=1; i<10; i++)
            posn[i] = posndef[i];


    }

}

