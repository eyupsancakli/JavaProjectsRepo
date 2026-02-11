import java.util.Scanner;

public class TreasureGame{
    public static void main(String []args){

        //1.Initializing the Game board

        String[ ] boxes = {"Empty", "Empty", "Empty", "Treasure", "Empty"};
        Scanner input = new Scanner(System.in);

        System.out.println("=====Guess the Treasure Number====");
        System.out.println("There are 5 Boxes, listed 0 to 4, Do you know, where is the Gold?");

        /////////////////
        /// Second Part
        /// Get the Player Guessed Numbers
        ////////////////
        System.out.println("Enter your lucky number!");
        int choice = input.nextInt();

        //////////////////
        /// Logic 
        /// /////////////
        if ( choice < 0 || choice >= boxes.length){
            System.out.println("The box does not exist, please choose from 0 to 4");
        } else if (boxes[choice].equals("Treasure")){
            System.out.println("Jackpot!! -- You found the gold in the box number" + choice + "!");
        } else {
            System.out.println("Sorry the box" + choice + "is empty :( ");
        }
        input.close();
        

    }
}