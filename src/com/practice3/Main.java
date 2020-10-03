package com.practice3;

public class Main {
    public static void main(String args[]){
        Circle krug = new Circle();
        System.out.println("Длина окружности " + krug.getLen() + "\n" + "Площадь " + krug.getS() + "\n" + "Радиус " + krug.getRadius());
        krug.setRadius(4);
        System.out.println('\n' + "Длина окружности " + krug.getLen() + "\n" + "Площадь " + krug.getS() + "\n" + "Радиус " + krug.getRadius());
        Human character = new HumanBuilder<>()
                .addHead(12, "abcd")
                .addBody(25)
                .addHand(15, "LeftHand", "Stone")
                .addHand(15, "RightHand", null)
                .addLegs(13, 25)
                .addName("Peter")
                .getPerson();

        System.out.println("\n\n\nName: " + character.getName() + '\n');
        System.out.println("Head:\n" + "hp= " + character.head.getHp() + '\n' + "information on 0 index =" + character.head.getInfo(0));
        System.out.println("\nBody:\n" + "hp= " + character.body.getHp());
        System.out.println("\nHands:\nRightHand have " + character.hands[1].getObject());
        System.out.println("LeftHand have " + character.hands[0].getObject());
        System.out.println("\nLegs:\nhp= " + character.legs.getHp() + '\n' + "speed= " + character.legs.getMaxSpeed());
        character.legs.damage(6);
        System.out.println("\nnLegs (after damage):\nhp= " + character.legs.getHp() + '\n' + "speed= " + character.legs.getMaxSpeed());

    }
}
