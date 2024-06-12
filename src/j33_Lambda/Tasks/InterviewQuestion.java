package j33_Lambda.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQuestion {
    public static void main(String[] args) {
        /*
         * 15 Minutes Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
         * the maximum value, decreasing constantly after the maximum value
         *
         * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
         * the maximum value, decreasing and increasing after the maximum value
         *
         * Create a method to check if it is Mountain Array or not. Use as possible as
         * Functional Programming
         *
         */

        int[] arr = {0, 2, 5, 3, 1};
        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).forEach(list::add);
        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
        int indxOfMax = list.indexOf(max);
        List<Integer> part1 = list.stream().filter(t -> list.indexOf(t) <= indxOfMax).collect(Collectors.toList());
        List<Integer> sortedpart1 = part1.stream().sorted().collect(Collectors.toList());
        List<Integer> part2 = list.stream().filter(t -> list.indexOf(t) >= indxOfMax).collect(Collectors.toList());
        List<Integer> reverseSortedpart2 = part2.stream().sorted().collect(Collectors.toList());
        Collections.reverse(reverseSortedpart2);
        System.out.println((part1.equals(sortedpart1) && part2.equals(reverseSortedpart2)) ?
                list + " is Mountain Array" : list + " is not Mountain Array"
        );
    }
}
