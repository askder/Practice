package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
Warmup Tasks:
		1. write a program that can find the unique characters from a string
		                DO NOT use nested loop
		                "ABABCDEE"
		                output: C D
 */
public class Uniques {
    public static void main(String[] args) {

        String str="AABABCDEEF";

        String uniques="";

        ArrayList<String> list = new ArrayList<>();

        for (String each:str.split("")){
            list.add(each);

        }

        System.out.println(list);

        for (String each:list) {
            int count = Collections.frequency(list, each);

           //   System.out.print(count);

            if (count == 1) {
               uniques+=each;
            }

        }

        System.out.println(uniques);



    }
}
