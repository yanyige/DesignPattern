package com.alibaba.dataworks.principle.singleresponsibility;

/**
 * @author yige.yyg (奕格)
 * @date 2020/12/7
 */
public class SingleReponse2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("moto");
        SkyVehicle skyVehicle = new SkyVehicle();
        skyVehicle.run("飞机");
    }
}

/**
 * 方案2
 * 1。 虽然遵守了单一职责原则，但是很复杂，加一个类要修改原有代码
 * 2。 优化见 SingleReponse3
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(String.format("%s is walking on the road", vehicle));
    }
}

class SkyVehicle {
    public void run(String vehicle) {
        System.out.println(String.format("%s is flying on the sky", vehicle));
    }
}

