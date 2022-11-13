package com.moascode.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class AnnotationDiscovery {
    /**
     * Complete your code here if necessary
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface OpenResources {
        /**
         * Complete your code here if necessary
         */
    }

    public static Set<Method> getAllAnnotatedMethods(Object input) {
        Set<Method> annotatedMethods = new HashSet<>();

        /**
         * Complete your code here
         */
        for(Method method : ((Class)input).getDeclaredMethods()) {
            if (method.isAnnotationPresent(OpenResources.class)) {
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }

    public class UseAnnotation {
        @OpenResources
        private void useAnnotationMethod() {

        }
    }
}
