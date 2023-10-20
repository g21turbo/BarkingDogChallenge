public class Main {

    public static void main(String[] args) {

        shouldWakeUp(true, 14);
        shouldWakeUp (false, 4);
        shouldWakeUp (true, 8);
        shouldWakeUp (true, -1);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else if (barking && hourOfDay > 8 || hourOfDay < 22) {
            return false;
        } else {
            return false;
        }
    }
}