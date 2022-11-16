package com.nology.waspgame;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("               _  _");
        System.out.println("              | )/ )");
        System.out.println("           \\ |//,' __");
        System.out.println("           (\")(_)-\"()))=-");
        System.out.println("               (\\\\");
        Hive hive = new Hive();
        Boolean isHiveDefeated = false;
        Random rand = new Random();
        Scanner scanObj = new Scanner(System.in);
        String userInput;
        int randNum;
        while(!isHiveDefeated){
            System.out.println("Enter press key to attack");
            userInput = scanObj.nextLine();


                randNum = rand.nextInt(14);
                hive.getWasps().get(randNum).getWaspId();
                hive.displayWasps();


        }

    }
}
