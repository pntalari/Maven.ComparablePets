package io.zipcoder;
import IOConsole.IOConsole;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        HashMap<String, String> petListMap = new HashMap<String, String>();
        String petStr;
        IOConsole inout = new IOConsole();

        int petCount = inout.getIntegerInput("Hello, how many pets you have?");
        inout.getStringInput("");

        for (int i = 0; i < petCount; i++)
        {
            petStr = inout.getStringInput("Enter Kind of your Pet followed by pets Name:");
            String[] pet = petStr.toLowerCase().split(" ");
            petListMap.put(pet[0], pet[1]);
        }

        for (Map.Entry<String,String> pet: petListMap.entrySet())
        {
            if (pet.getKey().equals("cat"))
            {
                Cat cat = new Cat(petListMap.get("cat"));
            }
            else if (petListMap.containsKey("dog"))
            {
                Dog dog = new Dog(petListMap.get("dog"));
            }
            else if (petListMap.containsKey("rabbit"))
            {
                Rabbit rabbit = new Rabbit(petListMap.get("rabbit"));
            }
            else
                inout.getStringInput("Please enter a valid pet between: Dog, Cat, Rabbit!");
        }

        inout.println(petListMap);





    }
}
