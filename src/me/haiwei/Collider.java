package me.haiwei;

public class Collider {
    public Vector pos;
    public Vector size;

    public Collider(Vector _pos, Vector _size){
        pos = _pos;
        size = _size;
    }

    private double getMin(int index){
        return pos.get(index) - size.get(index)/2;
    }
    private double getMax(int index){
        return pos.get(index) + size.get(index)/2;
    }
    public boolean isOverlapping(Collider other){
        boolean[] axisOverlaps = new boolean[2];
        for (int i=0;i<2;i++) {
            Range thisRange = new Range(getMin(i), getMax(i));
            Range otherRange = new Range(other.getMin(i), other.getMax(i));
            boolean thisInOther = otherRange.isIn(getMin(i)) || otherRange.isIn(getMax(i));
            boolean otherInThis = thisRange.isIn(other.getMin(i)) || thisRange.isIn(other.getMax(i));
            axisOverlaps[i] = thisInOther || otherInThis;
        }
        return axisOverlaps[0] & axisOverlaps[1];
    }
}
