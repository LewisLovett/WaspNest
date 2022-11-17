package com.nology.waspgame;

import com.nology.waspgame.wasp.Drone;
import com.nology.waspgame.wasp.Queen;
import com.nology.waspgame.wasp.Wasp;
import com.nology.waspgame.wasp.Worker;

import java.util.ArrayList;

public class Hive {
    protected ArrayList<Wasp> wasps = new ArrayList<>();
    protected boolean hasQueen = true;

    public boolean getHasQueen() {
        return hasQueen;
    }
    public void setHasQueen(boolean hasQueen) {
        this.hasQueen = hasQueen;
    }



    public ArrayList<Wasp> getWasps() {
        return wasps;
    }

    public void setWasps(ArrayList<Wasp> wasps) {
        this.wasps = wasps;
    }

    public Hive() {

        Queen queen = new Queen(0);
        this.wasps.add(queen);
        for(int i = 1;i<6;i++){
            Worker worker = new Worker(i);
            this.wasps.add(worker);
        }
        for(int i = 6;i<14;i++){
            Drone drone = new Drone(i);
            this.wasps.add(drone);
        }



    }

    public void displayWasps(){
        String currentType = "Queen";
        for(Wasp wasp :wasps){
            if(!currentType.equals(wasp.getWaspType())){
                currentType = wasp.getWaspType();
                System.out.println("");
            }
            System.out.print("[ " + wasp.getWaspType() + " : " + wasp.getWaspHealth() + " ]");
        }
        System.out.println("");
    }
    public void hitWasp(int waspIndex){
        Wasp wasp = wasps.get(waspIndex);
        wasp.hitWasp();
        if(wasp.getWaspHealth()==0){
            if (wasp.getWaspType().equals("Queen" )){
                hasQueen = false;
            }
            wasps.remove(waspIndex);
        }
    }

}
