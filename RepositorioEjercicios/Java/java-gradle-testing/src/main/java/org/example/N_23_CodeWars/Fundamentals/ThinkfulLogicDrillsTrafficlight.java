package org.example.N_23_CodeWars.Fundamentals;

public class ThinkfulLogicDrillsTrafficlight {
    public static void main(String[] args) {
        System.out.println(TrafficLights.updateLight("red"));
        System.out.println(TrafficLights.updateLight("green"));
        System.out.println(TrafficLights.updateLight("yellow"));
    }
    public class TrafficLights {

        public static String updateLight(String current) {
            if(current.equals("red"))
                return "green";
            else if (current.equals("green"))
                return "yellow";
            return "red";
        }

    }
}
