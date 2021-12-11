package com.company;
import java.util.Scanner;
import java.lang.Math;

 public class speed {


     public void speedLimit() {

         System.out.println("Lets make sure you're going the right speed limit");

         double speed,distance,time;

         Scanner sc=new Scanner(System.in);

         System.out.println("enter speed in kmph ");

         speed=sc.nextDouble();

         System.out.println("enter time in hours ");

         time=sc.nextDouble();

         distance=speed*time;

         System.out.println("Distance in kilometers= "+distance+"km");

         System.out.println("Distance in meters= "+distance*1000+"m");

     }

 }



