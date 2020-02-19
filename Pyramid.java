//Dennis Livshyts
//018129928
import java.util.Scanner;
import java.util.ArrayList;
public class Pyramid {
    public static double weightonGuy(int row, int col) {
        if (row == 1) {
            return 0;
        }
        if (col == 1) {
            return (75 + weightonGuy(row - 1, col) / 2);
        }
        if (col == row) {
            return ((75 + weightonGuy(row - 1, col - 1) / 2));
        }
        else {
            return (150 + (weightonGuy(row - 1, col )/2) + (weightonGuy(row-1, col - 1)/2));
        }


    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to human pyramid\n\n");
        System.out.print("How tall is your pyramid?");
        int row = input.nextInt();
        while (row != 0) {
            ArrayList<Integer> pyramid = new ArrayList<Integer>();
            int index = 0;
            for (int z = 1; z <= row; z++) {
                for(int space =1; space<=(row-z);space++)
                {
                    System.out.printf("   ");
                }
                for (int c = 1; c <= z; c++) {
                    int w = (int) weightonGuy(z, c);
                    pyramid.add(w);
                    System.out.printf("(%4d)", pyramid.get(index));
                    index++;
                }
                System.out.println();
            }
            System.out.print("Run again? (y/n)");
            String run = input.next();
            if(run.compareTo("n")==0){
                break;
            }
            else System.out.print("How tall is the pyramid?:");
            row = input.nextInt();



        }


    }
}
