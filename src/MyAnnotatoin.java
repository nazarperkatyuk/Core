import java.lang.annotation.Repeatable;
import java.lang.annotation.RetentionPolicy;

@Repeatable(RetentionPolicy.RUNTIME)
public @interface MyAnnotatoin {
    String value();
}


