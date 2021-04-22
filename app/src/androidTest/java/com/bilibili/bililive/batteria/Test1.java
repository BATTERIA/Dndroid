package com.bilibili.bililive.batteria;

import java.util.Map;

public class Test1 {
    int[] parents;
    Map<Integer, Integer> a;

    // 寻找最深的祖先
    int find(int t) {
        while(t != parents[t]) {
            // 压缩优化
//            parents[t] = parents[parents[t]];
            t = parents[t];
        }
        return t;
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parents = new int[n];
        for (int i = 0; i < n; i++) parents[i] = i;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 0) continue;
                parents[find(i)] = find(j);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (parents[i] == i) ans++;
        }
        return ans;
    }
}
