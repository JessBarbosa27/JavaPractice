import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {

        Integer expectedNumber = 7;

        Integer[] givenArray = new Integer[]{2, 3, 7, 4, 8};

        Integer[] response = processTwoSum(givenArray, expectedNumber);

        System.out.println(response[1] + " & " + response[0]);
    }

    private static Integer[] processTwoSum(Integer[] array, Integer result) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            Integer difference = result - array[i];
            if (map.containsKey(difference)) {
                return new Integer[]{i, map.get(difference)};
            }
            map.put(array[i], i);
        }
        return new Integer[]{-1, -1};
    }
}
