package me.haiwei;

public class Body extends Collider{
    public Vector velo;
    public double mass;

    public Body(Vector _velo, double _mass,Vector _pos,Vector _size){
        super(_pos,_size);
        velo = _velo;
        mass = _mass;
    }

    public void update(){
        updatePosition();
    }
    public void updatePosition(){
        pos = pos.add(velo);
    }
    public void addForce(Vector force){
        velo = velo.add(force.div(mass));
    }
}
