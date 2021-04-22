package com.bilibili.bililive.batteria;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

class TestClass {
    void run() {
        isPowerOfTwo(-12);
    }

    public boolean isPowerOfTwo(int n) {
        int cnt = 0;
        boolean isNegative = n < 0;
        if (isNegative) {
            cnt++;
            n = -n;
        }
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return isNegative ? cnt == 2 : cnt == 1;
    }
}

