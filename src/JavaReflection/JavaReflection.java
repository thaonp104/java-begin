package JavaReflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JavaReflection {
    public static void main(String[] args) {
        getField();
        getFunction();
        getConstructor();
        getAnnotation();
    }

    public static void getField() {
        System.out.println("Start function getField:");
        Girl girl = new Girl();
        girl.setName("Lyly");
        girl.setAge(24);

        for (Field field: girl.getClass().getFields()) {
            System.out.println();
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType());
        }

        try {
            Field nameField = girl.getClass().getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(girl, "Bella");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final name: " + girl);
        System.out.println("End function getField!");
        System.out.println();
    }

    public static void getFunction() {
        System.out.println("Start function getFunction:");
        Class<Girl> girlClass = Girl.class;

        Method[] methods = girlClass.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println("Field: " + method.getName());
            System.out.println("Parameters: " + Arrays.toString(method.getParameters()));
        }

        try {
            Method methodSetNam = girlClass.getMethod("setName", String.class);
            Girl girl = new Girl();
            methodSetNam.invoke(girl, "Thao");
            System.out.println(girl);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End function getFunction!");
        System.out.println();
    }

    public static void getConstructor() {
        System.out.println("Start function getConstructor:");
        Class<Girl> girlClass = Girl.class;
        System.out.println("Class: " + girlClass.getSimpleName());
        System.out.println("Constructors: " + girlClass.getConstructors());

        try {
            Constructor<Girl> girlConstructor1 = girlClass.getConstructor();
            Girl girl1 = girlConstructor1.newInstance();
            System.out.println("Girl 1: " + girl1.toString());

            Constructor<Girl> girlConstructor2 = girlClass.getConstructor(String.class, Integer.class);
            Girl girl2 = girlConstructor2.newInstance("Hana", 24);
            System.out.println("Girl 2: " + girl2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End function getConstructor!");
        System.out.println();
    }

    public static void getAnnotation() {
        System.out.println("Start function getAnnotation:");
        Class<Girl> girlClass = Girl.class;
        System.out.println("Class: " + girlClass.getSimpleName());

        for (Annotation annotation : girlClass.getDeclaredAnnotations()) {
            System.out.println("Annotation: " + annotation.annotationType());
        }

        for(Method method: girlClass.getDeclaredMethods()){ // Lấy ra các method của class
            System.out.println("\nMethod: " + method.getName()); //Tên method
            for(Annotation annotation : method.getAnnotations()){
                System.out.println("Annotation: " + annotation.annotationType()); // Lấy ra tên các Annatation trên method này
            }
        }

        System.out.println("End function getAnnotation!");
    }
}
