package e.e.a.o.h;

import com.didi.hummer.component.input.TextArea;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;

public class f extends h<TextArea> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public TextArea a(c cVar, Object[] objArr) {
        return new TextArea(this.f4585a, cVar, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "TextArea";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(TextArea textArea, String str, Object[] objArr) {
        char c2;
        TextArea textArea2 = textArea;
        boolean z = false;
        switch (str.hashCode()) {
            case -2012343115:
                if (str.equals("setFocused")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1813758031:
                if (str.equals("setPlaceholder")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -75125341:
                if (str.equals("getText")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1984984239:
                if (str.equals("setText")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            textArea2.setText((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
            return null;
        } else if (c2 == 1) {
            return textArea2.getText();
        } else {
            if (c2 == 2) {
                textArea2.setPlaceholder((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
                return null;
            } else if (c2 != 3) {
                return null;
            } else {
                if (objArr.length > 0 && objArr[0] != null) {
                    z = ((Boolean) objArr[0]).booleanValue();
                }
                textArea2.setFocused(z);
                return null;
            }
        }
    }
}
