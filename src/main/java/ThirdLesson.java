public class ThirdLesson {
    public static void main(String[] args) {
        String name = "Vasyl";
        int age = 17;
        boolean online = true;
        printValues(name);
        System.out.println(printValues2(name, age));
        System.out.println(printValues3(name, age, online));
    }
    private static void printValues(String noName) {
        System.out.println(noName);
    }
    private static String printValues2(String noName, int noAge ) {
        return (noName + noAge);
    }
    private static String printValues3 (String noName, int noAge, boolean online){
        if (online)
            return noName;
        else
            return Integer.toString(noAge);
    }
}
