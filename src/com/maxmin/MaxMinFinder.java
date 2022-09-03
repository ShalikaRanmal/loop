package com.maxmin;

public class MaxMinFinder {
    public MaxMinFinder(int array[]){
        this.array = array;
    }

    private int array[];
    private int max , min ;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public void maxMinFinder(){
        max = array[0];
        min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
        }
    }

}
