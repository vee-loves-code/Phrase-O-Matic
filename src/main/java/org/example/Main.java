package org.example;

public class Main {
    public static void main(String[] args) {
       //Ceate array of word
        String[] wordlistOne = {
                "House", "The goat", "Random Guy", "Great!", "build", "intentional", "Grace", "cook", "sound",
                "emerge", "mould", "miscreant", "violence", "football", "coat", "star", "bound","cool"
        };
        String[] wordlistTwo = {
                "sample", "fierce","can", "grand", "is", "lives", "please",  "plays", "ties", "super", "takes",
                "deal", "Hi!", "cry", "says", "has", "brave", "ignorant", "nice", "kid", "am", "have"
        };
        String[] wordListThree = {
                "plough", "cringe", "dance", "rain", "weight", "clap", "0h!", "track", "attack", "mama", "is",
                "July", "sky", "Samuel","Peace", "climb", "pretty", "mummy","crazy","ground","toll"
        };
       //Get the length of the array
        int oneLength = wordlistOne.length;
        int twoLength = wordlistTwo.length;
        int threeLength = wordListThree.length;
       //typecast each array length so that the random() method can loop through the array and return one randomly selected word.
        int randomWord1 = (int) (Math.random() * oneLength);
        int randomWord2 = (int) (Math.random() * twoLength);
        int randomWord3 = (int) (Math.random() * threeLength);
        //combine all three random words to make a phrase
        String phrase = wordlistOne[randomWord1] + " " + wordlistTwo[randomWord2] + " " + wordListThree[randomWord3];
        //print out phrase
        System.out.println("what we need is " + phrase);


    }
}