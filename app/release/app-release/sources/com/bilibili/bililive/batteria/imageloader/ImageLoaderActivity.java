package com.bilibili.bililive.batteria.imageloader;

import a.g;
import a.w.c.i;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bilibili.bililive.tests.R;
import d.b.k.h;
import e.b.a.a.f.c;
import e.b.a.a.f.d.b;
import java.io.File;

@g(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/bilibili/bililive/batteria/imageloader/ImageLoaderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getLiveModManagerCacheDir", "Ljava/io/File;", "hookObject", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "startAnimation", "image", "Landroid/widget/ImageView;", "app_release"}, mv = {1, 1, 16})
public final class ImageLoaderActivity extends h {

    public static final class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ImageLoaderActivity f2596c;

        public a(ImageLoaderActivity imageLoaderActivity) {
            this.f2596c = imageLoaderActivity;
        }

        public final void onClick(View view) {
            File a2 = ImageLoaderActivity.a(this.f2596c);
            if (a2 != null) {
                a2.listFiles();
            }
            System.out.println();
        }
    }

    public static final /* synthetic */ File a(ImageLoaderActivity imageLoaderActivity) {
        File filesDir;
        File parentFile;
        Context applicationContext = imageLoaderActivity.getApplicationContext();
        String path = (applicationContext == null || (filesDir = applicationContext.getFilesDir()) == null || (parentFile = filesDir.getParentFile()) == null) ? null : parentFile.getPath();
        try {
            return new File(path + "/app_mod_resource/cache/live");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_imageloader);
        ImageView imageView = (ImageView) findViewById(R.id.image1);
        c cVar = new c();
        cVar.f3751c = new b(this);
        i.a((Object) imageView, "imageView1");
        imageView.setTag("http://i0.hdslb.com/bfs/live/user_cover/2a246a601047fbbe524af3849ce48cb7a170065d.jpg@420w_236h_1e_1c_85q.webp");
        cVar.f3750a.submit(new e.b.a.a.f.a(cVar, "http://i0.hdslb.com/bfs/live/user_cover/2a246a601047fbbe524af3849ce48cb7a170065d.jpg@420w_236h_1e_1c_85q.webp", imageView));
        imageView.setOnClickListener(new a(this));
    }
}
