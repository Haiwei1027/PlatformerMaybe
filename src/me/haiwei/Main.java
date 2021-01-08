package me.haiwei;

import java.awt.Color;

public class Main{

    static Renderer renderer;
    static World world;
    static Player player;
    static Thread gameLoop;

    public static void main(String[] args){
        System.out.println("hello");
        player = new Player("Bob",Color.YELLOW);
        world = new World();
        world.add(player);
        renderer = new Renderer("A Game Maybe",new Vector(800,600), Color.WHITE);
        gameLoop = new Thread(renderer);
        gameLoop.start();
    }
}
