package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joke {
    private ArrayList<String> jokes;
    private Random random;

    public Joke() {
        jokes = new ArrayList<String>();
        jokes.add("Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all");
        jokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away");
        jokes.add("What is the difference between a snowman and a snowwomen? Snowballs");
        jokes.add("Why are frogs such happy animals? Because they always eat whatever bugs them");
        jokes.add("I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?");

        random = new Random();
    }
    public String getJoke() {
        return jokes.get(random.nextInt(jokes.size()));
    }
}
