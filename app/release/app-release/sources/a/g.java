package a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    String[] d1() default {};

    String[] d2() default {};

    int[] mv() default {};

    int xi() default 0;
}
