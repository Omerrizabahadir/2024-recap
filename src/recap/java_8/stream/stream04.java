package recap.java_8.stream;

import java.util.Arrays;

public class stream04 {
    public static void main(String[] args) {

        String name = "kadir";
        name.split("");
        String[] string = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(string)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::println);
    }
    }

