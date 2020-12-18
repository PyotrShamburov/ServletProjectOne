package by.home;

public class StringReverser {

    public String reverseWord(String word){
        return new StringBuilder(word).reverse().toString();
    }
}
