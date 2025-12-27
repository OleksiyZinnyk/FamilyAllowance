public class main {
    public static void main(String[] args) {
        int num = 4;

    }

    public static boolean isAnagram(String a, String b) {
        if (a.contains(b)){
            return true;
        }
        else return false;
    }

    public boolean isEven(double n) {
        if (n%2==0){
            return true;
        }
        else return false;
    }

    public static int combat(int health, int damage) {
        int finheal = health - damage;
        if (finheal < 0){
            return 0;
        }else {
        return finheal;
        }
    }

    public String sayHello(String [] name, String city, String state){
        String hello = ("Hello, " + name[0] + " "+ name[1] + "! Welcome to " + city+ ", " + state );
        return hello;
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int avgpointsum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            avgpointsum += classPoints[i];
        }
        int avgpoint = avgpointsum / classPoints.length;
        if (avgpoint < yourPoints){
            return true;
        }else{
            return false;
        }
    }


}
