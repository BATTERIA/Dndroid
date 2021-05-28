package e.g.a;

import java.io.File;
import java.io.FilenameFilter;

public class g implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4679a;

    public g(f fVar, String str) {
        this.f4679a = str;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f4679a);
    }
}
