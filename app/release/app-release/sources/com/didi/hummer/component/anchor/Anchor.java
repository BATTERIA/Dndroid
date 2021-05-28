package com.didi.hummer.component.anchor;

import com.didi.hummer.annotation.Component;
import com.didi.hummer.component.view.View;
import com.facebook.yoga.YogaDisplay;
import e.e.a.p.b;
import e.e.a.q.b.c;

@Component
public class Anchor extends View {
    public Anchor(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
        getYogaNode().setDisplay(YogaDisplay.NONE);
    }
}
