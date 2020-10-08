package android.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.FIELD;

@Target({TYPE, METHOD, CONSTRUCTOR, FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TargetApi {
    int value();
}
