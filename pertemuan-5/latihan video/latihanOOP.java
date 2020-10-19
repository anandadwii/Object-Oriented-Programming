package com.pbo;

//player
class Player{
    String name;
    double hp;
    int level;

    //object member
    weapon weapon;
    armor armor;

    Player(String name, double hp, int level){
        this.name=name;
        this.hp=hp;
        this.level=level;
    }

    void attack(Player lawan){

        double power = this.weapon.power;
        System.out.println(this.name + " attack "+lawan.name+" with power "+power);
        lawan.defence(power);
    }
    void defence(double power){


        //taking damage
        // kalau attack power > defense, maka damage = attack power - def power
        double damage;
        if (this.armor.resistence < weapon.power){
            damage = weapon.power - this.armor.resistence;
        }else{
            damage =0;
        }
        this.hp -= damage;
        System.out.println(this.name + " got damaged "+damage);
    }

    void equipWeapon(weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(armor armor){
        this.armor=armor;
    }

    void display(){
        System.out.println("\nNama : "+this.name);
        System.out.println("Level : "+this.level);
        System.out.println("Helath : "+this.hp+" hp");
        this.armor.display();
        this.weapon.display();
    }
}
//senjata
class weapon{
    double power;
    String name;

    weapon(double power, String name){

        this.power = power;
        this.name = name;
    }
    void display(){
        System.out.println("weapon : "+this.name+" ,power : "+this.power);
    }
}

class armor{
    double resistence;
    String name;

    armor(double resistance, String name){
        this.resistence=resistance;
        this.name=name;
    }
    void display(){
        System.out.println("Armor : "+this.name+" ,Resistance : "+this.resistence);
    }
}
public class latihanOOP {
    public static void main(String[] args) {

        //membuat objek player
        Player player = new Player("Dodi",150,10);
        Player player2 = new Player("Bedul",300,40);
        //membuat weapon
        weapon kunai = new weapon(15,"kunai");
        weapon shuriken = new weapon(30,"Shuriken");
        //membuat armor
        armor baju = new armor(12,"Zirah");
        armor tameng = new armor(400,"Tameng Mahasiswa");

        //equi[ senjata dan armor
        //masukin senjata
        player.equipWeapon(kunai);
        player2.equipWeapon(shuriken);

        //masukin baju
        player.equipArmor(baju);
        player2.equipArmor(tameng);
        //display produk
        player.display();
        player2.display();

        System.out.println("pertempuran");
        System.out.println("\nepisode 1 \n");
        player.attack(player2);
        player.display();
        player2.display();
        System.out.println("\nepisode 2\n");
        player2.attack(player);
        player.display();
        player2.display();


    }
}
