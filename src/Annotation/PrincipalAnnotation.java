package Annotation;

import Annotation.AnnotationExecutar;

import java.lang.reflect.Method;

public class PrincipalAnnotation {

    public static void main(String[] args) throws Exception {

        AplicacaoAnnotation aa = new AplicacaoAnnotation();
        executar (aa);
    }

    private static void executar (Object o) throws Exception {

        Class c = o.getClass();
        Method[] metodos = c.getDeclaredMethods();

        for (Method x : metodos) {
            AnnotationExecutar ae = x.getAnnotation(AnnotationExecutar.class);

            if (ae != null) {
                x.invoke(o, ae.arg());
            }
        }
    }
}
