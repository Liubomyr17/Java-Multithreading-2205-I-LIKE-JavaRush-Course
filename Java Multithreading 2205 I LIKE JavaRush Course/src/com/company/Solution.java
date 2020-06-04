package com.company;

/*

2205 I LIKE JavaRush Course

Correct the getFormattedString method so that it returns a string with parameters for formatting.
Parameters must be swapped.
There should be a conclusion:
I like the JavaRush course

Requirements:
1. The getFormattedString method must be public.
2. The getFormattedString method must be static.
3. The output to the screen should correspond to the condition of the task.
4. The getFormattedString method should return a string with the parameters for formatting
according to the condition of the task.

*/


public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }
    public static String getFormattedString() {
        return "%3$S %4$s %2$s %1$s";
    }
}


