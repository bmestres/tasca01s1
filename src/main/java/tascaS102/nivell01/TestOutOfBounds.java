package tascaS102.nivell01;

import java.util.ArrayList;

public class TestOutOfBounds {
    // Tries accessing an out-of-bounds element
    public static void performTest(){
        int array[] = {0, 1, 2, 3, 4};

        try{
            int outOfBounceElem = array[5];
        } catch(IndexOutOfBoundsException ex){
            System.out.printf("Caught exception with message: %s\n", ex.getMessage());
        }
    }
}
