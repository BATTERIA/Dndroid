package a.a0;

import a.a0.b;
import a.g;
import a.t.b;
import a.w.c.i;
import java.util.List;
import java.util.regex.Matcher;

@g(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f2068a;
    public final Matcher b;

    public static final class a extends b<String> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f2069c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(c cVar) {
            this.f2069c = cVar;
        }

        @Override // a.t.a
        public int a() {
            return this.f2069c.b.groupCount() + 1;
        }

        @Override // a.t.a
        public final boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, a.t.b
        public String get(int i) {
            String group = this.f2069c.b.group(i);
            return group != null ? group : "";
        }

        @Override // a.t.b
        public final int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // a.t.b
        public final int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public c(Matcher matcher, CharSequence charSequence) {
        if (matcher == null) {
            i.a("matcher");
            throw null;
        } else if (charSequence != null) {
            this.b = matcher;
        } else {
            i.a("input");
            throw null;
        }
    }

    @Override // a.a0.b
    public List<String> a() {
        if (this.f2068a == null) {
            this.f2068a = new a(this);
        }
        List<String> list = this.f2068a;
        if (list != null) {
            return list;
        }
        i.a();
        throw null;
    }

    @Override // a.a0.b
    public b.a b() {
        return new b.a(this);
    }
}
