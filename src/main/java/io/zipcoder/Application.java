package io.zipcoder;
import IOConsole.IOConsole;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        HashMap<String, String> petListMap = new HashMap<String, String>();
        HashMap<String, String> petNameSpeak = new HashMap<String, String>();
        ArrayList<String> petListName = new ArrayList<String>();
        ArrayList<String> petListType = new ArrayList<String>();

        String petStr, speach;
        String petName;
        IOConsole inout = new IOConsole();

        int petCount = inout.getIntegerInput("Hello, how many pets you have?");
        inout.getStringInput("");



        for (int i = 0; i < petCount; i++) {
            petStr = inout.getStringInput("Enter Kind of your Pet followed by pets Name:");
            String[] pet = petStr.toLowerCase().split(" ");
            petListMap.put(pet[0], pet[1]);

            petListType.add(pet[0]);
            petListName.add(pet[1]);

            Pets pets = new Pets(pet[0],pet[1]);
          //  pets.setPetType(pet[0]);
        }

        for (Map.Entry<String, String> pet : petListMap.entrySet()) {
            if (pet.getKey().equals("cat")) {
                Cat cat = new Cat(petListMap.get("cat"));
                petName = cat.getPetName();
                speach = cat.speak();
                petNameSpeak.put(petName, speach);
            } else if (petListMap.containsKey("dog")) {
                Dog dog = new Dog(petListMap.get("dog"));
                petName = dog.getPetName();
                speach = dog.speak();
                petNameSpeak.put(petName, speach);

            } else if (petListMap.containsKey("rabbit")) {
                Rabbit rabbit = new Rabbit(petListMap.get("rabbit"));
                petName = rabbit.getPetName();
                speach = rabbit.speak();
                petNameSpeak.put(petName, speach);
            } else {
                inout.getStringInput("Please enter a valid pet between: Dog, Cat, Rabbit!");
            }


            for (Map.Entry<String, String> petSpeak : petNameSpeak.entrySet()) {
                if (petSpeak.getKey().equals(pet.getValue())) {
                    inout.println("Pet:" + pet.getKey() + " named:" + pet.getValue() + " speaks:" + petSpeak.getValue());
                }
            }

        }
        

        Collections.sort(petListName);
        inout.println("The Pet names list: " + petListName.toString());


//        PetSorter petSorter = new PetSorter(petListType);
//        Comparator<Pets> comparator = (Comparator<Pets>) new PetComparator();
//
//        inout.println("The list of Pets:", petSorter(comparator));
//        Collections.sort(petListName);
//        inout.println("The Pet names: ",petListName.toString() );

//
//        Iterator itor = petNameSpeak.entrySet().iterator();
//        while (itor.hasNext())
//        {
//            Map.Entry pair = (Map.Entry) itor.next();
//            inout.println(pair.getKey() + " " + pair.getValue());
//
//            Collections.sort(petListName);
//            inout.println(petListName.toString());
//        }
//
//    }

//        PetSorter petSorter = new PetSorter(petListType);
//       // Collections.sort(petListType,petSorter);
//
//        for (Pets pet: petListType)
//        {
//            inout.println(pet.getPetType());
//        }
//    }

//        public String Display (HashMap petListMap)
//        {
//
//            return null;
//        }
    }

}
