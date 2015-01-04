package com.stanilin.javastart.objects;


public class Door {
    private String color;
    private float length;
    private float width;
    private float height;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void doorOpen(){
        System.out.println(getColor()+" Door "+getLength()+" x"+getWidth()+" x"+getHeight()+" opened");
    }

    public void doorClose(){
        System.out.println(getColor()+" Door "+getLength()+" x"+getWidth()+" x"+getHeight()+" closed");
    }
}
