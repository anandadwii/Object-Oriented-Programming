package com.pbo;

//keyword import package external
import com.terminal.console;

class multiFilePackage {
    public static void main(String[] args) {
        Player player1 = new Player("Udin");
        Player player2 = new Player("Ujang");
        player1.show();
        player2.show();

        console.log("test");
    }
}
