package com.company;

import java.util.ArrayList;

public class Main {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("green");
        for(int i = 0; i< colors.size(); i++)
        {
            System.out.println(colors.get(i));
        }
    }
}
