package com.example;

import java.util.Random;

public class Jokes {

    private String[] jokes = {
            "A SQL query goes into a bar, walks up to two tables and asks, 'Can I join you?'",
            "How many programmers does it take to change a light bulb ? None, that's a hardware problem",
            "Command line Russian roulette : [ $[ $RANDOM % 6 ] == 0 ] && rm -rf / || echo *Click*",
            "In theory, there ought to be no difference between theory and practice. In practice, there is.",
            "Why did the programmer quit his job? Because he didn't get arrays.",
            "I � Unicode."
    };

    public String getJoke(){
        return jokes[new Random().nextInt(jokes.length)];
    }
}
