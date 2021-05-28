package com.bilibili.bililive.infra.util.cache.api;

import a.g;
import a.w.c.i;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.bilibili.bililive.tests.R;
import d.b.k.h;

@g(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\t"}, d2 = {"Lcom/bilibili/bililive/infra/util/cache/api/CacheActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Message", "Type", "app_release"}, mv = {1, 1, 16})
public final class CacheActivity extends h {

    @Keep
    @g(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/bilibili/bililive/infra/util/cache/api/CacheActivity$Message;", "", "()V", "hitCount", "", "getHitCount", "()I", "setHitCount", "(I)V", "newQuery", "getNewQuery", "setNewQuery", "newRoom", "getNewRoom", "setNewRoom", "path", "", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "timeout", "getTimeout", "setTimeout", "total", "getTotal", "setTotal", "app_release"}, mv = {1, 1, 16})
    public static final class Message {
        public int hitCount;
        public int newQuery;
        public int newRoom;
        public String path = "";
        public int timeout;
        public int total;

        public final int getHitCount() {
            return this.hitCount;
        }

        public final int getNewQuery() {
            return this.newQuery;
        }

        public final int getNewRoom() {
            return this.newRoom;
        }

        public final String getPath() {
            return this.path;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public final int getTotal() {
            return this.total;
        }

        public final void setHitCount(int i) {
            this.hitCount = i;
        }

        public final void setNewQuery(int i) {
            this.newQuery = i;
        }

        public final void setNewRoom(int i) {
            this.newRoom = i;
        }

        public final void setPath(String str) {
            if (str != null) {
                this.path = str;
            } else {
                i.a("<set-?>");
                throw null;
            }
        }

        public final void setTimeout(int i) {
            this.timeout = i;
        }

        public final void setTotal(int i) {
            this.total = i;
        }
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_cache);
    }
}
