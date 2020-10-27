package com.pbo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero hero1 = new Hero();
        HeroStrength hero2 = new HeroStrength();
        HeroIntelligent hero3 = new HeroIntelligent();

        hero1.name = "Udin";
        hero2.name = "Jamal";
        hero3.name = "Ujang";

        hero1.display();
        hero2.display();
        hero3.display();

    }
}
