public class SecondLesson {
    public static void main(String[] args) {
        String name = "Vasyl";
        int age = 17;
        double score = 14.7;
        char group = 'A';
        boolean online = true;

        doublePlusInt(score, age);
        charPlusString(group, name);
        intPlusString(age, name);
        stringPlusBoolean(name, online);
        intPlusBoolean(age,online);

    }
    public static void doublePlusInt (double first,int second) {
        double result = first + second;
        System.out.println(result);
    }
    public static void charPlusString (char first,String second) {
        String result = first + second;
        System.out.println(result);
    }
    public static void intPlusString (int first, String second) {
        String result = first + second;
        System.out.println(result);
    }
    public static void stringPlusBoolean (String first, boolean second) {
        String result = first + second;
        System.out.println(result);
    }
    public static void intPlusBoolean (int first, boolean second) {
        int result = first + second;
        System.out.println(result);


//    public static void showAge (int[] args) {
//        int age = 17;
//    }
//    public static void showScore (double[] args) {
//        double score = 14.7;
//    }
//    public static void main (char[] args) {
//        char group = 'A';
//    }
//    public static void main (boolean[] args) {
//        boolean online = true;
//    }
//
//        System.out.println(score + age);
//        System.out.println(group + name);
//        System.out.println(age + name);
//        System.out.println(name + online);
//        System.out.println(age + name);
//        System.out.println(name + online);
//        System.out.println(age + online);

}

