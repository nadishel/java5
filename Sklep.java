package home3;

public class Sklep {
    public static void main(String[] args) {

        System.out.println("Program is starting");
        boolean isEdekaOpen = false;
        boolean isReweOpen = false;

        System.out.println("You can go to the Sklep - " + canBuy(isEdekaOpen, isReweOpen));

        System.out.println("Program is finished");
    }
public static boolean canBuy (boolean a, boolean b){
        boolean isSklep = false;
        if (a || b){
            isSklep = true;
        }
        return isSklep;
}

}
