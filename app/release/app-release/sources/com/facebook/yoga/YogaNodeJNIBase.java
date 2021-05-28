package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.List;

@DoNotStrip
public abstract class YogaNodeJNIBase extends YogaNode implements Cloneable {
    public static final byte BORDER = 4;
    public static final byte DOES_LEGACY_STRETCH_BEHAVIOUR = 8;
    public static final byte HAS_NEW_LAYOUT = 16;
    public static final byte LAYOUT_BORDER_START_INDEX = 14;
    public static final byte LAYOUT_DIRECTION_INDEX = 5;
    public static final byte LAYOUT_EDGE_SET_FLAG_INDEX = 0;
    public static final byte LAYOUT_HEIGHT_INDEX = 2;
    public static final byte LAYOUT_LEFT_INDEX = 3;
    public static final byte LAYOUT_MARGIN_START_INDEX = 6;
    public static final byte LAYOUT_PADDING_START_INDEX = 10;
    public static final byte LAYOUT_TOP_INDEX = 4;
    public static final byte LAYOUT_WIDTH_INDEX = 1;
    public static final byte MARGIN = 1;
    public static final byte PADDING = 2;
    @DoNotStrip
    public float[] arr;
    public YogaBaselineFunction mBaselineFunction;
    public List<YogaNodeJNIBase> mChildren;
    public Object mData;
    public boolean mHasNewLayout;
    @DoNotStrip
    public int mLayoutDirection;
    public YogaMeasureFunction mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;

    /* renamed from: com.facebook.yoga.YogaNodeJNIBase$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaEdge;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002b */
        static {
            /*
                com.facebook.yoga.YogaEdge[] r0 = com.facebook.yoga.YogaEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge = r0
                r1 = 1
                com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.LEFT     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x0016 }
                com.facebook.yoga.YogaEdge r3 = com.facebook.yoga.YogaEdge.TOP     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r1 = 3
                int[] r2 = com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaEdge r3 = com.facebook.yoga.YogaEdge.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r0 = 4
                int[] r2 = com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x0024 }
                com.facebook.yoga.YogaEdge r3 = com.facebook.yoga.YogaEdge.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                r1 = 5
                int[] r2 = com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x002b }
                com.facebook.yoga.YogaEdge r3 = com.facebook.yoga.YogaEdge.START     // Catch:{ NoSuchFieldError -> 0x002b }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r0 = com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.END     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.<clinit>():void");
        }
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNew());
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public YogaNodeJNIBase(YogaConfig yogaConfig) {
        this(YogaNative.jni_YGNodeNewWithConfig(yogaConfig.mNativePointer));
    }

    private void clearChildren() {
        this.mChildren = null;
        YogaNative.jni_YGNodeClearChildren(this.mNativePointer);
    }

    @DoNotStrip
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    public static YogaValue valueFromLong(long j) {
        return new YogaValue(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @Override // com.facebook.yoga.YogaNode
    public void addChildAt(YogaNode yogaNode, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) yogaNode;
        if (yogaNodeJNIBase.mOwner == null) {
            if (this.mChildren == null) {
                this.mChildren = new ArrayList(4);
            }
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            YogaNative.jni_YGNodeInsertChild(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    @DoNotStrip
    public final float baseline(float f2, float f3) {
        return this.mBaselineFunction.baseline(this, f2, f3);
    }

    @Override // com.facebook.yoga.YogaNode
    public void calculateLayout(float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i)).mChildren;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayout(this.mNativePointer, f2, f3, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase cloneWithoutChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeClone = YogaNative.jni_YGNodeClone(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeClone;
            yogaNodeJNIBase.clearChildren();
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public void copyStyle(YogaNode yogaNode) {
        YogaNative.jni_YGNodeCopyStyle(this.mNativePointer, ((YogaNodeJNIBase) yogaNode).mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void dirty() {
        YogaNative.jni_YGNodeMarkDirty(this.mNativePointer);
    }

    public void dirtyAllDescendants() {
        YogaNative.jni_YGNodeMarkDirtyAndPropogateToDescendants(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaAlign getAlignContent() {
        return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignContent(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaAlign getAlignItems() {
        return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignItems(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaAlign getAlignSelf() {
        return YogaAlign.fromInt(YogaNative.jni_YGNodeStyleGetAlignSelf(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getAspectRatio() {
        return YogaNative.jni_YGNodeStyleGetAspectRatio(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getBorder(YogaEdge yogaEdge) {
        return YogaNative.jni_YGNodeStyleGetBorder(this.mNativePointer, yogaEdge.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase getChildAt(int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    public int getChildCount() {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.facebook.yoga.YogaNode
    public Object getData() {
        return this.mData;
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDisplay getDisplay() {
        return YogaDisplay.fromInt(YogaNative.jni_YGNodeStyleGetDisplay(this.mNativePointer));
    }

    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        float[] fArr = this.arr;
        return fArr != null && (((int) fArr[0]) & 8) == 8;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlex() {
        return YogaNative.jni_YGNodeStyleGetFlex(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getFlexBasis() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetFlexBasis(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaFlexDirection getFlexDirection() {
        return YogaFlexDirection.fromInt(YogaNative.jni_YGNodeStyleGetFlexDirection(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlexGrow() {
        return YogaNative.jni_YGNodeStyleGetFlexGrow(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlexShrink() {
        return YogaNative.jni_YGNodeStyleGetFlexShrink(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetHeight(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaJustify getJustifyContent() {
        return YogaJustify.fromInt(YogaNative.jni_YGNodeStyleGetJustifyContent(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutBorder(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        if ((((int) fArr[0]) & 4) != 4) {
            return 0.0f;
        }
        int i2 = 14 - ((((int) fArr[0]) & 1) == 1 ? 0 : 4);
        if ((((int) this.arr[0]) & 2) != 2) {
            i = 4;
        }
        int i3 = i2 - i;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.arr[i3];
        }
        if (ordinal == 1) {
            return this.arr[i3 + 1];
        }
        if (ordinal == 2) {
            return this.arr[i3 + 2];
        }
        if (ordinal == 3) {
            return this.arr[i3 + 3];
        }
        if (ordinal == 4) {
            return getLayoutDirection() == YogaDirection.RTL ? this.arr[i3 + 2] : this.arr[i3];
        }
        if (ordinal == 5) {
            return getLayoutDirection() == YogaDirection.RTL ? this.arr[i3] : this.arr[i3 + 2];
        }
        throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDirection getLayoutDirection() {
        float[] fArr = this.arr;
        return YogaDirection.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutHeight() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutMargin(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.arr[6];
        }
        if (ordinal == 1) {
            return this.arr[7];
        }
        if (ordinal == 2) {
            return this.arr[8];
        }
        if (ordinal == 3) {
            return this.arr[9];
        }
        if (ordinal == 4) {
            return getLayoutDirection() == YogaDirection.RTL ? this.arr[8] : this.arr[6];
        }
        if (ordinal == 5) {
            return getLayoutDirection() == YogaDirection.RTL ? this.arr[6] : this.arr[8];
        }
        throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutPadding(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        if ((((int) fArr[0]) & 2) != 2) {
            return 0.0f;
        }
        if ((((int) fArr[0]) & 1) != 1) {
            i = 4;
        }
        int i2 = 10 - i;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.arr[i2];
        }
        if (ordinal == 1) {
            return this.arr[i2 + 1];
        }
        if (ordinal == 2) {
            return this.arr[i2 + 2];
        }
        if (ordinal == 3) {
            return this.arr[i2 + 3];
        }
        if (ordinal == 4) {
            return getLayoutDirection() == YogaDirection.RTL ? this.arr[i2 + 2] : this.arr[i2];
        }
        if (ordinal == 5) {
            return getLayoutDirection() == YogaDirection.RTL ? this.arr[i2] : this.arr[i2 + 2];
        }
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutWidth() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutX() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutY() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMargin(YogaEdge yogaEdge) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMargin(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMaxHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMaxHeight(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMaxWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMaxWidth(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMinHeight() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMinHeight(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getMinWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetMinWidth(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaOverflow getOverflow() {
        return YogaOverflow.fromInt(YogaNative.jni_YGNodeStyleGetOverflow(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase getOwner() {
        return this.mOwner;
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getPadding(YogaEdge yogaEdge) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetPadding(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    @Deprecated
    public YogaNodeJNIBase getParent() {
        return getOwner();
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getPosition(YogaEdge yogaEdge) {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetPosition(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaPositionType getPositionType() {
        return YogaPositionType.fromInt(YogaNative.jni_YGNodeStyleGetPositionType(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaDirection getStyleDirection() {
        return YogaDirection.fromInt(YogaNative.jni_YGNodeStyleGetDirection(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaValue getWidth() {
        return valueFromLong(YogaNative.jni_YGNodeStyleGetWidth(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaWrap getWrap() {
        return YogaWrap.fromInt(YogaNative.jni_YGNodeStyleGetFlexWrap(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean hasNewLayout() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.mHasNewLayout;
    }

    @Override // com.facebook.yoga.YogaNode
    public int indexOf(YogaNode yogaNode) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return -1;
        }
        return list.indexOf(yogaNode);
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isBaselineDefined() {
        return this.mBaselineFunction != null;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isDirty() {
        return YogaNative.jni_YGNodeIsDirty(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isMeasureDefined() {
        return this.mMeasureFunction != null;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isReferenceBaseline() {
        return YogaNative.jni_YGNodeIsReferenceBaseline(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void markLayoutSeen() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = (float) (((int) fArr[0]) & -17);
        }
        this.mHasNewLayout = false;
    }

    @DoNotStrip
    public final long measure(float f2, int i, float f3, int i2) {
        if (isMeasureDefined()) {
            return this.mMeasureFunction.measure(this, f2, YogaMeasureMode.fromInt(i), f3, YogaMeasureMode.fromInt(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.YogaNode
    public void print() {
        YogaNative.jni_YGNodePrint(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public YogaNodeJNIBase removeChildAt(int i) {
        List<YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.mOwner = null;
            YogaNative.jni_YGNodeRemoveChild(this.mNativePointer, remove.mNativePointer);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    public void reset() {
        this.mMeasureFunction = null;
        this.mBaselineFunction = null;
        this.mData = null;
        this.arr = null;
        this.mHasNewLayout = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeReset(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignContent(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContent(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignItems(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItems(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignSelf(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelf(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAspectRatio(float f2) {
        YogaNative.jni_YGNodeStyleSetAspectRatio(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mBaselineFunction = yogaBaselineFunction;
        YogaNative.jni_YGNodeSetHasBaselineFunc(this.mNativePointer, yogaBaselineFunction != null);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setBorder(YogaEdge yogaEdge, float f2) {
        YogaNative.jni_YGNodeStyleSetBorder(this.mNativePointer, yogaEdge.intValue(), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setData(Object obj) {
        this.mData = obj;
    }

    @Override // com.facebook.yoga.YogaNode
    public void setDirection(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirection(this.mNativePointer, yogaDirection.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setDisplay(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplay(this.mNativePointer, yogaDisplay.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlex(float f2) {
        YogaNative.jni_YGNodeStyleSetFlex(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasis(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasis(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasisAuto() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAuto(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasisPercent(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercent(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirection(this.mNativePointer, yogaFlexDirection.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexGrow(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexGrow(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexShrink(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexShrink(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeight(float f2) {
        YogaNative.jni_YGNodeStyleSetHeight(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeightAuto() {
        YogaNative.jni_YGNodeStyleSetHeightAuto(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeightPercent(float f2) {
        YogaNative.jni_YGNodeStyleSetHeightPercent(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setIsReferenceBaseline(boolean z) {
        YogaNative.jni_YGNodeSetIsReferenceBaseline(this.mNativePointer, z);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setJustifyContent(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContent(this.mNativePointer, yogaJustify.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMargin(YogaEdge yogaEdge, float f2) {
        YogaNative.jni_YGNodeStyleSetMargin(this.mNativePointer, yogaEdge.intValue(), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMarginAuto(YogaEdge yogaEdge) {
        YogaNative.jni_YGNodeStyleSetMarginAuto(this.mNativePointer, yogaEdge.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMarginPercent(YogaEdge yogaEdge, float f2) {
        YogaNative.jni_YGNodeStyleSetMarginPercent(this.mNativePointer, yogaEdge.intValue(), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxHeight(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeight(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxHeightPercent(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercent(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxWidth(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidth(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxWidthPercent(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercent(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mMeasureFunction = yogaMeasureFunction;
        YogaNative.jni_YGNodeSetHasMeasureFunc(this.mNativePointer, yogaMeasureFunction != null);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinHeight(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeight(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinHeightPercent(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercent(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinWidth(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidth(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinWidthPercent(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercent(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setOverflow(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflow(this.mNativePointer, yogaOverflow.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPadding(YogaEdge yogaEdge, float f2) {
        YogaNative.jni_YGNodeStyleSetPadding(this.mNativePointer, yogaEdge.intValue(), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPaddingPercent(YogaEdge yogaEdge, float f2) {
        YogaNative.jni_YGNodeStyleSetPaddingPercent(this.mNativePointer, yogaEdge.intValue(), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPosition(YogaEdge yogaEdge, float f2) {
        YogaNative.jni_YGNodeStyleSetPosition(this.mNativePointer, yogaEdge.intValue(), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPositionPercent(YogaEdge yogaEdge, float f2) {
        YogaNative.jni_YGNodeStyleSetPositionPercent(this.mNativePointer, yogaEdge.intValue(), f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPositionType(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionType(this.mNativePointer, yogaPositionType.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setStyleInputs(float[] fArr, int i) {
        YogaNative.jni_YGNodeSetStyleInputs(this.mNativePointer, fArr, i);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidth(float f2) {
        YogaNative.jni_YGNodeStyleSetWidth(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidthAuto() {
        YogaNative.jni_YGNodeStyleSetWidthAuto(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidthPercent(float f2) {
        YogaNative.jni_YGNodeStyleSetWidthPercent(this.mNativePointer, f2);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWrap(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrap(this.mNativePointer, yogaWrap.intValue());
    }
}
