package com.gl.javafsd.dsa.constructionplanner.service;

import java.util.PriorityQueue;

public class Service {
    public void printConstructionPlan(int floorArray[],int totalFloors) {

        PriorityQueue<Integer> floorQueue = new PriorityQueue<>(java.util.Collections.reverseOrder());

        System.out.println("The order of construction per day is as follows: ");

        int tempArray[] = new int[totalFloors];
        int max = totalFloors;

        for (int i = 0; i < totalFloors; i++) {
            System.out.print("Day "+(i+1)+" : ");
            tempArray[i] = floorArray[i];
            floorQueue.add(tempArray[i]);

            while (!floorQueue.isEmpty() && floorQueue.peek() == max) {
                System.out.print(floorQueue.poll() + " ");
                max--;
            }

            System.out.println();
        }
    }

}

