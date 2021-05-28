package e.e.a.y.c;

import e.e.a.y.a.b.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Map<j, Map<String, Object>> f4596a = new WeakHashMap();
    public static final List<String> b = Arrays.asList("flexDirection", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap");

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f4597c = Arrays.asList("flexDirection", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap");

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f4598d = Arrays.asList("border", "borderAll", "borderLeft", "borderRight", "borderTop", "borderBottom", "borderStart", "borderEnd", "borderHorizontal", "borderVertical", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "width", "height", "maxWidth", "maxHeight", "minWidth", "minHeight", "margin", "marginAll", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "marginHorizontal", "marginVertical", "padding", "paddingAll", "paddingBottom", "paddingEnd", "paddingLeft", "paddingRight", "paddingStart", "paddingTop", "paddingHorizontal", "paddingVertical");

    /* renamed from: e.e.a.y.c.a$a  reason: collision with other inner class name */
    public enum EnumC0138a {
        YOGA("flex"),
        BLOCK("block"),
        INLINE("inline"),
        INLINE_BLOCK("inline-block");
        

        /* renamed from: c  reason: collision with root package name */
        public String f4604c;

        /* access modifiers changed from: public */
        EnumC0138a(String str) {
            this.f4604c = str;
        }
    }

    public enum b {
        YOGA("flex"),
        FIXED("fixed");
        

        /* renamed from: c  reason: collision with root package name */
        public String f4608c;

        /* access modifiers changed from: public */
        b(String str) {
            this.f4608c = str;
        }
    }

    public static Map<String, Object> a(j jVar) {
        return f4596a.get(jVar);
    }

    public static void a(String str, j jVar) {
        HashMap hashMap;
        if (b(jVar)) {
            Map<String, Object> a2 = a(jVar);
            if (EnumC0138a.BLOCK.f4604c.equals(str)) {
                if (jVar.getDisplay() == EnumC0138a.BLOCK) {
                    hashMap = new HashMap();
                    if (!a2.containsKey("width") && !a2.containsKey("maxWidth") && !a2.containsKey("minWidth")) {
                        hashMap.put("width", "100%");
                    }
                }
                c.a(false, jVar, (Map) a2);
            } else if (EnumC0138a.YOGA.f4604c.equals(str)) {
                if (jVar.getDisplay() == EnumC0138a.BLOCK) {
                    hashMap = new HashMap();
                    hashMap.put("width", "auto");
                }
                c.a(false, jVar, (Map) a2);
            } else {
                return;
            }
            c.a(false, jVar, (Map) hashMap);
            c.a(false, jVar, (Map) a2);
        }
    }

    public static boolean a(j jVar, String str, Object obj) {
        List<String> list;
        if (!"display".equals(str) && b(jVar)) {
            a(jVar).put(str, obj);
        }
        if (jVar.getDisplay() == EnumC0138a.INLINE) {
            list = f4598d;
        } else if (jVar.getDisplay() == EnumC0138a.BLOCK) {
            list = b;
        } else if (jVar.getDisplay() != EnumC0138a.INLINE_BLOCK) {
            return false;
        } else {
            list = f4597c;
        }
        return list.contains(str);
    }

    public static boolean b(j jVar) {
        return f4596a.containsKey(jVar);
    }

    public static void c(j jVar) {
        if (!f4596a.containsKey(jVar)) {
            f4596a.put(jVar, new HashMap());
        }
    }
}
