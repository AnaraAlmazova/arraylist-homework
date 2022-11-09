package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
            System.out.println(array[i]);

            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();

                for (int j = 0; j < list.size(); j++) {
                    Integer r = list.get(j);
                    if (r % 2 == 0)
                        list1.add(r);
                    else
                        list2.add(r);
                    System.out.println(list1);
                    System.out.println(list2);
                }
            }
            }
        }











