package chap14;

import java.util.function.IntBinaryOperator;

public class LamdaEx9 {
    private static int[] score = {92, 85, 87};

    public static void main(String[] args) {
        System.out.println("최대값 : " + maxOrMin((a, b)->(a >= b) ? a : b));
        System.out.println("최소값 : " + maxOrMin((a, b)->(a <= b) ? a : b));
    }

    private static int maxOrMin(IntBinaryOperator op) {
        int result = score[0];
        for (int s : score) {
            result = op.applyAsInt(result, s);
        }
        return result;
    }
}
