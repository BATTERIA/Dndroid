package com.bilibili.bililive.batteria;


import androidx.collection.ArrayMap;

class TestClass {
    void run() {
        ArrayMap<String, String> map = new ArrayMap<>();
        map.put(null, "1");
        map.forEach((a, b) -> {
            if (String.class == a.getClass()) {
                map.put("1", "1");
            }
        });
//        map.put(1, 1);
        map.put("1", "1");
    }
}

