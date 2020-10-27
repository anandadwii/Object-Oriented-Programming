package com.pbo;

class Player{
    public String name;

    Player(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show(){
        System.out.println("player name : "+this.name);
    }
}

