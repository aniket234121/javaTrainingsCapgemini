package Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        LearnAnnotation lna=new LearnAnnotation();
        Class c=lna.getClass();
        if(c.isAnnotationPresent(myAnnotation.class))
        {
            Method[] methods=c.getDeclaredMethods();
            for(Method m:methods)
            {
                m.invoke(lna);
            }
        }
    }
}
