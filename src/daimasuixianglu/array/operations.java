package daimasuixianglu.array;

import java.util.ArrayList;
import java.util.List;

public class operations {
    public static void main(String[] args) {
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        List<String> planetsarr = new ArrayList<>(List.of(planets));
        // 当然也可以使用以下的方法
        List<String> planetarr1 = new ArrayList<>();
        planetarr1.addAll(List.of(planets));
        System.out.println(planetsarr);
        System.out.println(planetarr1);
    }
}
