package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//unotation? 
@Retention(RetentionPolicy.SOURCE) // class에는 없고 java에만 있다?
@Target(ElementType.TYPE) //
public @interface Type {
	String name();
	int value();
}// compile하면 사라진다.

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface Field{
	int value();
} // class 까지 살아있게 하겠다.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}


//@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal {
	
}
