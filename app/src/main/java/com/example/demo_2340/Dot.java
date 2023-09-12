package com.example.demo_2340;



public class Dot {
    private float x, y;
    private int radius;
    private boolean isVisible;
    private static final long MAX_LIFETIME = 10000; // Time out after 10 seconds
    private long visibleStartTime;

    public Dot(float x, float y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isVisible = true;

        visibleStartTime = 0;

    }

    public boolean isExpired() {
        return visibleStartTime > MAX_LIFETIME;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setInvisible() {
        isVisible = false;
    }
}
