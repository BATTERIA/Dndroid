package e.e.a.y.a.b;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import com.didi.hummer.render.component.anim.AnimViewWrapper;
import com.didi.hummer.render.component.anim.BasicAnimation;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaPositionType;
import d.g.l.p;
import e.c.a.b.l;
import e.e.a.y.a.a.h;
import e.e.a.y.a.b.f;
import e.e.a.y.c.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class j<T extends View> implements e.e.a.u.b {
    public static final String VISIBILITY_HIDDEN = "hidden";
    public static final String VISIBILITY_VISIBLE = "visible";
    @JsProperty
    public String accessibilityHint;
    @JsProperty
    public String accessibilityLabel;
    @JsProperty
    public String accessibilityRole;
    @JsProperty
    public Map<String, Object> accessibilityState;
    @JsProperty
    public boolean accessible;
    public Map<String, BasicAnimation> animMap = new HashMap();
    public AnimViewWrapper animViewWrapper;
    public g backgroundHelper;
    public e.e.a.p.b context;
    public a.EnumC0138a display = a.EnumC0138a.YOGA;
    public e displayChangedListener;
    public List<Double> durationList = new ArrayList();
    @JsProperty
    public boolean enabled;
    public e.e.a.y.c.b hummerNode;
    public l inlineBox;
    public e.e.a.y.b.a mEventManager;
    public GestureDetector mGestureDetector;
    public e.e.a.q.b.c mJSValue;
    public MotionEvent mLatestMotionEvent;
    public ScaleGestureDetector mScaleGestureDetector;
    public T mTargetView;
    public List<ObjectAnimator> objectAnimatorList = new ArrayList();
    public a.b position = a.b.YOGA;
    public f positionChangedListener;
    @JsProperty
    public Map<String, Object> style = new HashMap();
    public double transitionDelay = 0.0d;
    public String transitionTimingFunction = null;
    public List<h> transitions = new ArrayList();

    public class a extends d.g.l.a {
        public a() {
        }

        @Override // d.g.l.a
        public void a(View view, d.g.l.z.b bVar) {
            this.f3331a.onInitializeAccessibilityNodeInfo(view, bVar.f3365a);
            ArrayList arrayList = new ArrayList();
            String str = j.this.accessibilityLabel;
            if (str != null) {
                arrayList.add(str);
            }
            j jVar = j.this;
            if (jVar.accessibilityHint != null) {
                if (jVar.accessibilityLabel == null && bVar.b() != null) {
                    arrayList.add(bVar.b().toString());
                }
                arrayList.add(j.this.accessibilityHint);
            }
            if (!arrayList.isEmpty()) {
                bVar.f3365a.setContentDescription(TextUtils.join(", ", arrayList));
            }
            String str2 = j.this.accessibilityRole;
            if (str2 != null) {
                bVar.f3365a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str2);
            }
            Map<String, Object> map = j.this.accessibilityState;
            if (map != null) {
                for (String str3 : map.keySet()) {
                    Object obj = j.this.accessibilityState.get(str3);
                    if ("selected".equalsIgnoreCase(str3)) {
                        if (obj instanceof Boolean) {
                            bVar.f3365a.setSelected(((Boolean) obj).booleanValue());
                        }
                    } else if ("disabled".equalsIgnoreCase(str3) && (obj instanceof Boolean)) {
                        bVar.f3365a.setEnabled(!((Boolean) obj).booleanValue());
                    }
                }
            }
        }
    }

    public class b implements GestureDetector.OnGestureListener {

        /* renamed from: c  reason: collision with root package name */
        public float f4587c;

        /* renamed from: d  reason: collision with root package name */
        public float f4588d;

        public b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            e.e.a.a0.d.b(j.this.context.f4442c, l.f.a("pan", j.this));
            this.f4588d = motionEvent.getRawX();
            this.f4587c = motionEvent.getRawY();
            if (!j.this.mEventManager.f4594a.containsKey("pan")) {
                return true;
            }
            e.e.a.y.b.c.b bVar = new e.e.a.y.b.c.b();
            System.currentTimeMillis();
            j.this.mEventManager.a("pan", bVar);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!j.this.mEventManager.f4594a.containsKey("swipe")) {
                return false;
            }
            e.e.a.y.b.c.d dVar = new e.e.a.y.b.c.d();
            System.currentTimeMillis();
            float x = motionEvent.getX();
            float x2 = motionEvent2.getX();
            float y = motionEvent.getY();
            float y2 = motionEvent2.getY();
            if ((x - x2 <= 120.0f || Math.abs(f2) <= 0.0f) && ((x2 - x <= 120.0f || Math.abs(f2) <= 0.0f) && ((y - y2 <= 120.0f || Math.abs(f3) <= 0.0f) && y2 - y > 120.0f))) {
                int i = (Math.abs(f3) > 0.0f ? 1 : (Math.abs(f3) == 0.0f ? 0 : -1));
            }
            motionEvent.getAction();
            if (!(motionEvent2.getAction() == 2 || motionEvent2.getAction() == 1)) {
                motionEvent2.getAction();
            }
            j.this.mEventManager.a("swipe", dVar);
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            e.e.a.a0.d.b(j.this.context.f4442c, l.f.a("longPress", j.this));
            if (j.this.mEventManager.f4594a.containsKey("longPress")) {
                e.e.a.y.b.c.a aVar = new e.e.a.y.b.c.a();
                l.f.a(j.this.getContext(), motionEvent);
                System.currentTimeMillis();
                l.f.a(motionEvent);
                j jVar = j.this;
                e.e.a.q.b.c cVar = jVar.mJSValue;
                jVar.mEventManager.a("longPress", aVar);
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!j.this.mEventManager.f4594a.containsKey("pan") || motionEvent2.getAction() != 2) {
                return true;
            }
            e.e.a.y.b.c.b bVar = new e.e.a.y.b.c.b();
            System.currentTimeMillis();
            e.e.a.p.b bVar2 = j.this.context;
            float rawX = (float) ((int) motionEvent2.getRawX());
            float rawY = (float) ((int) motionEvent2.getRawY());
            HashMap hashMap = new HashMap();
            hashMap.put("deltaX", Float.valueOf((rawX - this.f4588d) / bVar2.getResources().getDisplayMetrics().density));
            hashMap.put("deltaY", Float.valueOf((rawY - this.f4587c) / bVar2.getResources().getDisplayMetrics().density));
            j.this.mEventManager.a("pan", bVar);
            this.f4588d = rawX;
            this.f4587c = rawY;
            return true;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            e.e.a.a0.d.b(j.this.context.f4442c, l.f.a("tap", j.this));
            if (!j.this.mEventManager.f4594a.containsKey("tap")) {
                return false;
            }
            e.e.a.y.b.c.e eVar = new e.e.a.y.b.c.e();
            l.f.a(j.this.getContext(), motionEvent);
            System.currentTimeMillis();
            l.f.a(motionEvent);
            j jVar = j.this;
            e.e.a.q.b.c cVar = jVar.mJSValue;
            jVar.mEventManager.a("tap", eVar);
            return false;
        }
    }

    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!j.this.mEventManager.f4594a.containsKey("pinch")) {
                return true;
            }
            Math.max(0.1f, Math.min(scaleGestureDetector.getScaleFactor(), 5.0f));
            e.e.a.y.b.c.c cVar = new e.e.a.y.b.c.c();
            System.currentTimeMillis();
            l.f.a(j.this.mLatestMotionEvent);
            j.this.mEventManager.a("pinch", cVar);
            return true;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            for (ObjectAnimator objectAnimator : j.this.objectAnimatorList) {
                objectAnimator.start();
            }
            j.this.objectAnimatorList.clear();
        }
    }

    public interface e {
        void dispatchChildDisplayChanged(j jVar, a.EnumC0138a aVar, a.EnumC0138a aVar2);
    }

    public interface f {
        void dispatchChildPositionChanged(j jVar, a.b bVar, a.b bVar2);
    }

    public j(e.e.a.p.b bVar, e.e.a.q.b.c cVar, String str) {
        this.context = bVar;
        this.mJSValue = cVar;
        this.mTargetView = createView(bVar.getBaseContext());
        this.hummerNode = new e.e.a.y.c.b(this, str);
        this.backgroundHelper = new g(bVar, this.mTargetView);
        this.animViewWrapper = new AnimViewWrapper(this);
        p.a(this.mTargetView, new a());
    }

    private final T createView(Context context2) {
        T createViewInstance = createViewInstance(context2);
        if (createViewInstance != null) {
            return createViewInstance;
        }
        throw new RuntimeException("createViewInstance must return a view");
    }

    /* access modifiers changed from: private */
    public void initViewGestureEvent() {
        if (!(this.mTargetView instanceof Button)) {
            this.mGestureDetector = new GestureDetector(this.context, new b());
            this.mScaleGestureDetector = new ScaleGestureDetector(this.context, new c());
            this.mTargetView.setOnTouchListener(new b(this));
        }
    }

    private boolean setDisplay(String str) {
        e eVar;
        a.EnumC0138a aVar = a.EnumC0138a.YOGA;
        if (a.EnumC0138a.BLOCK.f4604c.equals(str)) {
            aVar = a.EnumC0138a.BLOCK;
        }
        if (a.EnumC0138a.INLINE.f4604c.equals(str)) {
            aVar = a.EnumC0138a.INLINE;
        }
        if (a.EnumC0138a.INLINE_BLOCK.f4604c.equals(str)) {
            aVar = a.EnumC0138a.INLINE_BLOCK;
        }
        a.EnumC0138a aVar2 = this.display;
        if (!(aVar == aVar2 || (eVar = this.displayChangedListener) == null)) {
            eVar.dispatchChildDisplayChanged(this, aVar2, aVar);
        }
        this.display = aVar;
        return aVar != a.EnumC0138a.YOGA;
    }

    private boolean setPosition(String str) {
        f fVar;
        a.b bVar = a.b.YOGA;
        if (a.b.FIXED.f4608c.equals(str)) {
            bVar = a.b.FIXED;
        }
        a.b bVar2 = this.position;
        if (!(bVar == bVar2 || (fVar = this.positionChangedListener) == null)) {
            fVar.dispatchChildPositionChanged(this, bVar2, bVar);
        }
        this.position = bVar;
        return bVar != a.b.YOGA;
    }

    public /* synthetic */ void a(View view) {
        e.e.a.a0.d.b(this.context.f4442c, l.f.a("tap", this));
        if (this.mEventManager.f4594a.containsKey("tap")) {
            e.e.a.y.b.c.e eVar = new e.e.a.y.b.c.e();
            l.f.a(getContext(), (MotionEvent) null);
            System.currentTimeMillis();
            l.f.a((MotionEvent) null);
            this.mEventManager.a("tap", eVar);
        }
    }

    public /* synthetic */ void a(e.e.a.q.b.a aVar) {
        Rect rect = new Rect();
        getView().getHitRect(rect);
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(l.f.c(this.context, (float) getView().getWidth())));
        hashMap.put("height", Float.valueOf(l.f.c(this.context, (float) getView().getHeight())));
        hashMap.put("left", Float.valueOf(l.f.c(this.context, (float) rect.left)));
        hashMap.put("right", Float.valueOf(l.f.c(this.context, (float) rect.right)));
        hashMap.put("top", Float.valueOf(l.f.c(this.context, (float) rect.top)));
        hashMap.put("bottom", Float.valueOf(l.f.c(this.context, (float) rect.bottom)));
        aVar.a(hashMap);
    }

    @JsMethod
    public void addAnimation(BasicAnimation basicAnimation, String str) {
        this.animMap.put(str, basicAnimation);
        basicAnimation.start(this);
    }

    @JsMethod
    public void addEventListener(String str, e.e.a.q.b.a aVar) {
        e.e.a.y.b.a aVar2 = this.mEventManager;
        if (aVar2.f4594a.containsKey(str)) {
            List<e.e.a.q.b.a> list = aVar2.f4594a.get(str);
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            aVar2.f4594a.put(str, arrayList);
        }
        if (this.mTargetView instanceof Button) {
            getView().setOnClickListener(new a(this));
        }
    }

    public abstract T createViewInstance(Context context2);

    public AnimViewWrapper getAnimViewWrapper() {
        return this.animViewWrapper;
    }

    public g getBackgroundHelper() {
        return this.backgroundHelper;
    }

    public Context getContext() {
        return this.context;
    }

    public a.EnumC0138a getDisplay() {
        return this.display;
    }

    public boolean getEnabled() {
        return getView().isEnabled();
    }

    public l getInlineBox() {
        return this.inlineBox;
    }

    public e.e.a.q.b.c getJSValue() {
        return this.mJSValue;
    }

    public e.e.a.y.c.b getNode() {
        return this.hummerNode;
    }

    public a.b getPosition() {
        return this.position;
    }

    @JsMethod
    public void getRect(e.e.a.q.b.a aVar) {
        if (aVar != null) {
            getView().post(new c(this, aVar));
        }
    }

    public h getTransition(String str) {
        Iterator<h> it = this.transitions.iterator();
        h hVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h next = it.next();
            if (str.equals(next.f4554a)) {
                hVar = next;
            } else if ("all".equals(next.f4554a)) {
                hVar = next;
                break;
            }
        }
        return (!"transform".equals(str) || hVar != null) ? hVar : new h(str);
    }

    public T getView() {
        return this.mTargetView;
    }

    public String getViewID() {
        return this.hummerNode.b;
    }

    public YogaNode getYogaNode() {
        return this.hummerNode.f4610c;
    }

    public void handleTransitionStyle(String str, Object obj) {
        ArrayList arrayList = new ArrayList();
        if ("transform".equals(str)) {
            String[] split = obj.toString().trim().replace("),", ");").split(";");
            for (String str2 : split) {
                int indexOf = str2.indexOf("(");
                arrayList.addAll(l.f.a(str2.substring(0, indexOf), e.e.a.y.c.c.g(str2.substring(indexOf + 1, str2.indexOf(")"))), (Object) null));
            }
        } else {
            arrayList.addAll(l.f.a(str, obj, (Object) null));
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(new AnimViewWrapper(this), (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()]));
        h transition = getTransition(str);
        if (transition != null) {
            ofPropertyValuesHolder.setRepeatCount(0);
            ofPropertyValuesHolder.setDuration(l.f.b(transition.b));
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(transition.f4555c));
            ofPropertyValuesHolder.setInterpolator(l.f.c(transition.f4556d));
            if (this.objectAnimatorList == null) {
                this.objectAnimatorList = new ArrayList();
            }
            this.objectAnimatorList.add(ofPropertyValuesHolder);
            return;
        }
        throw null;
    }

    @Override // e.e.a.u.b
    public void onCreate() {
        e.e.a.y.b.a aVar = new e.e.a.y.b.a();
        this.mEventManager = aVar;
        if (aVar != null) {
            aVar.f4594a = new HashMap<>();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                initViewGestureEvent();
            } else {
                getView().post(new d(this));
            }
        } else {
            throw null;
        }
    }

    @Override // e.e.a.u.b
    public void onDestroy() {
        e.e.a.y.b.a aVar = this.mEventManager;
        if (aVar != null) {
            aVar.onDestroy();
        }
        Map<String, BasicAnimation> map = this.animMap;
        if (map != null) {
            map.clear();
            this.animMap = null;
        }
    }

    public void onStyleUpdated(Map<String, Object> map) {
    }

    @JsMethod
    public void removeAllAnimation() {
        Iterator<Map.Entry<String, BasicAnimation>> it = this.animMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().stop();
            it.remove();
        }
    }

    @JsMethod
    public void removeAnimationForKey(String str) {
        if (this.animMap.containsKey(str)) {
            this.animMap.get(str).stop();
            this.animMap.remove(str);
        }
    }

    @JsMethod
    public void removeEventListener(String str, e.e.a.q.b.a aVar) {
        if (aVar == null) {
            e.e.a.y.b.a aVar2 = this.mEventManager;
            if (aVar2.f4594a.containsKey(str)) {
                List<e.e.a.q.b.a> list = aVar2.f4594a.get(str);
                for (e.e.a.q.b.a aVar3 : list) {
                    if (aVar3 != null) {
                        aVar3.d();
                    }
                }
                list.clear();
                return;
            }
            return;
        }
        e.e.a.y.b.a aVar4 = this.mEventManager;
        if (aVar4.f4594a.containsKey(str)) {
            List<e.e.a.q.b.a> list2 = aVar4.f4594a.get(str);
            e.e.a.q.b.a aVar5 = null;
            Iterator<e.e.a.q.b.a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.e.a.q.b.a next = it.next();
                if (next != null && next.equals(aVar)) {
                    aVar5 = next;
                    break;
                }
            }
            if (aVar5 != null) {
                aVar5.d();
                list2.remove(aVar5);
            }
        }
    }

    @JsMethod
    @Deprecated
    public void resetStyle() {
        e.e.a.y.c.c.a(this.hummerNode.f4609a);
        setBackgroundColor(0);
        setBackgroundImage(null);
        setBorderWidth(0.0f);
        setBorderColor(0);
        setBorderRadius(0);
        setBorderStyle(null);
        setShadow(null);
        setOpacity(1.0f);
        setVisibility("visible");
    }

    public void runAnimator() {
        if (this.objectAnimatorList != null) {
            getView().post(new d());
        }
    }

    public void setAccessibilityHint(String str) {
        this.accessibilityHint = str;
    }

    public void setAccessibilityLabel(String str) {
        this.accessibilityLabel = str;
    }

    public void setAccessibilityRole(String str) {
        int i;
        Resources resources = getContext().getResources();
        if ("none".equalsIgnoreCase(str)) {
            str = "";
        } else {
            if ("text".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_text;
            } else if ("button".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_button;
            } else if ("image".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_image;
            } else if ("switch".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_switch;
            } else if ("input".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_input;
            } else if ("link".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_link;
            } else if ("search".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_search;
            } else if ("key".equalsIgnoreCase(str)) {
                i = e.e.a.z.a.accessibility_role_key;
            }
            str = resources.getString(i);
        }
        this.accessibilityRole = str;
    }

    public void setAccessibilityState(Map<String, Object> map) {
        this.accessibilityState = map;
    }

    public void setAccessible(boolean z) {
        getView().setImportantForAccessibility(z ? 1 : 2);
    }

    @JsAttribute
    public void setBackgroundColor(Object obj) {
        this.backgroundHelper.a().a(obj);
    }

    @JsAttribute
    public void setBackgroundImage(String str) {
        g gVar = this.backgroundHelper;
        e.e.a.p.b bVar = (e.e.a.p.b) gVar.f4583a;
        f a2 = gVar.a();
        if (a2 != null) {
            a2.getClass();
            l.f.a(bVar, str, new e.c.a.b.a(a2));
        }
    }

    @JsAttribute
    public void setBorderBottomColor(int i) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.f4571c.bottom = i;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderBottomLeftRadius(Object obj) {
        if (e.e.a.y.c.c.d(obj)) {
            g gVar = this.backgroundHelper;
            float e2 = e.e.a.y.c.c.e(obj);
            f a2 = gVar.a();
            a2.f4565d.f4572d.l = e2;
            a2.invalidateSelf();
        } else if (obj instanceof Float) {
            g gVar2 = this.backgroundHelper;
            float floatValue = ((Float) obj).floatValue();
            f a3 = gVar2.a();
            f.b bVar = a3.f4565d.f4572d;
            bVar.f4578g = floatValue;
            bVar.f4579h = floatValue;
            a3.invalidateSelf();
        }
    }

    @JsAttribute
    public void setBorderBottomRightRadius(Object obj) {
        if (e.e.a.y.c.c.d(obj)) {
            g gVar = this.backgroundHelper;
            float e2 = e.e.a.y.c.c.e(obj);
            f a2 = gVar.a();
            a2.f4565d.f4572d.k = e2;
            a2.invalidateSelf();
        } else if (obj instanceof Float) {
            g gVar2 = this.backgroundHelper;
            float floatValue = ((Float) obj).floatValue();
            f a3 = gVar2.a();
            f.b bVar = a3.f4565d.f4572d;
            bVar.f4576e = floatValue;
            bVar.f4577f = floatValue;
            a3.invalidateSelf();
        }
    }

    @JsAttribute
    public void setBorderBottomStyle(String str) {
        f a2 = this.backgroundHelper.a();
        if (a2 != null) {
            a2.f4565d.f4570a.bottom = f.a.a(str);
            a2.invalidateSelf();
            return;
        }
        throw null;
    }

    @JsAttribute
    public void setBorderBottomWidth(float f2) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.b.bottom = f2;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderColor(int i) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.f4571c.set(i, i, i, i);
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderLeftColor(int i) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.f4571c.left = i;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderLeftStyle(String str) {
        f a2 = this.backgroundHelper.a();
        if (a2 != null) {
            a2.f4565d.f4570a.left = f.a.a(str);
            a2.invalidateSelf();
            return;
        }
        throw null;
    }

    @JsAttribute
    public void setBorderLeftWidth(float f2) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.b.left = f2;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderRadius(Object obj) {
        if (e.e.a.y.c.c.d(obj)) {
            g gVar = this.backgroundHelper;
            float e2 = e.e.a.y.c.c.e(obj);
            f a2 = gVar.a();
            f.b bVar = a2.f4565d.f4572d;
            bVar.i = e2;
            bVar.j = e2;
            bVar.k = e2;
            bVar.l = e2;
            a2.invalidateSelf();
        } else if (obj instanceof Float) {
            g gVar2 = this.backgroundHelper;
            gVar2.a().a(((Float) obj).floatValue());
        }
    }

    @JsAttribute
    public void setBorderRightColor(int i) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.f4571c.right = i;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderRightStyle(String str) {
        f a2 = this.backgroundHelper.a();
        if (a2 != null) {
            a2.f4565d.f4570a.right = f.a.a(str);
            a2.invalidateSelf();
            return;
        }
        throw null;
    }

    @JsAttribute
    public void setBorderRightWidth(float f2) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.b.right = f2;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderStyle(String str) {
        f a2 = this.backgroundHelper.a();
        if (a2 != null) {
            int a3 = f.a.a(str);
            a2.f4565d.f4570a.set(a3, a3, a3, a3);
            a2.invalidateSelf();
            return;
        }
        throw null;
    }

    @JsAttribute
    public void setBorderTopColor(int i) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.f4571c.top = i;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderTopLeftRadius(Object obj) {
        if (e.e.a.y.c.c.d(obj)) {
            g gVar = this.backgroundHelper;
            float e2 = e.e.a.y.c.c.e(obj);
            f a2 = gVar.a();
            a2.f4565d.f4572d.i = e2;
            a2.invalidateSelf();
        } else if (obj instanceof Float) {
            g gVar2 = this.backgroundHelper;
            float floatValue = ((Float) obj).floatValue();
            f a3 = gVar2.a();
            f.b bVar = a3.f4565d.f4572d;
            bVar.f4573a = floatValue;
            bVar.b = floatValue;
            a3.invalidateSelf();
        }
    }

    @JsAttribute
    public void setBorderTopRightRadius(Object obj) {
        if (e.e.a.y.c.c.d(obj)) {
            g gVar = this.backgroundHelper;
            float e2 = e.e.a.y.c.c.e(obj);
            f a2 = gVar.a();
            a2.f4565d.f4572d.j = e2;
            a2.invalidateSelf();
        } else if (obj instanceof Float) {
            g gVar2 = this.backgroundHelper;
            float floatValue = ((Float) obj).floatValue();
            f a3 = gVar2.a();
            f.b bVar = a3.f4565d.f4572d;
            bVar.f4574c = floatValue;
            bVar.f4575d = floatValue;
            a3.invalidateSelf();
        }
    }

    @JsAttribute
    public void setBorderTopStyle(String str) {
        f a2 = this.backgroundHelper.a();
        if (a2 != null) {
            a2.f4565d.f4570a.top = f.a.a(str);
            a2.invalidateSelf();
            return;
        }
        throw null;
    }

    @JsAttribute
    public void setBorderTopWidth(float f2) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.b.top = f2;
        a2.invalidateSelf();
    }

    @JsAttribute
    public void setBorderWidth(float f2) {
        f a2 = this.backgroundHelper.a();
        a2.f4565d.b.set(f2, f2, f2, f2);
        a2.invalidateSelf();
    }

    public void setDisplayChangedListener(e eVar) {
        this.displayChangedListener = eVar;
    }

    public void setEnabled(boolean z) {
        getView().setEnabled(z);
    }

    public final boolean setHummerStyle(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return false;
        }
        if (setStyle(str, obj)) {
            return true;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    c2 = 15;
                    break;
                }
                break;
            case -1974639039:
                if (str.equals("borderRightStyle")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1971292586:
                if (str.equals("borderRightWidth")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    c2 = 14;
                    break;
                }
                break;
            case -1455888984:
                if (str.equals("borderTopStyle")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1452542531:
                if (str.equals("borderTopWidth")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    c2 = 16;
                    break;
                }
                break;
            case -1293920646:
                if (str.equals("borderBottomStyle")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1290574193:
                if (str.equals("borderBottomWidth")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c2 = 23;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c2 = 18;
                    break;
                }
                break;
            case -903579360:
                if (str.equals("shadow")) {
                    c2 = 22;
                    break;
                }
                break;
            case -731417480:
                if (str.equals("zIndex")) {
                    c2 = 25;
                    break;
                }
                break;
            case -242276144:
                if (str.equals("borderLeftColor")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -227338466:
                if (str.equals("borderLeftStyle")) {
                    c2 = 3;
                    break;
                }
                break;
            case -223992013:
                if (str.equals("borderLeftWidth")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 34070531:
                if (str.equals("positionType")) {
                    c2 = 27;
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c2 = 19;
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c2 = 21;
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c2 = 20;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c2 = 2;
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c2 = 7;
                    break;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    c2 = 26;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c2 = 17;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    c2 = 28;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c2 = 24;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                setBackgroundColor(obj);
                break;
            case 1:
                setBackgroundImage(String.valueOf(obj));
                break;
            case 2:
                setBorderStyle(String.valueOf(obj));
                break;
            case 3:
                setBorderLeftStyle(String.valueOf(obj));
                break;
            case 4:
                setBorderTopStyle(String.valueOf(obj));
                break;
            case 5:
                setBorderRightStyle(String.valueOf(obj));
                break;
            case 6:
                setBorderBottomStyle(String.valueOf(obj));
                break;
            case 7:
                setBorderWidth(((Float) obj).floatValue());
                break;
            case '\b':
                setBorderLeftWidth(((Float) obj).floatValue());
                break;
            case '\t':
                setBorderTopWidth(((Float) obj).floatValue());
                break;
            case '\n':
                setBorderRightWidth(((Float) obj).floatValue());
                break;
            case 11:
                setBorderBottomWidth(((Float) obj).floatValue());
                break;
            case '\f':
                setBorderColor(((Integer) obj).intValue());
                break;
            case '\r':
                setBorderLeftColor(((Integer) obj).intValue());
                break;
            case 14:
                setBorderTopColor(((Integer) obj).intValue());
                break;
            case 15:
                setBorderRightColor(((Integer) obj).intValue());
                break;
            case 16:
                setBorderBottomColor(((Integer) obj).intValue());
                break;
            case 17:
                setBorderRadius(obj);
                break;
            case 18:
                setBorderTopLeftRadius(obj);
                break;
            case 19:
                setBorderTopRightRadius(obj);
                break;
            case 20:
                setBorderBottomRightRadius(obj);
                break;
            case 21:
                setBorderBottomLeftRadius(obj);
                break;
            case 22:
                setShadow(String.valueOf(obj));
                break;
            case 23:
                setOpacity(((Float) obj).floatValue());
                break;
            case 24:
                setVisibility(String.valueOf(obj));
                break;
            case 25:
                setZIndex((int) ((Float) obj).floatValue());
                break;
            case 26:
            case 27:
                if (a.b.FIXED.f4608c.equals(obj)) {
                    getYogaNode().setPositionType(YogaPositionType.ABSOLUTE);
                }
                return setPosition((String) obj);
            case 28:
                if (a.EnumC0138a.BLOCK.f4604c.equals(obj) || a.EnumC0138a.INLINE.f4604c.equals(obj) || a.EnumC0138a.INLINE_BLOCK.f4604c.equals(obj)) {
                    e.e.a.y.c.a.c(this);
                }
                String str2 = (String) obj;
                if (e.e.a.y.c.a.b(this)) {
                    e.e.a.y.c.c.a(false, (j) this, (Map) e.e.a.y.c.a.a(this));
                }
                HashMap hashMap = new HashMap();
                if (a.EnumC0138a.BLOCK.f4604c.equals(str2)) {
                    hashMap.put("flexDirection", "column");
                }
                if (a.EnumC0138a.INLINE.f4604c.equals(str2)) {
                    hashMap.put("width", "auto");
                    hashMap.put("maxWidth", "auto");
                    hashMap.put("minWidth", "auto");
                    hashMap.put("height", "auto");
                    hashMap.put("maxHeight", "auto");
                    hashMap.put("minHeight", "auto");
                    hashMap.put("marginAll", "0%");
                    hashMap.put("marginLeft", "0%");
                    hashMap.put("marginRight", "0%");
                    hashMap.put("marginTop", "0%");
                    hashMap.put("marginBottom", "0%");
                    hashMap.put("marginStart", "0%");
                    hashMap.put("marginEnd", "0%");
                    hashMap.put("marginHorizontal", "0%");
                    hashMap.put("marginVertical", "0%");
                    hashMap.put("paddingAll", "0%");
                    hashMap.put("paddingBottom", "0%");
                    hashMap.put("paddingEnd", "0%");
                    hashMap.put("paddingLeft", "0%");
                    hashMap.put("paddingRight", "0%");
                    hashMap.put("paddingStart", "0%");
                    hashMap.put("paddingTop", "0%");
                    hashMap.put("paddingHorizontal", "0%");
                    hashMap.put("paddingVertical", "0%");
                }
                if (a.EnumC0138a.INLINE_BLOCK.f4604c.equals(str2)) {
                    hashMap.put("flexDirection", "column");
                }
                e.e.a.y.c.c.a(false, (j) this, (Map) hashMap);
                if (this instanceof k) {
                    for (j jVar : ((k) this).getChildren()) {
                        e.e.a.y.c.a.a(str2, jVar);
                    }
                }
                return setDisplay(str2);
            default:
                return false;
        }
        return true;
    }

    public void setInlineBox(l lVar) {
        this.inlineBox = lVar;
    }

    @JsAttribute
    public void setOpacity(float f2) {
        getView().setAlpha(f2);
    }

    public void setPositionChangedListener(f fVar) {
        this.positionChangedListener = fVar;
    }

    @JsAttribute
    public void setShadow(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(" ");
            if (split.length == 4) {
                float[] fArr = new float[3];
                for (int i = 0; i < 3; i++) {
                    fArr[i] = e.e.a.y.c.c.b((Object) split[i]);
                }
                int h2 = l.f.h(split[3]);
                g gVar = this.backgroundHelper;
                float f2 = fArr[2];
                float f3 = fArr[0];
                float f4 = fArr[1];
                f a2 = gVar.a();
                if (a2 != null) {
                    a2.f4566e = new f.c(f2, f3, f4, h2);
                    a2.invalidateSelf();
                    return;
                }
                throw null;
            }
        }
    }

    public void setStyle(Map<String, Object> map) {
        this.style = map;
        e.e.a.y.c.b bVar = this.hummerNode;
        bVar.f4612e.putAll(map);
        e.e.a.y.c.c.a(true, bVar.f4609a, (Map) map);
        onStyleUpdated(map);
    }

    public boolean setStyle(String str, Object obj) {
        return false;
    }

    public void setTransitionDelay(Object obj) {
        this.transitionDelay = (double) e.e.a.y.c.c.a(obj, false);
        if (this.transitions != null) {
            for (int i = 0; i < this.transitions.size(); i++) {
                this.transitions.get(i).f4555c = (float) this.transitionDelay;
            }
        }
    }

    public void setTransitionDuration(Object obj) {
        ArrayList arrayList = new ArrayList();
        this.durationList = arrayList;
        if (obj instanceof List) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                this.durationList.add(Double.valueOf((double) e.e.a.y.c.c.a(it.next(), false)));
            }
        } else if (obj instanceof String) {
            for (String str : ((String) obj).replace(" ", "").split(",")) {
                this.durationList.add(Double.valueOf((double) e.e.a.y.c.c.a((Object) str, false)));
            }
        } else if (obj instanceof Number) {
            arrayList.add(Double.valueOf((double) e.e.a.y.c.c.a(obj, false)));
        }
        if (this.durationList.size() > 0 && this.transitions != null) {
            for (int i = 0; i < this.transitions.size(); i++) {
                List<Double> list = this.durationList;
                this.transitions.get(i).b = (float) list.get(i % list.size()).doubleValue();
            }
        }
    }

    public void setTransitionProperty(Object obj) {
        this.transitions = new ArrayList();
        int i = 0;
        if (obj instanceof String) {
            String[] split = ((String) obj).replace(" ", "").split(",");
            while (i < split.length) {
                h hVar = new h(split[i]);
                hVar.f4555c = (float) this.transitionDelay;
                hVar.f4556d = this.transitionTimingFunction;
                if (this.durationList.size() > 0) {
                    List<Double> list = this.durationList;
                    hVar.b = (float) list.get(i % list.size()).doubleValue();
                }
                this.transitions.add(hVar);
                i++;
            }
        } else if (obj instanceof List) {
            ArrayList arrayList = (ArrayList) obj;
            if (!arrayList.isEmpty()) {
                while (i < arrayList.size()) {
                    h hVar2 = new h((String) arrayList.get(i));
                    hVar2.f4555c = (float) this.transitionDelay;
                    hVar2.f4556d = this.transitionTimingFunction;
                    if (this.durationList.size() > 0) {
                        List<Double> list2 = this.durationList;
                        hVar2.b = (float) list2.get(i % list2.size()).doubleValue();
                    }
                    this.transitions.add(hVar2);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean setTransitionStyle(String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -1998952146:
                if (str.equals("transitionDelay")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -699883785:
                if (str.equals("transitionTimingFunction")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1423936074:
                if (str.equals("transitionProperty")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            setTransitionDuration(obj);
        } else if (c2 == 1) {
            setTransitionDelay(obj);
        } else if (c2 == 2) {
            setTransitionTimingFunction((String) obj);
        } else if (c2 != 3) {
            return false;
        } else {
            setTransitionProperty(obj);
        }
        return true;
    }

    public void setTransitionTimingFunction(String str) {
        this.transitionTimingFunction = str;
        if (this.transitions != null) {
            for (int i = 0; i < this.transitions.size(); i++) {
                this.transitions.get(i).f4556d = this.transitionTimingFunction;
            }
        }
    }

    @JsAttribute
    public void setVisibility(String str) {
        getView().setVisibility("hidden".equals(str) ? 4 : 0);
    }

    @JsAttribute
    public void setZIndex(int i) {
        p.a(getView(), (float) i);
    }

    public boolean supportTransitionStyle(String str) {
        for (h hVar : this.transitions) {
            if (str.equals(hVar.f4554a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean a(android.view.View r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.y.a.b.j.a(android.view.View, android.view.MotionEvent):boolean");
    }
}
