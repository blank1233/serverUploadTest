package com.zhang.pojo;

public class PositionBean {

    public PositionBean(int px1, int py1) {
    }

    private int x;

    private int y;

    private int pxrgb;

    private int width;

    private int height;

    public int x() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int y() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPxrgb() {
        return pxrgb;
    }

    public void setPxrgb(int pxrgb) {
        this.pxrgb = pxrgb;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
