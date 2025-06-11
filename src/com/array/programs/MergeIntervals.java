package com.array.programs;
import java.util.*;

public class MergeIntervals {
    
    public static int[][] merge(int[][] intervals) {
    	
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }

        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] input1 = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int[][] result1 = merge(input1);
        System.out.print("Merged Intervals 1: ");
        printIntervals(result1);

        int[][] input2 = { {1, 4}, {4, 5} };
        int[][] result2 = merge(input2);
        System.out.print("Merged Intervals 2: ");
        printIntervals(result2);
    }
}
