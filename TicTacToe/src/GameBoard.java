import java.util.ArrayList;
import java.util.Collections;

public class GameBoard {
    
    private char[][] board;
    private char[][] instructionBoard = {{'1','|','2','|','3'},{'-','+','-','+','-'},{'4','|','5','|','6'},{'-','+','-','+','-'},{'7','|','8','|','9'}};
    private ArrayList<Integer> playerPosition = new ArrayList<Integer>();
    private ArrayList<Integer> computerPosition = new ArrayList<Integer>();

    //creates gameboard and prints instructions
    public GameBoard(){
        char[][] makeBoard = {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
        board = makeBoard;

        System.out.println("Let's play TicTacToe! Below are the number placements for each spot. Enter the number of the spot you want to place your symbol.");
        for(char[] row : instructionBoard){
            for(char spot : row){
                System.out.print(spot);
            }
            System.out.println();
        }
        System.out.println();
    }

    //prints board
    public void printBoard(){
        for(char[] row : board){
            for(char spot : row){
                System.out.print(spot);
            }
            System.out.println();
        }
        System.out.println();
    }

    //checks if board has empty space
    public boolean hasEmptySpace(){
        for(char[] row : board){
            for(char spot : row){
                if(spot == ' '){
                    return true;
                }
            }
        }
        return false;
    }

    //player's move based on input position
    public void placeSymbol(int position){
        switch(position){
            case 1:
                if(board[0][0] == ' '){
                    board[0][0] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 2:
                if(board[0][2] == ' '){
                    board[0][2] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 3:
                if(board[0][4] == ' '){
                    board[0][4] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 4:
                if(board[2][0] == ' '){
                    board[2][0] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 5:
                if(board[2][2] == ' '){
                    board[2][2] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 6:
                if(board[2][4] == ' '){
                    board[2][4] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 7:
                if(board[4][0] == ' '){
                    board[4][0] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 8:
                if(board[4][2] == ' '){
                    board[4][2] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            case 9:
                if(board[4][4] == ' '){
                    board[4][4] = 'X';
                    playerPosition.add(position);
                    printBoard();
                }
                break;
            default:
                break;
        }
    }

    //computer's move
    public void makeMove(){
        int move = 0;

        System.out.println("Computer's Turn:");

        while(!isEmpty(move)){
            move = (int) (Math.random()*9+1);
        }

        switch(move){
            case 1:
                if(board[0][0] == ' '){
                    board[0][0] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 2:
                if(board[0][2] == ' '){
                    board[0][2] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 3:
                if(board[0][4] == ' '){
                    board[0][4] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 4:
                if(board[2][0] == ' '){
                    board[2][0] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 5:
                if(board[2][2] == ' '){
                    board[2][2] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 6:
                if(board[2][4] == ' '){
                    board[2][4] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 7:
                if(board[4][0] == ' '){
                    board[4][0] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 8:
                if(board[4][2] == ' '){
                    board[4][2] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            case 9:
                if(board[4][4] == ' '){
                    board[4][4] = 'O';
                    computerPosition.add(move);
                    printBoard();
                }
                break;
            default:
                break;
        }
        
    }

    //returns whether a position is empty
    public boolean  isEmpty(int position){
        switch(position){
            case 1:
                if(board[0][0] == ' '){
                    System.out.println(board[0][0]);
                    return true;
                }
                return false;
            case 2:
                if(board[0][2] == ' '){
                    return true;
                }
                return false;
            case 3:
                if(board[0][4] == ' '){
                    return true;
                }
                return false;
            case 4:
                if(board[2][0] == ' '){
                    return true;
                }
                return false;
            case 5:
                if(board[2][2] == ' '){
                    return true;
                }
                return false;
            case 6:
                if(board[2][4] == ' '){
                    return true;
                }
                return false;
            case 7:
                if(board[4][0] == ' '){
                    return true;
                }
                return false;
            case 8:
                if(board[4][2] == ' '){
                    return true;
                }
                return false;
            case 9:
                if(board[4][4] == ' '){
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    //determines if game has winner. if not return null
    public String winner(){
        Collections.sort(playerPosition);
        Collections.sort(computerPosition);
        int playerCount = 0;
        int computerCount = 0;

        if(!isEmpty(1) && !isEmpty(2) && !isEmpty(3)){
            int[] winPosition = {1, 2, 3};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }
        else if(!isEmpty(4) && !isEmpty(5) && !isEmpty(6)){
            int[] winPosition = {4, 5, 6};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }
        else if(!isEmpty(7) && !isEmpty(8) && !isEmpty(9)){
            int[] winPosition = {7, 8, 9};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }
        else if(!isEmpty(1) && !isEmpty(5) && !isEmpty(9)){
            int[] winPosition = {1, 5, 9};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }
        else if(!isEmpty(3) && !isEmpty(5) && !isEmpty(7)){
            int[] winPosition = {3, 5, 7};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }
        else if(!isEmpty(1) && !isEmpty(4) && !isEmpty(7)){
            int[] winPosition = {1, 4, 7};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }
        else if(!isEmpty(2) && !isEmpty(5) && !isEmpty(8)){
            int[] winPosition = {2, 5, 8};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }
        else if(!isEmpty(3) && !isEmpty(6) && !isEmpty(9)){
            int[] winPosition = {3, 6, 9};

            if(winPosition != null){
                for(int position : winPosition){
                    if(playerPosition.contains(position)){
                        playerCount++;
                    }
                    else if(computerPosition.contains(position)){
                        computerCount++;
                    }
                }
            }
        }

        
        
        if(playerCount == 3){
            System.out.println("Game Over! You've won!");
            return "Player";
        }
        else if(computerCount == 3){
            System.out.println("Game Over! The computer won!");
            return "Computer";
        }
        else{
            return null;
        }

    }
}
