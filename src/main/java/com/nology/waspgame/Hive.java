package com.nology.waspgame;

import com.nology.waspgame.wasp.Drone;
import com.nology.waspgame.wasp.Queen;
import com.nology.waspgame.wasp.Wasp;
import com.nology.waspgame.wasp.Worker;

import java.util.ArrayList;

public class Hive {
    protected ArrayList<Wasp> wasps = new ArrayList<>();

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

}
