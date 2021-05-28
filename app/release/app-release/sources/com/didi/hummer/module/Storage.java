package com.didi.hummer.module;

import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import e.c.a.b.l;
import e.e.a.n.e.b.a;
import e.e.a.p.b;

@Component
public class Storage {
    @JsMethod
    public static boolean exist(b bVar, String str) {
        return exist(bVar.f4442c, str);
    }

    @JsMethod
    public static Object get(b bVar, String str) {
        return get(bVar.f4442c, str);
    }

    @JsMethod
    public static void remove(b bVar, String str) {
        remove(bVar.f4442c, str);
    }

    @JsMethod
    public static void set(b bVar, String str, String str2) {
        set(bVar.f4442c, str, str2);
    }

    public static boolean exist(String str, String str2) {
        return ((a) l.f.f(str)).f4359a.contains(str2);
    }

    public static Object get(String str, String str2) {
        return ((a) l.f.f(str)).f4359a.getString(str2, "");
    }

    public static void remove(String str, String str2) {
        ((a) l.f.f(str)).f4359a.edit().remove(str2).apply();
    }

    public static void set(String str, String str2, String str3) {
        a aVar = (a) l.f.f(str);
        if (aVar == null) {
            throw null;
        } else if (str3 instanceof String) {
            aVar.f4359a.edit().putString(str2, str3).apply();
        }
    }
}
