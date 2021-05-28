package com.facebook.yoga.android;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.HashMap;
import java.util.Map;

public class YogaLayout extends ViewGroup {
    public final YogaNode mYogaNode;
    public final Map<View, YogaNode> mYogaNodes;

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public SparseArray<Float> numericAttributes;
        public SparseArray<String> stringAttributes;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.numericAttributes = new SparseArray<>();
            this.stringAttributes = new SparseArray<>();
            if (i >= 0) {
                this.numericAttributes.put(R.styleable.yoga_yg_width, Float.valueOf((float) i));
            }
            if (i2 >= 0) {
                this.numericAttributes.put(R.styleable.yoga_yg_height, Float.valueOf((float) i2));
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            SparseArray sparseArray;
            float f2;
            Object string;
            this.numericAttributes = new SparseArray<>();
            this.stringAttributes = new SparseArray<>();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.yoga);
            int i = ((ViewGroup.LayoutParams) this).width;
            if (i >= 0) {
                this.numericAttributes.put(R.styleable.yoga_yg_width, Float.valueOf((float) i));
            }
            int i2 = ((ViewGroup.LayoutParams) this).height;
            if (i2 >= 0) {
                this.numericAttributes.put(R.styleable.yoga_yg_height, Float.valueOf((float) i2));
            }
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                TypedValue typedValue = new TypedValue();
                obtainStyledAttributes.getValue(index, typedValue);
                int i4 = typedValue.type;
                if (i4 == 5) {
                    sparseArray = this.numericAttributes;
                    f2 = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (i4 == 3) {
                    sparseArray = this.stringAttributes;
                    string = obtainStyledAttributes.getString(index);
                    sparseArray.put(index, string);
                } else {
                    sparseArray = this.numericAttributes;
                    f2 = obtainStyledAttributes.getFloat(index, 0.0f);
                }
                string = Float.valueOf(f2);
                sparseArray.put(index, string);
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.numericAttributes = layoutParams2.numericAttributes.clone();
                this.stringAttributes = layoutParams2.stringAttributes.clone();
                return;
            }
            this.numericAttributes = new SparseArray<>();
            this.stringAttributes = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.numericAttributes.put(R.styleable.yoga_yg_width, Float.valueOf((float) ((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.numericAttributes.put(R.styleable.yoga_yg_height, Float.valueOf((float) ((ViewGroup.LayoutParams) this).height));
            }
        }
    }

    public static class ViewMeasureFunction implements YogaMeasureFunction {
        private int viewMeasureSpecFromYogaMeasureMode(YogaMeasureMode yogaMeasureMode) {
            if (yogaMeasureMode == YogaMeasureMode.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return yogaMeasureMode == YogaMeasureMode.EXACTLY ? 1073741824 : 0;
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2) {
            View view = (View) yogaNode.getData();
            if (view == null || (view instanceof YogaLayout)) {
                return YogaMeasureOutput.make(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f2, viewMeasureSpecFromYogaMeasureMode(yogaMeasureMode)), View.MeasureSpec.makeMeasureSpec((int) f3, viewMeasureSpecFromYogaMeasureMode(yogaMeasureMode2)));
            return YogaMeasureOutput.make(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public YogaLayout(Context context) {
        this(context, null, 0);
    }

    public YogaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YogaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mYogaNode = YogaNode.create();
        this.mYogaNodes = new HashMap();
        this.mYogaNode.setData(this);
        this.mYogaNode.setMeasureFunction(new ViewMeasureFunction());
        applyLayoutParams(attributeSet != null ? new LayoutParams(context, attributeSet) : (LayoutParams) generateDefaultLayoutParams(), this.mYogaNode, this);
    }

    public static void applyLayoutParams(LayoutParams layoutParams, YogaNode yogaNode, View view) {
        YogaEdge yogaEdge;
        YogaEdge yogaEdge2;
        YogaEdge yogaEdge3;
        YogaEdge yogaEdge4;
        YogaEdge yogaEdge5;
        YogaEdge yogaEdge6;
        YogaEdge yogaEdge7;
        YogaEdge yogaEdge8;
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            yogaNode.setDirection(YogaDirection.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                yogaNode.setPadding(YogaEdge.LEFT, (float) rect.left);
                yogaNode.setPadding(YogaEdge.TOP, (float) rect.top);
                yogaNode.setPadding(YogaEdge.RIGHT, (float) rect.right);
                yogaNode.setPadding(YogaEdge.BOTTOM, (float) rect.bottom);
            }
        }
        for (int i = 0; i < layoutParams.numericAttributes.size(); i++) {
            int keyAt = layoutParams.numericAttributes.keyAt(i);
            float floatValue = layoutParams.numericAttributes.valueAt(i).floatValue();
            if (keyAt == R.styleable.yoga_yg_alignContent) {
                yogaNode.setAlignContent(YogaAlign.fromInt(Math.round(floatValue)));
            } else if (keyAt == R.styleable.yoga_yg_alignItems) {
                yogaNode.setAlignItems(YogaAlign.fromInt(Math.round(floatValue)));
            } else if (keyAt == R.styleable.yoga_yg_alignSelf) {
                yogaNode.setAlignSelf(YogaAlign.fromInt(Math.round(floatValue)));
            } else if (keyAt == R.styleable.yoga_yg_aspectRatio) {
                yogaNode.setAspectRatio(floatValue);
            } else {
                if (keyAt == R.styleable.yoga_yg_borderLeft) {
                    yogaEdge8 = YogaEdge.LEFT;
                } else if (keyAt == R.styleable.yoga_yg_borderTop) {
                    yogaEdge8 = YogaEdge.TOP;
                } else if (keyAt == R.styleable.yoga_yg_borderRight) {
                    yogaEdge8 = YogaEdge.RIGHT;
                } else if (keyAt == R.styleable.yoga_yg_borderBottom) {
                    yogaEdge8 = YogaEdge.BOTTOM;
                } else if (keyAt == R.styleable.yoga_yg_borderStart) {
                    yogaEdge8 = YogaEdge.START;
                } else if (keyAt == R.styleable.yoga_yg_borderEnd) {
                    yogaEdge8 = YogaEdge.END;
                } else if (keyAt == R.styleable.yoga_yg_borderHorizontal) {
                    yogaEdge8 = YogaEdge.HORIZONTAL;
                } else if (keyAt == R.styleable.yoga_yg_borderVertical) {
                    yogaEdge8 = YogaEdge.VERTICAL;
                } else if (keyAt == R.styleable.yoga_yg_borderAll) {
                    yogaEdge8 = YogaEdge.ALL;
                } else if (keyAt == R.styleable.yoga_yg_direction) {
                    yogaNode.setDirection(YogaDirection.fromInt(Math.round(floatValue)));
                } else if (keyAt == R.styleable.yoga_yg_display) {
                    yogaNode.setDisplay(YogaDisplay.fromInt(Math.round(floatValue)));
                } else if (keyAt == R.styleable.yoga_yg_flex) {
                    yogaNode.setFlex(floatValue);
                } else if (keyAt == R.styleable.yoga_yg_flexBasis) {
                    yogaNode.setFlexBasis(floatValue);
                } else if (keyAt == R.styleable.yoga_yg_flexDirection) {
                    yogaNode.setFlexDirection(YogaFlexDirection.fromInt(Math.round(floatValue)));
                } else if (keyAt == R.styleable.yoga_yg_flexGrow) {
                    yogaNode.setFlexGrow(floatValue);
                } else if (keyAt == R.styleable.yoga_yg_flexShrink) {
                    yogaNode.setFlexShrink(floatValue);
                } else if (keyAt == R.styleable.yoga_yg_height) {
                    yogaNode.setHeight(floatValue);
                } else {
                    if (keyAt == R.styleable.yoga_yg_marginLeft) {
                        yogaEdge7 = YogaEdge.LEFT;
                    } else if (keyAt == R.styleable.yoga_yg_justifyContent) {
                        yogaNode.setJustifyContent(YogaJustify.fromInt(Math.round(floatValue)));
                    } else if (keyAt == R.styleable.yoga_yg_marginTop) {
                        yogaEdge7 = YogaEdge.TOP;
                    } else if (keyAt == R.styleable.yoga_yg_marginRight) {
                        yogaEdge7 = YogaEdge.RIGHT;
                    } else if (keyAt == R.styleable.yoga_yg_marginBottom) {
                        yogaEdge7 = YogaEdge.BOTTOM;
                    } else if (keyAt == R.styleable.yoga_yg_marginStart) {
                        yogaEdge7 = YogaEdge.START;
                    } else if (keyAt == R.styleable.yoga_yg_marginEnd) {
                        yogaEdge7 = YogaEdge.END;
                    } else if (keyAt == R.styleable.yoga_yg_marginHorizontal) {
                        yogaEdge7 = YogaEdge.HORIZONTAL;
                    } else if (keyAt == R.styleable.yoga_yg_marginVertical) {
                        yogaEdge7 = YogaEdge.VERTICAL;
                    } else if (keyAt == R.styleable.yoga_yg_marginAll) {
                        yogaEdge7 = YogaEdge.ALL;
                    } else if (keyAt == R.styleable.yoga_yg_maxHeight) {
                        yogaNode.setMaxHeight(floatValue);
                    } else if (keyAt == R.styleable.yoga_yg_maxWidth) {
                        yogaNode.setMaxWidth(floatValue);
                    } else if (keyAt == R.styleable.yoga_yg_minHeight) {
                        yogaNode.setMinHeight(floatValue);
                    } else if (keyAt == R.styleable.yoga_yg_minWidth) {
                        yogaNode.setMinWidth(floatValue);
                    } else if (keyAt == R.styleable.yoga_yg_overflow) {
                        yogaNode.setOverflow(YogaOverflow.fromInt(Math.round(floatValue)));
                    } else {
                        if (keyAt == R.styleable.yoga_yg_paddingLeft) {
                            yogaEdge6 = YogaEdge.LEFT;
                        } else if (keyAt == R.styleable.yoga_yg_paddingTop) {
                            yogaEdge6 = YogaEdge.TOP;
                        } else if (keyAt == R.styleable.yoga_yg_paddingRight) {
                            yogaEdge6 = YogaEdge.RIGHT;
                        } else if (keyAt == R.styleable.yoga_yg_paddingBottom) {
                            yogaEdge6 = YogaEdge.BOTTOM;
                        } else if (keyAt == R.styleable.yoga_yg_paddingStart) {
                            yogaEdge6 = YogaEdge.START;
                        } else if (keyAt == R.styleable.yoga_yg_paddingEnd) {
                            yogaEdge6 = YogaEdge.END;
                        } else if (keyAt == R.styleable.yoga_yg_paddingHorizontal) {
                            yogaEdge6 = YogaEdge.HORIZONTAL;
                        } else if (keyAt == R.styleable.yoga_yg_paddingVertical) {
                            yogaEdge6 = YogaEdge.VERTICAL;
                        } else if (keyAt == R.styleable.yoga_yg_paddingAll) {
                            yogaEdge6 = YogaEdge.ALL;
                        } else {
                            if (keyAt == R.styleable.yoga_yg_positionLeft) {
                                yogaEdge5 = YogaEdge.LEFT;
                            } else if (keyAt == R.styleable.yoga_yg_positionTop) {
                                yogaEdge5 = YogaEdge.TOP;
                            } else if (keyAt == R.styleable.yoga_yg_positionRight) {
                                yogaEdge5 = YogaEdge.RIGHT;
                            } else if (keyAt == R.styleable.yoga_yg_positionBottom) {
                                yogaEdge5 = YogaEdge.BOTTOM;
                            } else if (keyAt == R.styleable.yoga_yg_positionStart) {
                                yogaEdge5 = YogaEdge.START;
                            } else if (keyAt == R.styleable.yoga_yg_positionEnd) {
                                yogaEdge5 = YogaEdge.END;
                            } else if (keyAt == R.styleable.yoga_yg_positionHorizontal) {
                                yogaEdge5 = YogaEdge.HORIZONTAL;
                            } else if (keyAt == R.styleable.yoga_yg_positionVertical) {
                                yogaEdge5 = YogaEdge.VERTICAL;
                            } else if (keyAt == R.styleable.yoga_yg_positionAll) {
                                yogaEdge5 = YogaEdge.ALL;
                            } else if (keyAt == R.styleable.yoga_yg_positionType) {
                                yogaNode.setPositionType(YogaPositionType.fromInt(Math.round(floatValue)));
                            } else if (keyAt == R.styleable.yoga_yg_width) {
                                yogaNode.setWidth(floatValue);
                            } else if (keyAt == R.styleable.yoga_yg_wrap) {
                                yogaNode.setWrap(YogaWrap.fromInt(Math.round(floatValue)));
                            }
                            yogaNode.setPosition(yogaEdge5, floatValue);
                        }
                        yogaNode.setPadding(yogaEdge6, floatValue);
                    }
                    yogaNode.setMargin(yogaEdge7, floatValue);
                }
                yogaNode.setBorder(yogaEdge8, floatValue);
            }
        }
        for (int i2 = 0; i2 < layoutParams.stringAttributes.size(); i2++) {
            int keyAt2 = layoutParams.stringAttributes.keyAt(i2);
            String valueAt = layoutParams.stringAttributes.valueAt(i2);
            if (valueAt.equals("auto")) {
                if (keyAt2 == R.styleable.yoga_yg_marginLeft) {
                    yogaEdge4 = YogaEdge.LEFT;
                } else if (keyAt2 == R.styleable.yoga_yg_marginTop) {
                    yogaEdge4 = YogaEdge.TOP;
                } else if (keyAt2 == R.styleable.yoga_yg_marginRight) {
                    yogaEdge4 = YogaEdge.RIGHT;
                } else if (keyAt2 == R.styleable.yoga_yg_marginBottom) {
                    yogaEdge4 = YogaEdge.BOTTOM;
                } else if (keyAt2 == R.styleable.yoga_yg_marginStart) {
                    yogaEdge4 = YogaEdge.START;
                } else if (keyAt2 == R.styleable.yoga_yg_marginEnd) {
                    yogaEdge4 = YogaEdge.END;
                } else if (keyAt2 == R.styleable.yoga_yg_marginHorizontal) {
                    yogaEdge4 = YogaEdge.HORIZONTAL;
                } else if (keyAt2 == R.styleable.yoga_yg_marginVertical) {
                    yogaEdge4 = YogaEdge.VERTICAL;
                } else if (keyAt2 == R.styleable.yoga_yg_marginAll) {
                    yogaEdge4 = YogaEdge.ALL;
                }
                yogaNode.setMarginAuto(yogaEdge4);
            }
            if (valueAt.endsWith("%")) {
                float parseFloat = Float.parseFloat(valueAt.substring(0, valueAt.length() - 1));
                if (keyAt2 == R.styleable.yoga_yg_flexBasis) {
                    yogaNode.setFlexBasisPercent(parseFloat);
                } else if (keyAt2 == R.styleable.yoga_yg_height) {
                    yogaNode.setHeightPercent(parseFloat);
                } else {
                    if (keyAt2 == R.styleable.yoga_yg_marginLeft) {
                        yogaEdge3 = YogaEdge.LEFT;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginTop) {
                        yogaEdge3 = YogaEdge.TOP;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginRight) {
                        yogaEdge3 = YogaEdge.RIGHT;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginBottom) {
                        yogaEdge3 = YogaEdge.BOTTOM;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginStart) {
                        yogaEdge3 = YogaEdge.START;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginEnd) {
                        yogaEdge3 = YogaEdge.END;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginHorizontal) {
                        yogaEdge3 = YogaEdge.HORIZONTAL;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginVertical) {
                        yogaEdge3 = YogaEdge.VERTICAL;
                    } else if (keyAt2 == R.styleable.yoga_yg_marginAll) {
                        yogaEdge3 = YogaEdge.ALL;
                    } else if (keyAt2 == R.styleable.yoga_yg_maxHeight) {
                        yogaNode.setMaxHeightPercent(parseFloat);
                    } else if (keyAt2 == R.styleable.yoga_yg_maxWidth) {
                        yogaNode.setMaxWidthPercent(parseFloat);
                    } else if (keyAt2 == R.styleable.yoga_yg_minHeight) {
                        yogaNode.setMinHeightPercent(parseFloat);
                    } else if (keyAt2 == R.styleable.yoga_yg_minWidth) {
                        yogaNode.setMinWidthPercent(parseFloat);
                    } else {
                        if (keyAt2 == R.styleable.yoga_yg_paddingLeft) {
                            yogaEdge2 = YogaEdge.LEFT;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingTop) {
                            yogaEdge2 = YogaEdge.TOP;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingRight) {
                            yogaEdge2 = YogaEdge.RIGHT;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingBottom) {
                            yogaEdge2 = YogaEdge.BOTTOM;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingStart) {
                            yogaEdge2 = YogaEdge.START;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingEnd) {
                            yogaEdge2 = YogaEdge.END;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingHorizontal) {
                            yogaEdge2 = YogaEdge.HORIZONTAL;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingVertical) {
                            yogaEdge2 = YogaEdge.VERTICAL;
                        } else if (keyAt2 == R.styleable.yoga_yg_paddingAll) {
                            yogaEdge2 = YogaEdge.ALL;
                        } else {
                            if (keyAt2 == R.styleable.yoga_yg_positionLeft) {
                                yogaEdge = YogaEdge.LEFT;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionTop) {
                                yogaEdge = YogaEdge.TOP;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionRight) {
                                yogaEdge = YogaEdge.RIGHT;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionBottom) {
                                yogaEdge = YogaEdge.BOTTOM;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionStart) {
                                yogaEdge = YogaEdge.START;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionEnd) {
                                yogaEdge = YogaEdge.END;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionHorizontal) {
                                yogaEdge = YogaEdge.HORIZONTAL;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionVertical) {
                                yogaEdge = YogaEdge.VERTICAL;
                            } else if (keyAt2 == R.styleable.yoga_yg_positionAll) {
                                yogaEdge = YogaEdge.ALL;
                            } else if (keyAt2 == R.styleable.yoga_yg_width) {
                                yogaNode.setWidthPercent(parseFloat);
                            }
                            yogaNode.setPositionPercent(yogaEdge, parseFloat);
                        }
                        yogaNode.setPaddingPercent(yogaEdge2, parseFloat);
                    }
                    yogaNode.setMarginPercent(yogaEdge3, parseFloat);
                }
            }
        }
    }

    private void applyLayoutRecursive(YogaNode yogaNode, float f2, float f3) {
        View view = (View) yogaNode.getData();
        if (!(view == null || view == this)) {
            if (view.getVisibility() != 8) {
                int round = Math.round(yogaNode.getLayoutX() + f2);
                int round2 = Math.round(yogaNode.getLayoutY() + f3);
                view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(yogaNode.getLayoutWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(yogaNode.getLayoutHeight()), 1073741824));
                view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
            } else {
                return;
            }
        }
        int childCount = yogaNode.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (equals(view)) {
                applyLayoutRecursive(yogaNode.getChildAt(i), f2, f3);
            } else if (!(view instanceof YogaLayout)) {
                applyLayoutRecursive(yogaNode.getChildAt(i), yogaNode.getLayoutX() + f2, yogaNode.getLayoutY() + f3);
            }
        }
    }

    private void createLayout(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.mYogaNode.setHeight((float) size2);
        }
        if (mode == 1073741824) {
            this.mYogaNode.setWidth((float) size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.mYogaNode.setMaxHeight((float) size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.mYogaNode.setMaxWidth((float) size);
        }
        this.mYogaNode.calculateLayout(Float.NaN, Float.NaN);
    }

    private void removeViewFromYogaTree(View view, boolean z) {
        YogaNode yogaNode = this.mYogaNodes.get(view);
        if (yogaNode != null) {
            YogaNode owner = yogaNode.getOwner();
            int i = 0;
            while (true) {
                if (i >= owner.getChildCount()) {
                    break;
                } else if (owner.getChildAt(i).equals(yogaNode)) {
                    owner.removeChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            yogaNode.setData(null);
            this.mYogaNodes.remove(view);
            if (z) {
                this.mYogaNode.calculateLayout(Float.NaN, Float.NaN);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        YogaNode yogaNode;
        this.mYogaNode.setMeasureFunction(null);
        if (view instanceof VirtualYogaLayout) {
            VirtualYogaLayout virtualYogaLayout = (VirtualYogaLayout) view;
            virtualYogaLayout.transferChildren(this);
            YogaNode yogaNode2 = virtualYogaLayout.getYogaNode();
            YogaNode yogaNode3 = this.mYogaNode;
            yogaNode3.addChildAt(yogaNode2, yogaNode3.getChildCount());
            return;
        }
        super.addView(view, i, layoutParams);
        if (!this.mYogaNodes.containsKey(view)) {
            if (view instanceof YogaLayout) {
                yogaNode = ((YogaLayout) view).getYogaNode();
            } else {
                yogaNode = this.mYogaNodes.containsKey(view) ? this.mYogaNodes.get(view) : YogaNode.create();
                yogaNode.setData(view);
                yogaNode.setMeasureFunction(new ViewMeasureFunction());
            }
            applyLayoutParams((LayoutParams) view.getLayoutParams(), yogaNode, view);
            this.mYogaNodes.put(view, yogaNode);
            YogaNode yogaNode4 = this.mYogaNode;
            yogaNode4.addChildAt(yogaNode, yogaNode4.getChildCount());
        }
    }

    public void addView(View view, YogaNode yogaNode) {
        this.mYogaNodes.put(view, yogaNode);
        addView(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public YogaNode getYogaNode() {
        return this.mYogaNode;
    }

    public YogaNode getYogaNodeForView(View view) {
        return this.mYogaNodes.get(view);
    }

    public void invalidate(View view) {
        if (this.mYogaNodes.containsKey(view)) {
            this.mYogaNodes.get(view).dirty();
            return;
        }
        int childCount = this.mYogaNode.getChildCount();
        for (int i = 0; i < childCount; i++) {
            YogaNode childAt = this.mYogaNode.getChildAt(i);
            if (childAt.getData() instanceof YogaLayout) {
                ((YogaLayout) childAt.getData()).invalidate(view);
            }
        }
        invalidate();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!(getParent() instanceof YogaLayout)) {
            createLayout(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        applyLayoutRecursive(this.mYogaNode, 0.0f, 0.0f);
    }

    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof YogaLayout)) {
            createLayout(i, i2);
        }
        setMeasuredDimension(Math.round(this.mYogaNode.getLayoutWidth()), Math.round(this.mYogaNode.getLayoutHeight()));
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            removeViewFromYogaTree(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            removeViewFromYogaTree(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        removeViewFromYogaTree(view, false);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        removeViewFromYogaTree(getChildAt(i), false);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        removeViewFromYogaTree(view, true);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            removeViewFromYogaTree(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            removeViewFromYogaTree(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }
}
