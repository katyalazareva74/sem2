package task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Range {
    String message() default "Field value is out of range";
    int min() default Integer.MIN_VALUE;
    int max() default Integer.MIN_VALUE;
}
