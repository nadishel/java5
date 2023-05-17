package home3;

public class Temperature {
    public static void main(String[] args) {
        int temperature1 = 128;
        int temperature2 = 118;
        checkingTemperature(temperature1, temperature2);
    }

    public static void checkingTemperature (int a, int b){
        boolean isWorking;
        if (a > 100 && b < 100) {
            isWorking = true;
        } else {
            isWorking = false;
        }
        System.out.println("Device is working - " + isWorking);
    }
}
