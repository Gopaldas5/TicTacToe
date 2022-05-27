package com.bridgeLabz.WorkshopProgram;

import java.util.Scanner;

public class TicTacToe {

    private static boolean first = false;
    private static char[][] board = new char[3][3];
    private static int aiScore = 0;
    private static int playerScore = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to workshop program TicTacToe game ");

        intro();
        playerToChoose_uc2();
    }
    public static void intro(){

        Scanner console = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("To play this classic game against the computer,");
        System.out.println("You will choose where to play using coordinates(1-3)");
        System.out.println("");
        System.out.println("Would you like to go first?");
        String goFirst = console.nextLine();
        if(goFirst.substring(0,1).equalsIgnoreCase("y")){
            first = true;
        }
        initializeBoard();
        getBoard();
    }

    public static void initializeBoard(){

        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                board[r][c] = ' ';
            }
        }

    }

        static void playerToChoose_uc2(){

        Scanner sc = new Scanner(System.in);
        char user = sc.next().charAt(0);
        char computer;
        if (user == 'X'){
            System.out.println("User choose X");
            System.out.println("Computer have O");
            computer = 'O';
        }else {
            System.out.println("User choose O");
            System.out.println("Computer have X");
            computer = 'X';
        }
    }

    public static void getBoard(){

        String bar = "  =============";
        System.out.println("    1   2   3");
        System.out.println(bar);
        System.out.println("1   " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(bar);
        System.out.println("2   " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(bar);
        System.out.println("3   " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println(bar);
        System.out.println("");


    }


}

