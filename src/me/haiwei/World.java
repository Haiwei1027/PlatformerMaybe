package me.haiwei;

import java.util.ArrayList;
import java.awt.Graphics;
import java.util.Iterator;

public class World {
    private ArrayList<Renderable> drawables = new ArrayList<>();

    public void drawAll(Graphics g){
        Iterator iterator = drawables.iterator();
        if (iterator.hasNext()){
            Renderable drawable = (Renderable) iterator.next();
            drawable.draw(g);
        }
    }
    public void add(Renderable object){
        drawables.add(object);
    }
}
