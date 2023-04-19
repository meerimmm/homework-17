package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow=new Cow("1","2","m","cow");
        Cow cow1=new Cow("2","3","m","cow");
        Cow cow2=new Cow("3","4","m","cow");
Cow[] cowArray=new Cow[]{cow,cow1,cow2};

        Sheep sheep=new Sheep("3","4","f","sheep");
        Sheep sheep1=new Sheep("4","5","f","sheep");
        Sheep sheep2=new Sheep("5","6","f","sheep");
Sheep[]sheepArray=new Sheep[]{sheep1,sheep2};

        Horse horse=new Horse("2","3","m","horse","brown");
        Horse horse1=new Horse("2","3","m","horse","white");
        Horse horse2=new Horse("2","3","m","horse","brown");
Horse [] horseArray=new Horse[]{horse,horse1,horse2};

Farm farm=new Farm("Moscow",cowArray,horseArray,sheepArray,"Meerim");
Farm farm2=new Farm(
        "KR",
        new Cow[]{cow},
        new Horse[]{horse},
        new Sheep[]{sheep},
        "Meerim");

}
}
