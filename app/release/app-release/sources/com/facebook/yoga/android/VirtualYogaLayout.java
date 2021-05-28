package com.facebook.yoga.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import e.a.a.a.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VirtualYogaLayout extends ViewGroup {
    public final List<View> mChildren;
    public final YogaNode mYogaNode;
    public final Map<View, YogaNode> mYogaNodes;

    public VirtualYogaLayout(Context context) {
        super(context);
        this.mChildren = new LinkedList();
        this.mYogaNodes = new HashMap();
        this.mYogaNode = YogaNode.create();
    }

    public VirtualYogaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VirtualYogaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildren = new LinkedList();
        this.mYogaNodes = new HashMap();
        this.mYogaNode = YogaNode.create();
        YogaLayout.applyLayoutParams(new YogaLayout.LayoutParams(context, attributeSet), this.mYogaNode, this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof VirtualYogaLayout) {
            VirtualYogaLayout virtualYogaLayout = (VirtualYogaLayout) view;
            virtualYogaLayout.transferChildren(this);
            YogaNode yogaNode = virtualYogaLayout.getYogaNode();
            YogaNode yogaNode2 = this.mYogaNode;
            yogaNode2.addChildAt(yogaNode, yogaNode2.getChildCount());
            return;
        }
        YogaNode create = YogaNode.create();
        YogaLayout.applyLayoutParams(new YogaLayout.LayoutParams(layoutParams), create, view);
        create.setData(view);
        create.setMeasureFunction(new YogaLayout.ViewMeasureFunction());
        YogaNode yogaNode3 = this.mYogaNode;
        yogaNode3.addChildAt(create, yogaNode3.getChildCount());
        addView(view, create);
    }

    public void addView(View view, YogaNode yogaNode) {
        this.mChildren.add(view);
        this.mYogaNodes.put(view, yogaNode);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof YogaLayout.LayoutParams;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new YogaLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new YogaLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new YogaLayout.LayoutParams(layoutParams);
    }

    public YogaNode getYogaNode() {
        return this.mYogaNode;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }

    public void transferChildren(ViewGroup viewGroup) {
        if (viewGroup instanceof VirtualYogaLayout) {
            for (View view : this.mChildren) {
                ((VirtualYogaLayout) viewGroup).addView(view, this.mYogaNodes.get(view));
            }
        } else if (viewGroup instanceof YogaLayout) {
            for (View view2 : this.mChildren) {
                ((YogaLayout) viewGroup).addView(view2, this.mYogaNodes.get(view2));
            }
        } else {
            StringBuilder a2 = a.a("VirtualYogaLayout cannot transfer children to ViewGroup of type ");
            a2.append(viewGroup.getClass().getCanonicalName());
            a2.append(".  Must either be a VirtualYogaLayout or a YogaLayout.");
            throw new RuntimeException(a2.toString());
        }
        this.mChildren.clear();
    }
}
