package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> even = new ArrayList<Integer>();


        if (numbers.size() == 0) {
            System.out.println("List is empty");
        } else {
            for (Integer list : numbers) {
                if (list % 2 == 0) {
                    even.add(list);
                }

            }
            System.out.println(even);
        }
        return even;
    }
}




