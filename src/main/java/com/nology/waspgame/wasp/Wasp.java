package com.nology.waspgame.wasp;

public class Wasp {
    protected int waspId;
    protected String waspType;
    protected int waspHealth;
    protected int damagePerHit;

    public Wasp(int id, String type, int health, int dmgPerHit){
        this.waspId = id;
        this.waspType = type;
        this.waspHealth = health;
        this.damagePerHit = dmgPerHit;
    }

    public int getWaspId() {
        return waspId;
    }

    public void setWaspId(int waspId) {
        this.waspId = waspId;
    }

    public String getWaspType() {
        return waspType;
    }

    public void setWaspType(String waspType) {
        this.waspType = waspType;
    }

    public int getWaspHealth() {
        return waspHealth;
    }

    public void setWaspHealth(int waspHealth) {
        this.waspHealth = waspHealth;
    }

    public int getDamagePerHit() {
        return damagePerHit;
    }

    public void setDamagePerHit(int damagePerHit) {
        this.damagePerHit = damagePerHit;
    }

    public void hitWasp(){
        this.waspHealth -= this.damagePerHit;
    }
}
