package com.alibaba.dataworks.principle.singleresponsibility;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/7
 */
public class SingleReponse3 {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Vehicle1();
        vehicle1.run("car");
        vehicle1.runSky("bird");
        vehicle1.runWater("fish");
    }
}


class Vehicle1 {
    public void run(String vehicle) {
        System.out.println(String.format("%s is walking on the road", vehicle));
    }
    public void runSky(String vehicle) {
        System.out.println(String.format("%s is walking in the sky", vehicle));
    }
    public void runWater(String vehicle) {
        System.out.println(String.format("%s is swim in the water", vehicle));
    }
}