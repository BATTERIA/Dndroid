package e.e.a.p.d;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.WindowManager;
import com.didi.hummer.core.engine.jsc.jni.HummerBridge;
import com.didi.hummer.core.engine.jsc.jni.HummerException;
import com.didi.hummer.core.engine.jsc.jni.HummerRecycler;
import com.didi.hummer.core.engine.jsc.jni.JavaScriptRuntime;
import com.didi.hummer.render.style.HummerLayout;
import e.c.a.b.l;
import e.e.a.k;
import e.e.a.p.b;
import e.e.a.p.c;
import e.e.a.v.e;
import e.e.a.v.g;
import e.e.a.v.m;
import e.e.a.v.p;
import e.e.a.v.q;
import e.e.a.v.r;
import e.e.a.v.s;
import e.e.a.v.t.d;
import java.util.LinkedHashMap;
import java.util.Map;

public class a extends b implements HummerBridge.InvokeCallback, HummerRecycler.RecycleCallback {
    public HummerBridge p;
    public HummerRecycler q = new HummerRecycler(((e.e.a.q.b.e.b) this.f4446g).f4488a, this);

    public a(HummerLayout hummerLayout, String str) {
        super(hummerLayout, str);
        int i;
        String str2;
        e.e.a.q.b.e.b bVar = new e.e.a.q.b.e.b(JavaScriptRuntime.createJSContext());
        this.f4446g = bVar;
        this.p = new HummerBridge(bVar.f4488a, this);
        l.f.a("HummerNative", "HummerContext.onCreate");
        long currentTimeMillis = System.currentTimeMillis();
        HummerException.addJSContextExceptionCallback(this.f4446g, new e.e.a.p.a(this));
        a(new c());
        a(new d());
        k.b();
        ((e.e.a.q.b.e.b) this.f4446g).a(l.f.j("HummerDefinition.js"), "HummerDefinition.js");
        e.e.a.q.b.b bVar2 = this.f4446g;
        StringBuilder a2 = e.a.a.a.a.a("__IS_DEBUG__ = ");
        a2.append(e.e.a.q.d.b.f4498a);
        ((e.e.a.q.b.e.b) bVar2).c(a2.toString());
        String str3 = "";
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        WindowManager windowManager = (WindowManager) getSystemService("window");
        int i2 = -1;
        if (windowManager == null) {
            i = -1;
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            i = point.x;
        }
        WindowManager windowManager2 = (WindowManager) getSystemService("window");
        if (windowManager2 != null) {
            Point point2 = new Point();
            windowManager2.getDefaultDisplay().getSize(point2);
            i2 = point2.y;
        }
        int i3 = i2 - dimensionPixelSize;
        int b = l.f.b(this, (float) dimensionPixelSize);
        float f2 = (float) i;
        int b2 = l.f.b(this, f2);
        int b3 = l.f.b(this, (float) i2);
        int b4 = l.f.b(this, f2);
        int b5 = l.f.b(this, (float) i3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("platform", "Android");
        linkedHashMap.put("osVersion", Build.VERSION.RELEASE);
        try {
            PackageManager packageManager = getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);
            str2 = packageInfo == null ? null : packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            str2 = str3;
        }
        linkedHashMap.put("appName", str2);
        try {
            PackageInfo packageInfo2 = getPackageManager().getPackageInfo(getPackageName(), 0);
            str3 = packageInfo2 == null ? null : packageInfo2.versionName;
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
        }
        linkedHashMap.put("appVersion", str3);
        linkedHashMap.put("statusBarHeight", Integer.valueOf(b));
        linkedHashMap.put("safeAreaBottom", 0);
        linkedHashMap.put("deviceWidth", Integer.valueOf(b2));
        linkedHashMap.put("deviceHeight", Integer.valueOf(b3));
        linkedHashMap.put("availableWidth", Integer.valueOf(b4));
        linkedHashMap.put("availableHeight", Integer.valueOf(b5));
        linkedHashMap.put("scale", Float.valueOf(getResources().getDisplayMetrics().density));
        ((e.e.a.q.b.e.b) this.f4446g).c(String.format("Hummer.env = %s", e.e.a.q.d.d.a(linkedHashMap)));
        a(new q());
        a(new e());
        a(new m());
        a(new r());
        a(new s());
        a(new g());
        a(new p());
        a(new e.e.a.y.a.a.c());
        a(new e.e.a.y.a.a.g());
        a("var Storage = class Storage extends Base {\n    constructor(...args) {\n        super('Storage', ...args);\n    }\n    static set(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Storage', 0, 'set', ...args);\n    }\n    static get(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        return invoke('Storage', 0, 'get', ...args);\n    }\n    static remove(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Storage', 0, 'remove', ...args);\n    }\n    static exist(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        return invoke('Storage', 0, 'exist', ...args);\n    }\n}\n__GLOBAL__.Storage = Storage;\nvar Location = class Location extends Base {\n    constructor(...args) {\n        super('Location', ...args);\n    }\n    getLastLocation(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Location', this.objID, 'getLastLocation', ...args);\n    }\n    startLocation(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Location', this.objID, 'startLocation', ...args);\n    }\n    stopLocation(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Location', this.objID, 'stopLocation', ...args);\n    }\n    onError(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Location', this.objID, 'onError', ...args);\n    }\n}\n__GLOBAL__.Location = Location;\nvar Navigator = class Navigator extends Base {\n    constructor(...args) {\n        super('Navigator', ...args);\n    }\n    static openPage(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Navigator', 0, 'openPage', ...args);\n    }\n    static popPage(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Navigator', 0, 'popPage', ...args);\n    }\n    static popToPage(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Navigator', 0, 'popToPage', ...args);\n    }\n    static popToRootPage(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Navigator', 0, 'popToRootPage', ...args);\n    }\n    static popBack(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Navigator', 0, 'popBack', ...args);\n    }\n}\n__GLOBAL__.Navigator = Navigator;\nvar Timer = class Timer extends Base {\n    constructor(...args) {\n        super('Timer', ...args);\n    }\n    setInterval(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Timer', this.objID, 'setInterval', ...args);\n    }\n    clearInterval(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Timer', this.objID, 'clearInterval', ...args);\n    }\n    setTimeout(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Timer', this.objID, 'setTimeout', ...args);\n    }\n    clearTimeout(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Timer', this.objID, 'clearTimeout', ...args);\n    }\n}\n__GLOBAL__.Timer = Timer;\nvar WebSocket = class WebSocket extends Base {\n    constructor(...args) {\n        super('WebSocket', ...args);\n    }\n    static connect(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('WebSocket', 0, 'connect', ...args);\n    }\n    static close(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('WebSocket', 0, 'close', ...args);\n    }\n    static send(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('WebSocket', 0, 'send', ...args);\n    }\n    static onOpen(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('WebSocket', 0, 'onOpen', ...args);\n    }\n    static onClose(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('WebSocket', 0, 'onClose', ...args);\n    }\n    static onError(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('WebSocket', 0, 'onError', ...args);\n    }\n    static onMessage(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('WebSocket', 0, 'onMessage', ...args);\n    }\n}\n__GLOBAL__.WebSocket = WebSocket;\nvar Memory = class Memory extends Base {\n    constructor(...args) {\n        super('Memory', ...args);\n    }\n    static set(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Memory', 0, 'set', ...args);\n    }\n    static get(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        return invoke('Memory', 0, 'get', ...args);\n    }\n    static remove(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Memory', 0, 'remove', ...args);\n    }\n    static exist(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        return invoke('Memory', 0, 'exist', ...args);\n    }\n}\n__GLOBAL__.Memory = Memory;\nvar Request = class Request extends Base {\n    constructor(...args) {\n        super('Request', ...args);\n    }\n    set url(arg) {\n        this._url = arg;\n        arg = transSingleArg(arg);\n        invoke('Request', this.objID, 'setUrl', arg);\n    }\n    get url() {\n        return this._url;\n    }\n    set method(arg) {\n        this._method = arg;\n        arg = transSingleArg(arg);\n        invoke('Request', this.objID, 'setMethod', arg);\n    }\n    get method() {\n        return this._method;\n    }\n    set timeout(arg) {\n        this._timeout = arg;\n        arg = transSingleArg(arg);\n        invoke('Request', this.objID, 'setTimeout', arg);\n    }\n    get timeout() {\n        return this._timeout;\n    }\n    set header(arg) {\n        this._header = arg;\n        arg = transSingleArg(arg);\n        invoke('Request', this.objID, 'setHeader', arg);\n    }\n    get header() {\n        return this._header;\n    }\n    set param(arg) {\n        this._param = arg;\n        arg = transSingleArg(arg);\n        invoke('Request', this.objID, 'setParam', arg);\n    }\n    get param() {\n        return this._param;\n    }\n    send(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('Request', this.objID, 'send', ...args);\n    }\n}\n__GLOBAL__.Request = Request;\nvar BasicAnimation = class BasicAnimation extends Base {\n    constructor(...args) {\n        super('BasicAnimation', ...args);\n    }\n    set from(arg) {\n        this._from = arg;\n        arg = transSingleArg(arg);\n        invoke('BasicAnimation', this.objID, 'setFrom', arg);\n    }\n    get from() {\n        return this._from;\n    }\n    set value(arg) {\n        this._value = arg;\n        arg = transSingleArg(arg);\n        invoke('BasicAnimation', this.objID, 'setValue', arg);\n    }\n    get value() {\n        return this._value;\n    }\n    set duration(arg) {\n        this._duration = arg;\n        arg = transSingleArg(arg);\n        invoke('BasicAnimation', this.objID, 'setDuration', arg);\n    }\n    get duration() {\n        return this._duration;\n    }\n    set delay(arg) {\n        this._delay = arg;\n        arg = transSingleArg(arg);\n        invoke('BasicAnimation', this.objID, 'setDelay', arg);\n    }\n    get delay() {\n        return this._delay;\n    }\n    set repeatCount(arg) {\n        this._repeatCount = arg;\n        arg = transSingleArg(arg);\n        invoke('BasicAnimation', this.objID, 'setRepeatCount', arg);\n    }\n    get repeatCount() {\n        return this._repeatCount;\n    }\n    set easing(arg) {\n        this._easing = arg;\n        arg = transSingleArg(arg);\n        invoke('BasicAnimation', this.objID, 'setEasing', arg);\n    }\n    get easing() {\n        return this._easing;\n    }\n    on(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('BasicAnimation', this.objID, 'on', ...args);\n    }\n}\n__GLOBAL__.BasicAnimation = BasicAnimation;\nvar KeyframeAnimation = class KeyframeAnimation extends Base {\n    constructor(...args) {\n        super('KeyframeAnimation', ...args);\n    }\n    set keyframes(arg) {\n        this._keyframes = arg;\n        arg = transSingleArg(arg);\n        invoke('KeyframeAnimation', this.objID, 'setKeyframes', arg);\n    }\n    get keyframes() {\n        return this._keyframes;\n    }\n    set from(arg) {\n        this._from = arg;\n        arg = transSingleArg(arg);\n        invoke('KeyframeAnimation', this.objID, 'setFrom', arg);\n    }\n    get from() {\n        return this._from;\n    }\n    set value(arg) {\n        this._value = arg;\n        arg = transSingleArg(arg);\n        invoke('KeyframeAnimation', this.objID, 'setValue', arg);\n    }\n    get value() {\n        return this._value;\n    }\n    set duration(arg) {\n        this._duration = arg;\n        arg = transSingleArg(arg);\n        invoke('KeyframeAnimation', this.objID, 'setDuration', arg);\n    }\n    get duration() {\n        return this._duration;\n    }\n    set delay(arg) {\n        this._delay = arg;\n        arg = transSingleArg(arg);\n        invoke('KeyframeAnimation', this.objID, 'setDelay', arg);\n    }\n    get delay() {\n        return this._delay;\n    }\n    set repeatCount(arg) {\n        this._repeatCount = arg;\n        arg = transSingleArg(arg);\n        invoke('KeyframeAnimation', this.objID, 'setRepeatCount', arg);\n    }\n    get repeatCount() {\n        return this._repeatCount;\n    }\n    set easing(arg) {\n        this._easing = arg;\n        arg = transSingleArg(arg);\n        invoke('KeyframeAnimation', this.objID, 'setEasing', arg);\n    }\n    get easing() {\n        return this._easing;\n    }\n    on(...args) {\n        let stash = args;\n        args = transArgs(...args);\n        invoke('KeyframeAnimation', this.objID, 'on', ...args);\n    }\n}\n__GLOBAL__.KeyframeAnimation = KeyframeAnimation;\n", "hummer_sdk.js");
        e.e.a.a0.d.a(this.f4442c, "HummerContext.onCreate", (Map<String, Object>) null, currentTimeMillis);
    }

    @Override // e.e.a.p.b
    public void a() {
        HummerBridge hummerBridge = this.p;
        if (hummerBridge != null) {
            hummerBridge.onDestroy();
        }
        HummerRecycler hummerRecycler = this.q;
        if (hummerRecycler != null) {
            hummerRecycler.onDestroy();
        }
        l.f.a("HummerNative", "HummerContext.releaseJSContext");
        JavaScriptRuntime.destroyJSContext(((e.e.a.q.b.e.b) this.f4446g).f4488a);
    }

    @Override // com.didi.hummer.core.engine.jsc.jni.HummerBridge.InvokeCallback
    public Object onInvoke(String str, long j, String str2, Object... objArr) {
        e.e.a.y.a.b.m mVar = this.l.get(str);
        if (mVar != null) {
            return mVar.a(this, j, str2, objArr);
        }
        String format = String.format("Invoker error: can't find this class [%s]", str);
        if (!e.e.a.q.d.b.f4498a) {
            return null;
        }
        Log.w("HummerNative", format);
        return null;
    }

    @Override // com.didi.hummer.core.engine.jsc.jni.HummerRecycler.RecycleCallback
    public void onRecycle(long j) {
        String str = "** onRecycle, objId = " + j;
        if (e.e.a.q.d.b.f4498a) {
            Log.v("HummerNative", str);
        }
        Object remove = this.f4445f.f4553a.remove(Long.valueOf(j));
        if (remove instanceof e.e.a.u.b) {
            ((e.e.a.u.b) remove).onDestroy();
        }
    }
}
