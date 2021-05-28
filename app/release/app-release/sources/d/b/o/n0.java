package d.b.o;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import d.b.f;
import d.h.a.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

public class n0 extends c implements View.OnClickListener {
    public int A = -1;
    public final SearchView n;
    public final SearchableInfo o;
    public final Context p;
    public final WeakHashMap<String, Drawable.ConstantState> q;
    public final int r;
    public boolean s = false;
    public int t = 1;
    public ColorStateList u;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int z = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f2957a;
        public final TextView b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f2958c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f2959d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f2960e;

        public a(View view) {
            this.f2957a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.f2958c = (ImageView) view.findViewById(16908295);
            this.f2959d = (ImageView) view.findViewById(16908296);
            this.f2960e = (ImageView) view.findViewById(f.edit_query);
        }
    }

    public n0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) this.f3396f.getSystemService("search");
        this.n = searchView;
        this.o = searchableInfo;
        this.r = searchView.getSuggestionCommitIconResId();
        this.p = context;
        this.q = weakHashMap;
    }

    public static String a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    public Cursor a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f3396f.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public Drawable a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3396f.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    @Override // d.h.a.a
    public void a(Cursor cursor) {
        if (this.s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.v = cursor.getColumnIndex("suggest_text_1");
                this.w = cursor.getColumnIndex("suggest_text_2");
                this.x = cursor.getColumnIndex("suggest_text_2_url");
                this.y = cursor.getColumnIndex("suggest_icon_1");
                this.z = cursor.getColumnIndex("suggest_icon_2");
                this.A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v6, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    @Override // d.h.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.n0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // d.h.a.a
    public CharSequence b(Cursor cursor) {
        String a2;
        String a3;
        if (cursor == null) {
            return null;
        }
        String a4 = a(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (a4 != null) {
            return a4;
        }
        if (this.o.shouldRewriteQueryFromData() && (a3 = a(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return a3;
        }
        if (!this.o.shouldRewriteQueryFromText() || (a2 = a(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return a2;
    }

    public final void c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // d.h.a.a
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            if (!this.f3393c) {
                return null;
            }
            this.f3395e.moveToPosition(i);
            if (view == null) {
                view = this.m.inflate(this.l, viewGroup, false);
            }
            a(view, this.f3396f, this.f3395e);
            return view;
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.m.inflate(this.l, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f2957a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // d.h.a.a
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View a2 = a(this.f3396f, this.f3395e, viewGroup);
            if (a2 != null) {
                ((a) a2.getTag()).f2957a.setText(e2.toString());
            }
            return a2;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(this.f3395e);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(this.f3395e);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.n.a((CharSequence) tag);
        }
    }

    public final Drawable a(String str) {
        Uri parse;
        InputStream openInputStream;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + this.p.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = this.q.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable b = d.g.e.a.b(this.p, parseInt);
                if (b != null) {
                    this.q.put(str2, b.getConstantState());
                }
                return b;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = this.q.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                parse = Uri.parse(str);
                try {
                    if ("android.resource".equals(parse.getScheme())) {
                        try {
                            drawable = a(parse);
                        } catch (Resources.NotFoundException unused2) {
                            throw new FileNotFoundException("Resource does not exist: " + parse);
                        }
                    } else {
                        openInputStream = this.p.getContentResolver().openInputStream(parse);
                        if (openInputStream != null) {
                            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                            try {
                                openInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e2);
                            }
                            drawable = createFromStream;
                        } else {
                            throw new FileNotFoundException("Failed to open " + parse);
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e3.getMessage());
                }
                if (drawable != null) {
                    this.q.put(str, drawable.getConstantState());
                }
            } catch (Resources.NotFoundException unused3) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (Throwable th) {
                try {
                    openInputStream.close();
                } catch (IOException e4) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e4);
                }
                throw th;
            }
        }
        return drawable;
    }

    @Override // d.h.a.a, d.h.a.c
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.m.inflate(this.k, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(f.edit_query)).setImageResource(this.r);
        return inflate;
    }
}
