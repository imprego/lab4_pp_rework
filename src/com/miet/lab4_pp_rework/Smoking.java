package com.miet.lab4_pp_rework;

public class Smoking {
    public Triple add(double x,double y, double z, double x1, double y1, double z1){
        Triple temp = new Triple();
        temp.x = x + x1;
        temp.y = y + y1;
        temp.z = z + z1;
        return temp;
    }
    public Triple sub(double x,double y, double z, double x1, double y1, double z1){
        Triple temp = new Triple();
        temp.x = x - x1;
        temp.y = y - y1;
        temp.z = z - z1;
        return temp;
    }
    public Triple scalarMul(double x,double y, double z, double x1, double y1, double z1){
        Triple temp = new Triple();
        temp.x = x * x1;
        temp.y = y * y1;
        temp.z = z * z1;
        return temp;
    }
    public Triple vectorMul(double x,double y, double z, double x1, double y1, double z1){
        Triple temp = new Triple();
        temp.x = y * z1 - z * y1 ;
        temp.y = z * x1 - x * z1;
        temp.z = x * y1 - y * x1;
        return temp;
    }
}