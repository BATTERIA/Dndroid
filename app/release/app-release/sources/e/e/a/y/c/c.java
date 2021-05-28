package e.e.a.y.c;

import android.content.Context;
import com.didi.hummer.core.engine.jsc.jni.HummerException;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import e.c.a.b.l;
import e.e.a.k;
import e.e.a.y.a.b.j;
import e.e.a.y.d.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f4613a = Arrays.asList("justifyContent", "alignContent", "alignItems", "alignSelf", "aspectRatio", "border", "borderAll", "borderLeft", "borderRight", "borderTop", "borderBottom", "borderStart", "borderEnd", "borderHorizontal", "borderVertical", "direction", "display", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "width", "height", "maxWidth", "maxHeight", "minWidth", "minHeight", "margin", "marginAll", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "marginHorizontal", "marginVertical", "padding", "paddingAll", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "paddingHorizontal", "paddingVertical", "position", "positionType", "positionAll", "positionLeft", "positionRight", "positionTop", "positionBottom", "positionStart", "positionEnd", "positionHorizontal", "positionVertical", "left", "right", "top", "bottom", "start", "end");
    public static final List<String> b = new LinkedList(Arrays.asList("aspectRatio", "flex", "flexGrow", "flexShrink", "opacity", "textLineClamp", "letterSpacing", "lineSpacingMulti", "maxLength", "column"));

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f4614c = new LinkedList(Arrays.asList("width", "height", "backgroundColor", "opacity", "transform"));

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f4615d = {"x", "y", "z"};

    public static float a(String str, Object obj) {
        return a(obj, b(str));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(YogaNode yogaNode, String str, Object obj) {
        char c2;
        YogaEdge yogaEdge;
        YogaEdge yogaEdge2;
        YogaEdge yogaEdge3;
        YogaEdge yogaEdge4;
        YogaEdge yogaEdge5;
        YogaEdge yogaEdge6;
        YogaEdge yogaEdge7;
        YogaEdge yogaEdge8;
        switch (str.hashCode()) {
            case -2142380876:
                if (str.equals("positionBottom")) {
                    c2 = ';';
                    break;
                }
                c2 = 65535;
                break;
            case -1906103182:
                if (str.equals("marginHorizontal")) {
                    c2 = '%';
                    break;
                }
                c2 = 65535;
                break;
            case -1783760955:
                if (str.equals("flexBasis")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c2 = ')';
                    break;
                }
                c2 = 65535;
                break;
            case -1384764481:
                if (str.equals("positionVertical")) {
                    c2 = 'A';
                    break;
                }
                c2 = 65535;
                break;
            case -1383304148:
                if (str.equals("border")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c2 = ':';
                    break;
                }
                c2 = 65535;
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case -1063257157:
                if (str.equals("alignItems")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1044810477:
                if (str.equals("marginAll")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case -1044806579:
                if (str.equals("marginEnd")) {
                    c2 = '$';
                    break;
                }
                c2 = 65535;
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case -975171706:
                if (str.equals("flexDirection")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case -962590849:
                if (str.equals("direction")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -906066005:
                if (str.equals("maxHeight")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c2 = '\'';
                    break;
                }
                c2 = 65535;
                break;
            case -752601676:
                if (str.equals("alignContent")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -359890155:
                if (str.equals("paddingHorizontal")) {
                    c2 = '/';
                    break;
                }
                c2 = 65535;
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c2 = '\"';
                    break;
                }
                c2 = 65535;
                break;
            case -137466952:
                if (str.equals("positionAll")) {
                    c2 = '3';
                    break;
                }
                c2 = 65535;
                break;
            case -137463054:
                if (str.equals("positionEnd")) {
                    c2 = '?';
                    break;
                }
                c2 = 65535;
                break;
            case -137448596:
                if (str.equals("positionTop")) {
                    c2 = '9';
                    break;
                }
                c2 = 65535;
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = '>';
                    break;
                }
                c2 = 65535;
                break;
            case 115029:
                if (str.equals("top")) {
                    c2 = '8';
                    break;
                }
                c2 = 65535;
                break;
            case 3145721:
                if (str.equals("flex")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (str.equals("left")) {
                    c2 = '4';
                    break;
                }
                c2 = 65535;
                break;
            case 33812688:
                if (str.equals("positionLeft")) {
                    c2 = '5';
                    break;
                }
                c2 = 65535;
                break;
            case 34070531:
                if (str.equals("positionType")) {
                    c2 = '2';
                    break;
                }
                c2 = 65535;
                break;
            case 90111952:
                if (str.equals("paddingAll")) {
                    c2 = '(';
                    break;
                }
                c2 = 65535;
                break;
            case 90115850:
                if (str.equals("paddingEnd")) {
                    c2 = '.';
                    break;
                }
                c2 = 65535;
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c2 = '+';
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (str.equals("right")) {
                    c2 = '6';
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = '<';
                    break;
                }
                c2 = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 197397973:
                if (str.equals("borderAll")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 197401871:
                if (str.equals("borderEnd")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 197416329:
                if (str.equals("borderTop")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c2 = ',';
                    break;
                }
                c2 = 65535;
                break;
            case 400381634:
                if (str.equals("maxWidth")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c2 = '*';
                    break;
                }
                c2 = 65535;
                break;
            case 715094737:
                if (str.equals("paddingStart")) {
                    c2 = '-';
                    break;
                }
                c2 = 65535;
                break;
            case 736500048:
                if (str.equals("borderRight")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 737745814:
                if (str.equals("borderStart")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 747804969:
                if (str.equals("position")) {
                    c2 = '1';
                    break;
                }
                c2 = 65535;
                break;
            case 811701616:
                if (str.equals("borderHorizontal")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 904538487:
                if (str.equals("borderBottom")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c2 = ' ';
                    break;
                }
                c2 = 65535;
                break;
            case 976333652:
                if (str.equals("marginStart")) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case 1031115618:
                if (str.equals("flexShrink")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1053854323:
                if (str.equals("positionRight")) {
                    c2 = '7';
                    break;
                }
                c2 = 65535;
                break;
            case 1055100089:
                if (str.equals("positionStart")) {
                    c2 = '=';
                    break;
                }
                c2 = 65535;
                break;
            case 1092174483:
                if (str.equals("aspectRatio")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1343645351:
                if (str.equals("paddingVertical")) {
                    c2 = '0';
                    break;
                }
                c2 = 65535;
                break;
            case 1431421764:
                if (str.equals("marginVertical")) {
                    c2 = '&';
                    break;
                }
                c2 = 65535;
                break;
            case 1671764162:
                if (str.equals("display")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 1743739820:
                if (str.equals("flexGrow")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 1744216035:
                if (str.equals("flexWrap")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1767100401:
                if (str.equals("alignSelf")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1824690771:
                if (str.equals("borderLeft")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1832014786:
                if (str.equals("borderVertical")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 1860657097:
                if (str.equals("justifyContent")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1863279149:
                if (str.equals("positionHorizontal")) {
                    c2 = '@';
                    break;
                }
                c2 = 65535;
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                yogaNode.setJustifyContent(YogaJustify.valueOf(f(obj)));
                return;
            case 1:
                yogaNode.setAlignContent(YogaAlign.valueOf(f(obj)));
                return;
            case 2:
                yogaNode.setAlignItems(YogaAlign.valueOf(f(obj)));
                return;
            case 3:
                yogaNode.setAlignSelf(YogaAlign.valueOf(f(obj)));
                return;
            case 4:
                yogaNode.setAspectRatio(a(str, obj));
                return;
            case 5:
            case 6:
                yogaEdge = YogaEdge.ALL;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case 7:
                yogaEdge = YogaEdge.LEFT;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case '\b':
                yogaEdge = YogaEdge.RIGHT;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case '\t':
                yogaEdge = YogaEdge.TOP;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case '\n':
                yogaEdge = YogaEdge.BOTTOM;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case 11:
                yogaEdge = YogaEdge.START;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case '\f':
                yogaEdge = YogaEdge.END;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case '\r':
                yogaEdge = YogaEdge.HORIZONTAL;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case 14:
                yogaEdge = YogaEdge.VERTICAL;
                yogaNode.setBorder(yogaEdge, a(str, obj));
                return;
            case 15:
                yogaNode.setDirection(YogaDirection.valueOf(f(obj)));
                return;
            case 16:
                yogaNode.setDisplay(YogaDisplay.valueOf(f(obj)));
                return;
            case 17:
                yogaNode.setFlex(a(str, obj));
                return;
            case 18:
                if (c(obj)) {
                    yogaNode.setFlexBasisAuto();
                    return;
                } else if (d(obj)) {
                    yogaNode.setFlexBasisPercent(e(obj));
                    return;
                } else {
                    yogaNode.setFlexBasis(a(str, obj));
                    return;
                }
            case 19:
                yogaNode.setFlexDirection(YogaFlexDirection.valueOf(f(obj)));
                return;
            case 20:
                yogaNode.setFlexGrow(a(str, obj));
                return;
            case 21:
                yogaNode.setFlexShrink(a(str, obj));
                return;
            case 22:
                yogaNode.setWrap(YogaWrap.valueOf(f(obj)));
                return;
            case 23:
                if (c(obj)) {
                    yogaNode.setWidthAuto();
                    return;
                } else if (d(obj)) {
                    yogaNode.setWidthPercent(e(obj));
                    return;
                } else {
                    yogaNode.setWidth(a(str, obj));
                    return;
                }
            case 24:
                if (c(obj)) {
                    yogaNode.setHeightAuto();
                    return;
                } else if (d(obj)) {
                    yogaNode.setHeightPercent(e(obj));
                    return;
                } else {
                    yogaNode.setHeight(a(str, obj));
                    return;
                }
            case 25:
                if (c(obj)) {
                    yogaNode.setMaxWidth(2.14748365E9f);
                    return;
                } else if (d(obj)) {
                    yogaNode.setMaxWidthPercent(e(obj));
                    return;
                } else {
                    yogaNode.setMaxWidth(a(str, obj));
                    return;
                }
            case 26:
                if (c(obj)) {
                    yogaNode.setMaxHeight(2.14748365E9f);
                    return;
                } else if (d(obj)) {
                    yogaNode.setMaxHeightPercent(e(obj));
                    return;
                } else {
                    yogaNode.setMaxHeight(a(str, obj));
                    return;
                }
            case 27:
                if (c(obj)) {
                    yogaNode.setMinWidth(0.0f);
                    return;
                } else if (d(obj)) {
                    yogaNode.setMinWidthPercent(e(obj));
                    return;
                } else {
                    yogaNode.setMinWidth(a(str, obj));
                    return;
                }
            case 28:
                if (c(obj)) {
                    yogaNode.setMinHeight(0.0f);
                    return;
                } else if (d(obj)) {
                    yogaNode.setMinHeightPercent(e(obj));
                    return;
                } else {
                    yogaNode.setMinHeight(a(str, obj));
                    return;
                }
            case 29:
            case 30:
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.ALL;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.ALL;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.ALL;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case 31:
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.LEFT;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.LEFT;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.LEFT;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case ' ':
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.RIGHT;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.RIGHT;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.RIGHT;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case '!':
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.TOP;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.TOP;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.TOP;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case '\"':
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.BOTTOM;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.BOTTOM;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.BOTTOM;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case '#':
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.START;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.START;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.START;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case '$':
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.END;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.END;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.END;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case '%':
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.HORIZONTAL;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.HORIZONTAL;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.HORIZONTAL;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case '&':
                if (c(obj)) {
                    yogaEdge4 = YogaEdge.VERTICAL;
                    yogaNode.setMarginAuto(yogaEdge4);
                    return;
                } else if (d(obj)) {
                    yogaEdge3 = YogaEdge.VERTICAL;
                    yogaNode.setMarginPercent(yogaEdge3, e(obj));
                    return;
                } else {
                    yogaEdge2 = YogaEdge.VERTICAL;
                    yogaNode.setMargin(yogaEdge2, a(str, obj));
                    return;
                }
            case '\'':
            case '(':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.ALL;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.ALL;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case ')':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.LEFT;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.LEFT;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case '*':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.RIGHT;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.RIGHT;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case '+':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.TOP;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.TOP;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case ',':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.BOTTOM;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.BOTTOM;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case '-':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.START;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.START;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case '.':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.END;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.END;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case '/':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.HORIZONTAL;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.HORIZONTAL;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case '0':
                if (d(obj)) {
                    yogaEdge6 = YogaEdge.VERTICAL;
                    yogaNode.setPaddingPercent(yogaEdge6, e(obj));
                    return;
                }
                yogaEdge5 = YogaEdge.VERTICAL;
                yogaNode.setPadding(yogaEdge5, a(str, obj));
                return;
            case '1':
            case '2':
                yogaNode.setPositionType(YogaPositionType.valueOf(f(obj)));
                return;
            case '3':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.ALL;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.ALL;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case '4':
            case '5':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.LEFT;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.LEFT;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case '6':
            case '7':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.RIGHT;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.RIGHT;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case '8':
            case '9':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.TOP;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.TOP;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case ':':
            case ';':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.BOTTOM;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.BOTTOM;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case '<':
            case '=':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.START;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.START;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case '>':
            case '?':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.END;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.END;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case '@':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.HORIZONTAL;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.HORIZONTAL;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            case 'A':
                if (d(obj)) {
                    yogaEdge8 = YogaEdge.VERTICAL;
                    yogaNode.setPositionPercent(yogaEdge8, e(obj));
                    return;
                }
                yogaEdge7 = YogaEdge.VERTICAL;
                yogaNode.setPosition(yogaEdge7, a(str, obj));
                return;
            default:
                return;
        }
    }

    public static void a(j jVar) {
        if (jVar != null) {
            YogaNode yogaNode = jVar.getYogaNode();
            yogaNode.setJustifyContent(YogaJustify.FLEX_START);
            yogaNode.setAlignContent(YogaAlign.FLEX_START);
            yogaNode.setAlignContent(YogaAlign.FLEX_START);
            yogaNode.setAlignItems(YogaAlign.STRETCH);
            yogaNode.setAlignSelf(YogaAlign.AUTO);
            yogaNode.setBorder(YogaEdge.ALL, 0.0f);
            yogaNode.setDisplay(YogaDisplay.FLEX);
            yogaNode.setFlexBasisAuto();
            yogaNode.setFlexDirection(YogaFlexDirection.COLUMN);
            yogaNode.setFlexGrow(0.0f);
            yogaNode.setFlexShrink(1.0f);
            yogaNode.setWrap(YogaWrap.NO_WRAP);
            yogaNode.setWidthAuto();
            yogaNode.setHeightAuto();
            yogaNode.setMaxWidth(2.14748365E9f);
            yogaNode.setMaxHeight(2.14748365E9f);
            yogaNode.setMinWidth(0.0f);
            yogaNode.setMinHeight(0.0f);
            yogaNode.setMargin(YogaEdge.ALL, 0.0f);
            yogaNode.setPadding(YogaEdge.ALL, 0.0f);
            yogaNode.setPosition(YogaEdge.ALL, 0.0f);
            yogaNode.setPositionType(YogaPositionType.RELATIVE);
        }
    }

    public static void a(j jVar, String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("#")) {
                obj = Integer.valueOf(l.f.h(str2));
            } else if (str2.startsWith("linear-gradient")) {
                obj = l.f.i(str2);
            } else {
                try {
                    obj = Float.valueOf(a(obj, b(str)));
                } catch (Exception unused) {
                }
            }
        } else if (obj instanceof Number) {
            obj = Float.valueOf(a(obj, b(str)));
        }
        jVar.setHummerStyle(str, obj);
    }

    public static void a(String str) {
        if (!b.contains(str)) {
            b.add(str);
        }
    }

    public static float b(Object obj) {
        return a(obj, true);
    }

    public static boolean b(String str) {
        return !b.contains(str);
    }

    public static boolean c(Object obj) {
        return (obj instanceof String) && ((String) obj).toLowerCase().equals("auto");
    }

    public static boolean d(Object obj) {
        return (obj instanceof String) && ((String) obj).endsWith("%");
    }

    public static float e(Object obj) {
        if (!d(obj)) {
            return 0.0f;
        }
        String valueOf = String.valueOf(obj);
        return Float.parseFloat(valueOf.substring(0, valueOf.length() - 1));
    }

    public static String f(Object obj) {
        String upperCase = String.valueOf(obj).toUpperCase();
        return upperCase.equals("NOWRAP") ? "NO_WRAP" : upperCase.replace("-", "_");
    }

    public static Object g(Object obj) {
        if (obj == null) {
            return obj;
        }
        String obj2 = obj.toString();
        if (!obj2.contains(",")) {
            return obj;
        }
        String[] split = obj2.split(",");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < split.length; i++) {
            hashMap.put(f4615d[i], split[i]);
        }
        return hashMap;
    }

    public static void a(boolean z, j jVar, Map map) {
        if (!(jVar == null || map == null)) {
            HashMap hashMap = new HashMap();
            for (Object obj : map.keySet()) {
                String valueOf = String.valueOf(obj);
                Object obj2 = map.get(obj);
                if (!z || !a.a(jVar, valueOf, obj2)) {
                    if ("position".equals(valueOf) || "positionType".equals(valueOf) || "display".equals(valueOf)) {
                        if (jVar.setHummerStyle(valueOf, obj2)) {
                        }
                    } else if (valueOf.startsWith("transition")) {
                        hashMap.put(valueOf, obj2);
                    }
                    try {
                        if (!"transform".equals(valueOf)) {
                            if (f4614c.contains(valueOf)) {
                                if (!jVar.supportTransitionStyle("all")) {
                                    if (jVar.supportTransitionStyle(valueOf)) {
                                    }
                                }
                            }
                            if (f4613a.contains(valueOf)) {
                                a(jVar.getYogaNode(), valueOf, obj2);
                            } else {
                                a(jVar, valueOf, obj2);
                            }
                        }
                        jVar.handleTransitionStyle(valueOf, obj2);
                    } catch (Exception e2) {
                        l.f.a(e2, new StackTraceElement("<<Style>>", "", String.format("%s: %s", valueOf, obj2), -1));
                        HummerException.nativeException(jVar.getJSValue().a(), e2);
                    }
                }
            }
            jVar.getView().requestLayout();
            for (Object obj3 : hashMap.keySet()) {
                jVar.setTransitionStyle(String.valueOf(obj3), map.get(obj3));
            }
            jVar.runAnimator();
        }
    }

    public static Object a(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.charAt(0) == '#' && (str.length() == 7 || str.length() == 9)) {
                return Integer.valueOf(l.f.h(str));
            }
            if (str.startsWith("linear-gradient")) {
                return l.f.i(str);
            }
        }
        return 0;
    }

    public static float a(Object obj, boolean z) {
        float parseFloat;
        Context context;
        if (obj instanceof Number) {
            if (!z) {
                return ((Number) obj).floatValue();
            }
            context = k.f4312a;
            parseFloat = ((Number) obj).floatValue();
        } else if (!(obj instanceof String)) {
            return 0.0f;
        } else {
            String str = (String) obj;
            boolean z2 = true;
            boolean z3 = false;
            if (str.endsWith("px") || str.endsWith("PX")) {
                str = str.substring(0, str.length() - 2);
                z2 = false;
                z3 = true;
            } else if (str.endsWith("hm") || str.endsWith("HM")) {
                str = str.substring(0, str.length() - 2);
            } else {
                z2 = false;
            }
            parseFloat = Float.parseFloat(str);
            if (z2) {
                return parseFloat * (((float) a.b) / a.f4616a);
            }
            if (z3 || !z) {
                return parseFloat;
            }
            context = k.f4312a;
        }
        return (float) l.f.a(context, parseFloat);
    }
}
