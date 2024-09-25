package my.utils;

public class Parser {
    public static int[] parseConsoleArgsToArrayInt(String[] args) {
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        return array;
    }

}
