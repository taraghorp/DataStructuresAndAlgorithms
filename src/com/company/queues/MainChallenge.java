package com.company.queues;
import java.util.LinkedList;
public class MainChallenge {
    public static void main(String[] args) {

        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        string = string.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c: string.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
            {
                sb.append(c);
            }
        }
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        boolean check = true;
        char[] charArray = sb.toString().toCharArray();
        for(char c: charArray)
        {
            stack.push((Character)c);
            queue.add((Character)c);
        }

        for(int i = 0; i < sb.toString().length();i++)
        {
            if(!stack.pop().equals(queue.remove()))
            {
                check = false;
                break;
            }

        }
        return check;
    }
}
