package e.c.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import e.c.a.b.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public class w {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence != charSequence2) {
            if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
                return false;
            }
            if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
                return charSequence.equals(charSequence2);
            }
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String a() {
        String str;
        String str2;
        String str3 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            str = bufferedReader.readLine().trim();
            bufferedReader.close();
        } catch (Exception e2) {
            e2.printStackTrace();
            str = str3;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            ActivityManager activityManager = (ActivityManager) l.f.b().getSystemService("activity");
            if (activityManager != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    if (runningAppProcesses.size() != 0) {
                        int myPid = Process.myPid();
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (next.pid == myPid && next.processName != null) {
                                str2 = next.processName;
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        str2 = str3;
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Application b = l.f.b();
            Field field = b.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(b);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            str3 = (String) obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return str3;
    }

    public static boolean a(Intent intent) {
        return l.f.b().getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static boolean a(String str) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
