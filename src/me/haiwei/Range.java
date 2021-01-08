package me.haiwei;

public class Range {
    private double min;
    private double max;

    public Range(double _min, double _max){
        min = _min;
        max = _max;
    }

    public boolean isIn(double value){
        return value > min & value < max;
    }
    public boolean isIn(double value,boolean inclusive){
        if (inclusive) {
            return value >= min & value <= max;
        }
        else{
            return isIn(value);
        }
    }
    public double clamp(double value){
        if (value < min){
            return min;
        }
        else if (value > max){
            return max;
        }
        else{
            return value;
        }
    }
}
