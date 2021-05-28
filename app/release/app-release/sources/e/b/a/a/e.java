package e.b.a.a;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.bililive.tests.R;

public final class e extends DialogFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131493027);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.dialog_fragment_socket, viewGroup, false);
        }
        return null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }
}
