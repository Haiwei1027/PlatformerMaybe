package me.haiwei;

public class Vector {
    public double x;
    public double y;

    public Vector(double _x, double _y){
        x = _x;
        y = _y;
    }
    public double get(int index){
        if (new Range(0,1).isIn(index,true)){
            try {
                switch (index) {
                    case (0):
                        return x;
                    case (1):
                        return y;
                    default:
                        throw new Exception("me.haiwei.Vector get value dimension error");
                }
            }
            catch(Exception e){
                e.printStackTrace();
                return -1;
            }
        }
        else{
            return -1;
        }
    }
    public int getIntX(){
        return (int)Math.round(x);
    }
    public int getIntY(){
        return (int)Math.round(y);
    }
    public Vector add(Vector operand){
        return new Vector(x+operand.x,y+operand.y);
    }
    public Vector sub(Vector operand){
        return new Vector(x-operand.x,y-operand.y);
    }
    public Vector mult(double operand){
        return new Vector(x*operand,y*operand);
    }
    public Vector div(double operand){
        return new Vector(x/operand,y/operand);
    }
}
