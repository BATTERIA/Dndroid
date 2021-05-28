package com.bilibili.bililive.batteria.login;

import a.g;
import a.w.c.i;
import androidx.annotation.Keep;

@g(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bilibili/bililive/batteria/login/User;", "", "id", "", "userName", "", "password", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getPassword", "()Ljava/lang/String;", "test", "getTest", "getUserName", "print", "", "Test", "app_release"}, mv = {1, 1, 16})
@Keep
public final class User {
    public final int id;
    public final String password;
    public final int test;
    public final String userName;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f2597a = 3;
    }

    public User(int i, String str, String str2) {
        if (str == null) {
            i.a("userName");
            throw null;
        } else if (str2 != null) {
            this.id = i;
            this.userName = str;
            this.password = str2;
            this.test = 1;
        } else {
            i.a("password");
            throw null;
        }
    }

    public final int getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }

    public final int getTest() {
        return this.test;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void print() {
        System.out.print(this.test + 3);
    }
}
