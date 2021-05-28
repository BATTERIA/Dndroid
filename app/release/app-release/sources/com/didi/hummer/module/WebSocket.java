package com.didi.hummer.module;

import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import e.c.a.b.l;
import e.e.a.n.f.b;
import f.m0;
import f.o0.n.c;
import g.h;

@Component
public class WebSocket {
    public static e.e.a.q.b.a onCloseCallback;
    public static e.e.a.q.b.a onErrorCallback;
    public static e.e.a.q.b.a onMessageCallback;
    public static e.e.a.q.b.a onOpenCallback;

    public static class a implements b {
        @Override // e.e.a.n.f.b
        public void a() {
            if (WebSocket.onOpenCallback != null) {
                WebSocket.onOpenCallback.a(new Object[0]);
            }
        }

        @Override // e.e.a.n.f.b
        public void a(int i, String str) {
            if (WebSocket.onCloseCallback != null) {
                WebSocket.onCloseCallback.a(Integer.valueOf(i), str);
            }
        }

        @Override // e.e.a.n.f.b
        public void a(String str) {
            if (WebSocket.onMessageCallback != null) {
                WebSocket.onMessageCallback.a(str);
            }
        }

        @Override // e.e.a.n.f.b
        public void b(String str) {
            if (WebSocket.onErrorCallback != null) {
                WebSocket.onErrorCallback.a(str);
            }
        }
    }

    @JsMethod
    public static void close(e.e.a.p.b bVar, int i, String str) {
        ((e.e.a.n.f.d.a) l.f.g(bVar.f4442c)).a(i, str);
    }

    @JsMethod
    public static void connect(e.e.a.p.b bVar, String str) {
        ((e.e.a.n.f.d.a) l.f.g(bVar.f4442c)).a(str, new a());
    }

    @JsMethod
    public static void onClose(e.e.a.q.b.a aVar) {
        onCloseCallback = aVar;
    }

    @JsMethod
    public static void onError(e.e.a.q.b.a aVar) {
        onErrorCallback = aVar;
    }

    @JsMethod
    public static void onMessage(e.e.a.q.b.a aVar) {
        onMessageCallback = aVar;
    }

    @JsMethod
    public static void onOpen(e.e.a.q.b.a aVar) {
        onOpenCallback = aVar;
    }

    @JsMethod
    public static void send(e.e.a.p.b bVar, String str) {
        m0 m0Var = ((e.e.a.n.f.d.a) l.f.g(bVar.f4442c)).f4367c;
        if (m0Var != null) {
            c cVar = (c) m0Var;
            if (str != null) {
                cVar.a(h.c(str), 1);
                return;
            }
            throw new NullPointerException("text == null");
        }
    }
}
