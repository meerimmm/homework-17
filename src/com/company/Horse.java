package com.company;

public class Horse extends Animal {
    public Horse(String weigt, String age, String gender, String nickName,String color) {
        super(weigt, age, gender, nickName);
        this.color=color;
    }
    private String color;
        public String getColor () {
            return color;
        }
        public void setColor (String color){
            this.color = color;
        }
    }
