public class Recitation7 {
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    public static boolean lastItemReachable(int[] hopList) {
        int index = 0;
        while (index < hopList.length - 1 && hopList[index] != 0) {
            index += hopList[index];

        }
        return index >= hopList.length - 1;
    }

    public static int[] slidingWindowMin(int[] numberList, int windowSize) {
        int[] x1 = new int[numberList.length - windowSize + 1];
        for (int x2 = 0; x2 < x1.length; x2++) {
            int x3 = numberList[x2];
            for (int x4 = x2; x4 < x2 + windowSize; x4++) {
                if (x3 > numberList[x4]) {
                    x3 = numberList[x4];
                }
            }
            x1[x2] = x3;
        }
        return x1; // replace this line with your code
    }
}

