package com.didi.hummer.component.input;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsProperty;
import e.c.a.b.e;
import e.c.a.b.l;
import e.e.a.o.h.b;
import e.e.a.o.h.c;
import e.e.a.o.h.d;
import e.e.a.y.a.b.j;
import java.lang.reflect.Field;
import java.util.LinkedList;

@Component
public class Input extends j<EditText> {
    @JsProperty
    public boolean focused;
    public TextView.OnEditorActionListener mOnEditorActionListener = new e.e.a.o.h.a(this);
    public View.OnFocusChangeListener mOnFocusChangeListener = new b(this);
    public View.OnKeyListener mOnKeyListener = new c(this);
    public final d mProperty = new d((EditText) getView(), isSingleLine());
    public TextWatcher mTextWatcher = new a();
    public ColorStateList orgHintColors;
    public ColorStateList orgTextColors;
    public float orgTextSize;
    public Typeface orgTypeface;
    @JsProperty
    public String placeholder;
    @JsProperty
    public String text;

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            e.e.a.y.b.d.a aVar = new e.e.a.y.b.d.a();
            editable.toString();
            System.currentTimeMillis();
            Input.this.mEventManager.a("input", aVar);
            Input.this.requestLayout();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public Input(e.e.a.p.b bVar, e.e.a.q.b.c cVar, String str) {
        super(bVar, cVar, str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void requestLayout() {
        getYogaNode().dirty();
        ((EditText) getView()).requestLayout();
    }

    public /* synthetic */ void a(View view, boolean z) {
        if (z) {
            e.e.a.y.b.d.a aVar = new e.e.a.y.b.d.a();
            ((EditText) getView()).getText().toString();
            System.currentTimeMillis();
            this.mEventManager.a("input", aVar);
            return;
        }
        e.e.a.y.b.d.a aVar2 = new e.e.a.y.b.d.a();
        ((EditText) getView()).getText().toString();
        System.currentTimeMillis();
        this.mEventManager.a("input", aVar2);
        l.f.a(getView());
    }

    public /* synthetic */ boolean a(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0 || getView() == null || !TextUtils.isEmpty(((EditText) getView()).getText())) {
            return false;
        }
        e.e.a.y.b.d.a aVar = new e.e.a.y.b.d.a();
        System.currentTimeMillis();
        this.mEventManager.a("input", aVar);
        return false;
    }

    public /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6) {
            return false;
        }
        e.e.a.y.b.d.a aVar = new e.e.a.y.b.d.a();
        ((EditText) getView()).getText().toString();
        System.currentTimeMillis();
        this.mEventManager.a("input", aVar);
        return true;
    }

    @Override // e.e.a.y.a.b.j
    public EditText createViewInstance(Context context) {
        return new EditText(context);
    }

    public String getText() {
        return this.mProperty.f4380a.getText().toString();
    }

    public boolean isSingleLine() {
        return true;
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        this.orgTextColors = ((EditText) getView()).getTextColors();
        this.orgHintColors = ((EditText) getView()).getHintTextColors();
        this.orgTextSize = ((EditText) getView()).getTextSize();
        this.orgTypeface = ((EditText) getView()).getTypeface();
        ((EditText) getView()).setBackgroundColor(0);
        ((EditText) getView()).setImeOptions(6);
        ((EditText) getView()).addTextChangedListener(this.mTextWatcher);
        ((EditText) getView()).setOnFocusChangeListener(this.mOnFocusChangeListener);
        ((EditText) getView()).setOnEditorActionListener(this.mOnEditorActionListener);
        ((EditText) getView()).setOnKeyListener(this.mOnKeyListener);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onDestroy() {
        super.onDestroy();
        ((EditText) getView()).removeTextChangedListener(this.mTextWatcher);
        ((EditText) getView()).setOnKeyListener(null);
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        ((EditText) getView()).setBackgroundColor(0);
        ((EditText) getView()).setTextColor(this.orgTextColors);
        ((EditText) getView()).setHintTextColor(this.orgHintColors);
        ((EditText) getView()).setTextSize(0, this.orgTextSize);
        ((EditText) getView()).setTypeface(this.orgTypeface);
        setType("default");
        setReturnKeyType("done");
        setTextAlign("left");
        d dVar = this.mProperty;
        if (dVar != null) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    dVar.f4380a.getTextCursorDrawable().mutate().setColorFilter(null);
                    return;
                }
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i = declaredField.getInt(dVar.f4380a);
                if (i != 0) {
                    Drawable b = d.g.e.a.b(dVar.f4380a.getContext(), i);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(dVar.f4380a);
                    Class<?> cls = obj.getClass();
                    if (Build.VERSION.SDK_INT >= 28) {
                        Field declaredField3 = cls.getDeclaredField("mDrawableForCursor");
                        declaredField3.setAccessible(true);
                        declaredField3.set(obj, b);
                        return;
                    }
                    Field declaredField4 = cls.getDeclaredField("mCursorDrawable");
                    declaredField4.setAccessible(true);
                    declaredField4.set(obj, new Drawable[]{b, b});
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            throw null;
        }
    }

    @JsAttribute
    public void setColor(int i) {
        this.mProperty.f4380a.setTextColor(i);
    }

    @JsAttribute
    public void setCursorColor(int i) {
        d dVar = this.mProperty;
        if (dVar != null) {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    dVar.f4380a.getTextCursorDrawable().mutate().setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
                    return;
                }
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i2 = declaredField.getInt(dVar.f4380a);
                if (i2 != 0) {
                    Drawable b = d.g.e.a.b(dVar.f4380a.getContext(), i2);
                    b.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(dVar.f4380a);
                    Class<?> cls = obj.getClass();
                    if (Build.VERSION.SDK_INT >= 28) {
                        Field declaredField3 = cls.getDeclaredField("mDrawableForCursor");
                        declaredField3.setAccessible(true);
                        declaredField3.set(obj, b);
                        return;
                    }
                    Field declaredField4 = cls.getDeclaredField("mCursorDrawable");
                    declaredField4.setAccessible(true);
                    declaredField4.set(obj, new Drawable[]{b, b});
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            throw null;
        }
    }

    @Override // e.e.a.y.a.b.j
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ((EditText) getView()).setFocusable(z);
        ((EditText) getView()).setFocusableInTouchMode(z);
    }

    public void setFocused(boolean z) {
        if (!((EditText) getView()).isFocused() || !z) {
            d dVar = this.mProperty;
            if (z) {
                EditText editText = dVar.f4380a;
                if (editText != null) {
                    editText.post(new e(editText));
                    return;
                }
                return;
            }
            EditText editText2 = dVar.f4380a;
            if (editText2 != null) {
                editText2.post(new e.c.a.b.c(editText2));
            }
        }
    }

    @JsAttribute
    public void setFontFamily(String str) {
        d dVar = this.mProperty;
        if (dVar != null) {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(",");
                if (split.length != 0) {
                    int i = 0;
                    int style = dVar.f4380a.getTypeface() != null ? dVar.f4380a.getTypeface().getStyle() : 0;
                    int length = split.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Typeface a2 = e.e.a.o.n.b.a().a(split[i].trim(), style, dVar.f4380a.getContext().getAssets());
                        if (a2 != null) {
                            dVar.f4380a.setTypeface(a2);
                            break;
                        }
                        i++;
                    }
                }
            }
            requestLayout();
            return;
        }
        throw null;
    }

    @JsAttribute
    public void setFontSize(float f2) {
        this.mProperty.f4380a.setTextSize(0, f2);
        requestLayout();
    }

    @JsAttribute
    public void setMaxLength(int i) {
        d dVar = this.mProperty;
        InputFilter[] filters = dVar.f4380a.getFilters();
        InputFilter[] inputFilterArr = d.f4379e;
        if (i == 0) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i2 = 0; i2 < filters.length; i2++) {
                    if (!(filters[i2] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i2]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i3 = 0; i3 < filters.length; i3++) {
                if (filters[i3] instanceof InputFilter.LengthFilter) {
                    filters[i3] = new InputFilter.LengthFilter(i);
                    z = true;
                }
            }
            if (!z) {
                InputFilter[] inputFilterArr2 = new InputFilter[(filters.length + 1)];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(i);
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(i)};
        }
        dVar.f4380a.setFilters(inputFilterArr);
    }

    public void setPlaceholder(String str) {
        this.mProperty.f4380a.setHint(str);
        requestLayout();
    }

    @JsAttribute
    public void setPlaceholderColor(int i) {
        this.mProperty.f4380a.setHintTextColor(i);
    }

    @JsAttribute
    @Deprecated
    public void setPlaceholderFontSize(float f2) {
        this.mProperty.f4380a.setTextSize(0, f2);
        requestLayout();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @JsAttribute
    public void setReturnKeyType(String str) {
        char c2;
        d dVar = this.mProperty;
        EditText editText = dVar.f4380a;
        int i = 4;
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3304:
                if (str.equals("go")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3089282:
                if (str.equals("done")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3377907:
                if (str.equals("next")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3526536:
                if (str.equals("send")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            i = 2;
        } else if (c2 == 1) {
            i = 3;
        } else if (c2 != 2) {
            i = c2 != 3 ? 6 : 5;
        }
        editText.setImeOptions(i);
        InputMethodManager inputMethodManager = (InputMethodManager) dVar.f4380a.getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.restartInput(dVar.f4380a);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.j
    public boolean setStyle(String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -1595747923:
                if (str.equals("cursorColor")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1576785488:
                if (str.equals("placeholderColor")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1224696685:
                if (str.equals("fontFamily")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -791400086:
                if (str.equals("maxLength")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3575610:
                if (str.equals("type")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 947486441:
                if (str.equals("returnKeyType")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1035364227:
                if (str.equals("placeholderFontSize")) {
                    c2 = 5;
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
                setType(String.valueOf(obj));
                break;
            case 1:
                setColor(((Integer) obj).intValue());
                break;
            case 2:
                setFontFamily(String.valueOf(obj));
                break;
            case 3:
                setFontSize(((Float) obj).floatValue());
                break;
            case 4:
                setPlaceholderColor(((Integer) obj).intValue());
                break;
            case 5:
                setPlaceholderFontSize(((Float) obj).floatValue());
                break;
            case 6:
                setTextAlign(String.valueOf(obj));
                break;
            case 7:
                setCursorColor(((Integer) obj).intValue());
                break;
            case '\b':
                setMaxLength((int) ((Float) obj).floatValue());
                break;
            case '\t':
                setReturnKeyType(String.valueOf(obj));
                break;
            default:
                return false;
        }
        return true;
    }

    public void setText(String str) {
        d dVar = this.mProperty;
        dVar.f4380a.setText(str);
        if (dVar.f4380a.getText().length() > 0) {
            EditText editText = dVar.f4380a;
            editText.setSelection(editText.getText().length());
        }
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    @com.didi.hummer.annotation.JsAttribute
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextAlign(java.lang.String r7) {
        /*
            r6 = this;
            e.e.a.o.h.d r0 = r6.mProperty
            android.widget.EditText r1 = r0.f4380a
            int r2 = r7.hashCode()
            r3 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r4 = 3
            r5 = 2
            if (r2 == r3) goto L_0x002e
            r3 = 3317767(0x32a007, float:4.649182E-39)
            if (r2 == r3) goto L_0x0024
            r3 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r2 == r3) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r2 = "right"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0038
            r7 = 2
            goto L_0x0039
        L_0x0024:
            java.lang.String r2 = "left"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0038
            r7 = 0
            goto L_0x0039
        L_0x002e:
            java.lang.String r2 = "center"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0038
            r7 = 3
            goto L_0x0039
        L_0x0038:
            r7 = -1
        L_0x0039:
            if (r7 == r5) goto L_0x0052
            if (r7 == r4) goto L_0x0049
            boolean r7 = r0.f4381c
            if (r7 == 0) goto L_0x0045
            r7 = 8388627(0x800013, float:1.175497E-38)
            goto L_0x005d
        L_0x0045:
            r7 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x005d
        L_0x0049:
            boolean r7 = r0.f4381c
            if (r7 == 0) goto L_0x0050
            r7 = 17
            goto L_0x005d
        L_0x0050:
            r7 = 1
            goto L_0x005d
        L_0x0052:
            boolean r7 = r0.f4381c
            if (r7 == 0) goto L_0x005a
            r7 = 8388629(0x800015, float:1.1754973E-38)
            goto L_0x005d
        L_0x005a:
            r7 = 8388613(0x800005, float:1.175495E-38)
        L_0x005d:
            r1.setGravity(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.component.input.Input.setTextAlign(java.lang.String):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @JsAttribute
    public void setType(String str) {
        char c2;
        d dVar = this.mProperty;
        EditText editText = dVar.f4380a;
        switch (str.hashCode()) {
            case -1034364087:
                if (str.equals("number")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 114715:
                if (str.equals("tel")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 96619420:
                if (str.equals("email")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        editText.setInputType(c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? dVar.b : dVar.b | 128 : dVar.b | 3 : dVar.b | 2 : dVar.b | 32);
    }
}
