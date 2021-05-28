package com.didi.hummer.module;

import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import e.e.a.p.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Memory {
    public static Map<String, Map<String, Object>> memoryStoreMap = new ConcurrentHashMap();

    @JsMethod
    public static boolean exist(b bVar, String str) {
        return exist(bVar.f4442c, str);
    }

    public static boolean exist(String str, String str2) {
        Map<String, Object> map = memoryStoreMap.get(str);
        if (map == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    @JsMethod
    public static Object get(b bVar, String str) {
        return get(bVar.f4442c, str);
    }

    public static Object get(String str, String str2) {
        Map<String, Object> map = memoryStoreMap.get(str);
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    public static Map<String, Object> getAll(b bVar) {
        return memoryStoreMap.get(bVar.f4442c);
    }

    @JsMethod
    public static void remove(b bVar, String str) {
        remove(bVar.f4442c, str);
    }

    public static void remove(String str, String str2) {
        Map<String, Object> map = memoryStoreMap.get(str);
        if (map != null) {
            map.remove(str2);
        }
    }

    @JsMethod
    public static void set(b bVar, String str, Object obj) {
        set(bVar.f4442c, str, obj);
    }

    public static void set(String str, String str2, Object obj) {
        Map<String, Object> map = memoryStoreMap.get(str);
        if (map == null) {
            map = new ConcurrentHashMap<>();
            memoryStoreMap.put(str, map);
        }
        map.put(str2, obj);
    }
}
