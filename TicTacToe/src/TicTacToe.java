import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int position = 1;
        Scanner input = new Scanner(System.in);

        GameBoard game1 = new GameBoard();

        while(game1.hasEmptySpace() == true || game1.winner() == null){
            do{
                System.out.println("Your turn! Enter a position: ");
                position = input.nextInt();
                
                if(position > 10 || position < 0){
                    System.out.println("Please enter a valid position");
                }
                else if(!game1.isEmpty(position)){
                    System.out.println("That position has already been taken.");
                }
                
            }while(!game1.isEmpty(position) ||( position > 10 || position < 0));

            game1.placeSymbol(position);
            if(game1.winner() != null || !game1.hasEmptySpace()){
                break;
            }
            game1.makeMove();
            if(game1.winner() != null || !game1.hasEmptySpace()){
                break;
            }
            

        }
        
    }
}
