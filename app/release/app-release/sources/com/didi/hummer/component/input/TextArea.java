package com.didi.hummer.component.input;

import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import e.e.a.p.b;
import e.e.a.q.b.c;

@Component
public class TextArea extends Input {
    public TextArea(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
    }

    @Override // com.didi.hummer.component.input.Input
    public boolean isSingleLine() {
        return false;
    }

    @Override // e.e.a.y.a.b.j, com.didi.hummer.component.input.Input
    public void resetStyle() {
        super.resetStyle();
        setTextLineClamp(0);
    }

    @Override // e.e.a.y.a.b.j, com.didi.hummer.component.input.Input
    public boolean setStyle(String str, Object obj) {
        if (((str.hashCode() == -1547288966 && str.equals("textLineClamp")) ? (char) 0 : 65535) != 0) {
            return super.setStyle(str, obj);
        }
        setTextLineClamp(Float.valueOf(String.valueOf(obj)).intValue());
        return true;
    }

    @JsAttribute
    public void setTextLineClamp(int i) {
        this.mProperty.f4382d.f4383c = i;
    }
}
