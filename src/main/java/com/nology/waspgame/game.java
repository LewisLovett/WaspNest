package com.nology.waspgame;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("            _  _");
        System.out.println("           | )/ )");
        System.out.println("        \\\\ |//,' __");
        System.out.println("        (\")(_)-\"()))=-");
        System.out.println("           (\\\\");

        Hive hive = new Hive();
        boolean isHiveDefeated = false;
        Random rand = new Random();
        Scanner scanObj = new Scanner(System.in);
        int randNum;
        while(!isHiveDefeated){
            System.out.println("Enter press key to attack");
            scanObj.nextLine();
            randNum = rand.nextInt(hive.getWasps().size());
            hive.hitWasp(randNum);
            hive.displayWasps();

            if(hive.getWasps().size()==0 || !hive.getHasQueen()){
                isHiveDefeated = true;
                System.out.println("The Hive has been defeated, you win!");
            }

        }

    }
}
