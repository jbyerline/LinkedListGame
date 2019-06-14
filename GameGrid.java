import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

    public class GameGrid {

        public static void run() {

            LinkedList test = new LinkedList();
            /*test.addNode(2, 3);
            test.addNode(3, 3);
            test.addNode(5, 6);
            test.addNode(1, 2);
            Node head = test.removeHead();
            test.display();
            System.out.println(head.getX() + " " + head.getY());
            */

            System.out.println("Use the 's' and 'd' keys to move down and left \nAvoid the '1's'");

            //2D Array
            int[][] aiGrid = new int[10][10];
            int iWallChance = 10;
            int iTempNum;
            int iUserRow = 0;
            int iUserCol = 0;
            boolean bEndLoop;

            Scanner oUserInput = new Scanner(System.in);  // Create a Scanner object


            SecureRandom oRand = new SecureRandom();

            //Loop through rows
            for (int y = 0; y < aiGrid.length; y++) {

                //Loop through cols
                for (int x = 0; x < aiGrid[y].length; x++) {

                    //Bound:10 means random numbers 0-9
                    aiGrid[y][x] = oRand.nextInt(2);
                }
            }

            //Loop through rows
            for (int y = 0; y < aiGrid.length; y++) {

                //Loop through cols
                for (int x = 0; x < aiGrid[y].length; x++) {

                    iTempNum = oRand.nextInt(100);

                    // See if wall should be placed.
                    if (iTempNum < iWallChance) {
                        aiGrid[y][x] = 1;
                    }

                    //otherwise, place a path.
                    else {
                        aiGrid[y][x] = 0;
                    }
                }
            }

            aiGrid[0][0] = 3;
            test.addNode(iUserCol,iUserRow);

            while( bEndLoop = true){

                char oInput = oUserInput.next().charAt(0);  // Read user input

                if (aiGrid[iUserCol][iUserRow] == 1){
                    System.out.println("You Failed");
                    break;
                }
                else if (iUserCol == 9 || iUserRow == 9){
                    System.out.println("You Win!");
                    test.addNode(iUserCol,iUserRow);
                    aiGrid[iUserCol][iUserRow] = 3;
                    break;
                }
                else if (oInput == 's') {

                    iUserCol++;
                    test.addNode(iUserCol,iUserRow);
                    aiGrid[iUserCol][iUserRow] = 3;
                }
                else if (oInput == 'd'){

                    iUserRow++;
                    test.addNode(iUserCol,iUserRow);
                    aiGrid[iUserCol][iUserRow] = 3;
                }



            }

            for (int y = 0; y < aiGrid.length; y++) {

                //Loop through cols
                for (int x = 0; x < aiGrid[y].length; x++) {

                    //One form of printing out array
                    //System.out.println("2D Array[" + y + "]" + "[" + x + "]" + "=" + aiGrid[y][x]);

                    //Another form for printing array

                        System.out.print(aiGrid[y][x] + " ");


                }

                System.out.println("");
            }

            System.out.println(test.count());

        }

    }

