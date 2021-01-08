package me.haiwei;

import java.awt.Graphics;
import java.awt.Color;

public class Player extends Body implements Renderable{

    public Color color;
    public String name;

    public Player(String _name, Color _color,Vector _velo,double _mass,Vector _pos, Vector _size){
        super(_velo,_mass,_pos,_size);
        color = _color;
        name = _name;
    }
    public Player(String _name, Color _color,Vector _pos, Vector _size){
        super(new Vector(0,0),1,_pos,_size);
        color = _color;
        name = _name;
    }
    public Player(String _name, Color _color){
        super(new Vector(0,0),1,new Vector(0,0),new Vector(0,0));
        color = _color;
        name = _name;
    }

    @Override
    public void draw(Graphics g) {
        Vector corner = pos.sub(size.div(2));
        g.setColor(color);
        g.fillRect(
                corner.getIntX(),corner.getIntY(),
                size.getIntX(),size.getIntY());
        System.out.println("Drawn Player");
    }
}
