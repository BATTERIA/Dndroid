package e.e.a.o.h;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;

public class d {

    /* renamed from: e  reason: collision with root package name */
    public static final InputFilter[] f4379e = new InputFilter[0];

    /* renamed from: a  reason: collision with root package name */
    public final EditText f4380a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4381c;

    /* renamed from: d  reason: collision with root package name */
    public b f4382d = new b(null);

    public class b implements TextWatcher {

        /* renamed from: c  reason: collision with root package name */
        public int f4383c;

        public /* synthetic */ b(a aVar) {
        }

        public void afterTextChanged(Editable editable) {
            String str;
            int lineCount = d.this.f4380a.getLineCount();
            int i = this.f4383c;
            if (i > 0 && lineCount > i) {
                String obj = editable.toString();
                int selectionStart = d.this.f4380a.getSelectionStart();
                if (selectionStart != d.this.f4380a.getSelectionEnd() || selectionStart >= obj.length() || selectionStart < 1) {
                    str = obj.substring(0, editable.length() - 1);
                } else {
                    str = obj.substring(0, selectionStart - 1) + obj.substring(selectionStart);
                }
                d.this.f4380a.setText(str);
                EditText editText = d.this.f4380a;
                editText.setSelection(editText.getText().length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public d(EditText editText, boolean z) {
        this.f4381c = z;
        this.f4380a = editText;
        editText.setPadding(0, 0, 0, 0);
        this.f4380a.setSingleLine(z);
        this.f4380a.setTextSize(16.0f);
        if (!this.f4381c) {
            this.f4380a.setGravity(8388611);
            this.f4380a.addTextChangedListener(this.f4382d);
        }
        int inputType = editText.getInputType();
        this.b = inputType;
        if (inputType == 0) {
            this.b = 1;
        }
    }
}
