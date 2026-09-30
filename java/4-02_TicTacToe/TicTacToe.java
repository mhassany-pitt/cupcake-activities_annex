/*
 * A simple game of Tic Tac Toe!
 * 
 */
import java.util.Scanner;

public class TicTacToe {

	// This array stores the current state of the board.  Each element has
	//  one of three values:
	//  'X'
	//  'O'
	//  ' '  (for an empty spot)
	static char[][] theBoard = new char[3][3];
	
	// This method prints the current board on the screen.
	public static void printBoard() {
		for (int i = 0; i < theBoard.length; i++) {
			for (int j = 0; j < theBoard[i].length; j++) {
				System.out.print(theBoard[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// This method determines whether the game is still going.  It returns
	//  true if the game is in progress, or false if the game is over.
	public static boolean isGameStillGoing() {
		// Check for victory by X
		if (	theBoard[0][0] == 'X' && theBoard[0][1] == 'X' && theBoard[0][2] == 'X'	||
				theBoard[1][0] == 'X' && theBoard[1][1] == 'X' && theBoard[1][2] == 'X' ||
				theBoard[2][0] == 'X' && theBoard[2][1] == 'X' && theBoard[2][2] == 'X' ||
				theBoard[0][0] == 'X' && theBoard[1][0] == 'X' && theBoard[2][0] == 'X' ||
				theBoard[0][1] == 'X' && theBoard[1][1] == 'X' && theBoard[2][1] == 'X' ||
				theBoard[0][2] == 'X' && theBoard[1][2] == 'X' && theBoard[2][2] == 'X' ||
				theBoard[0][0] == 'X' && theBoard[1][1] == 'X' && theBoard[2][2] == 'X' ||
				theBoard[0][2] == 'X' && theBoard[1][1] == 'X' && theBoard[2][0] == 'X' ) {
			return false;
		}
		
		// Check for victory by O
		if (	theBoard[0][0] == 'O' && theBoard[0][1] == 'O' && theBoard[0][2] == 'O'	||
				theBoard[1][0] == 'O' && theBoard[1][1] == 'O' && theBoard[1][2] == 'O' ||
				theBoard[2][0] == 'O' && theBoard[2][1] == 'O' && theBoard[2][2] == 'O' ||
				theBoard[0][0] == 'O' && theBoard[1][0] == 'O' && theBoard[2][0] == 'O' ||
				theBoard[0][1] == 'O' && theBoard[1][1] == 'O' && theBoard[2][1] == 'O' ||
				theBoard[0][2] == 'O' && theBoard[1][2] == 'O' && theBoard[2][2] == 'O' ||
				theBoard[0][0] == 'O' && theBoard[1][1] == 'O' && theBoard[2][2] == 'O' ||
				theBoard[0][2] == 'O' && theBoard[1][1] == 'O' && theBoard[2][0] == 'O' ) {
			return false;
		}
		
		// Check for stalemate
		for (int i = 0; i < theBoard.length; i++) {
			for (int j = 0; j < theBoard[i].length; j++) {
				if (theBoard[i][j] == 0)	// Empty spaces left - game must still be going!
					return true;
			}
		}

		// The only way for this point to be reached is if the method hasn't
		//  returned anything yet.  This must mean that neither player has won,
		//  and there are no empty spaces left.  Must be a stalemate!
		return false;
	}

	// Run this method to play the game!
	public static void playGame() {
		Scanner s = new Scanner(System.in);
		
		while (isGameStillGoing()) {
			// Have player X move
			System.out.println("Player X's turn!");
			System.out.println("Enter the row and column where you'd like to make your move!");
			int row = s.nextInt(), col = s.nextInt();
			theBoard[row][col] = 'X';
			printBoard();
			
			// Player X's turn might have ended the game, so we need to check
			//  this condition immediately here.
			if (!isGameStillGoing())
				break;
			
			// Have player O move
			System.out.println("Player O's turn!");
			System.out.println("Enter the row and column where you'd like to make your move!");
			row = s.nextInt();
			col = s.nextInt();
			theBoard[row][col] = 'O';
			printBoard();
		}
	}
	
	public static void main(String[] args) {
//		theBoard[0][0] = 'X';
//		theBoard[0][2] = 'O';
//		theBoard[1][1] = 'X';
//		theBoard[2][2] = 'O';
//		theBoard[1][2] = 'O';
//		printBoard();
//		System.out.println(isGameStillGoing());
		
		playGame();
	}

}