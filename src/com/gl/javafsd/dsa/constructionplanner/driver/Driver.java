package com.gl.javafsd.dsa.constructionplanner.driver;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
import com.gl.javafsd.dsa.constructionplanner.service.Service;

class Driver {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter total number of floors for the building:");

        Scanner scn = new Scanner(System.in);
        int totalFloors = scn.nextInt();

        int floorArray[] = new int[totalFloors];

        for(int i=0; i<totalFloors; i++)
        {
            System.out.println("Enter floor size on day "+(i+1)+" : ");
            floorArray[i] = scn.nextInt();
        }


        Service service = new Service();
        service.printConstructionPlan(floorArray,totalFloors);
    }
}