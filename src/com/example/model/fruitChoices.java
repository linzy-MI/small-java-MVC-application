package com.example.model;
import java.util.*;

public class fruitChoices {
    public List<String> getFruitChoices(String color){
        List<String> choices=new ArrayList<String>();
        if(color.equals("green"))
        {
            choices.add("avocado");
            choices.add("kiwi");
        }
        else if(color.equals("yellow"))
        {
            choices.add("orange");
            choices.add("mongo");
            choices.add("banana");
        }
        else if(color.equals("purple"))
        {
            choices.add("grape");
            choices.add("plum");
            choices.add("eggplant");
        }
        else
        {
        	choices.add("Don't offer that color fruit,<br>but you can choose one below");
            choices.add("Apple");
            choices.add("Lemon");
        }
        return (choices);
    }
}
