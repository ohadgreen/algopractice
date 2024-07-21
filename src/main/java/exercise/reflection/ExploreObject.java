package exercise.reflection;

import java.lang.reflect.*;

public class ExploreObject {

    public void printClassAttributes(Object object) throws NoSuchFieldException {

        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("isAccessible: " + field.isAccessible());
            System.out.println("Field type: " + field.getType());
        }

        Field siblings = object.getClass().getDeclaredField("siblings");

        Type siblingsGenericType = siblings.getGenericType();
        if (siblingsGenericType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) siblingsGenericType;
            Type[] siblingsTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type type : siblingsTypeArguments) {
                System.out.println("Type argument: " + type);
            }
        }

//        Method[] methods = object.getClass().getMethods();
//        for (Method method : methods) {
//            System.out.println("Method name: " + method.getName());
//            System.out.println("Method return type: " + method.getReturnType());
//        }
    }

    public Object createObjectInstance(String className) {
        try {
            Constructor<?>[] constructors = Class.forName(className).getConstructors();
            for (Constructor<?> constructor : constructors) {
                if (constructor.getParameterCount() == 0) {
                    return constructor.newInstance();
                }
            }
        } catch (Exception e) {
            System.out.println("error creating object instance " + e.getMessage());
            return null;
        }
        return null;
    }

    public Object invokeMethod(Object object, String methodName, int... args) {
        try {
            Method[] declaredMethods = object.getClass().getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.getName().equals(methodName)) {
                    System.out.println("return type: " +method.getReturnType());
                    Type[] methodTypes = method.getGenericParameterTypes();
                    for (Type type : methodTypes) {
                        System.out.println("Method parameter type: " + type);
                    }
                    if (methodTypes.length != args.length) {
                        throw new IllegalArgumentException("Invalid number of arguments");
                    }
                    if (methodTypes.length == 1) {
                        return method.invoke(object, args[0]);
                    }
                    if (methodTypes.length == 2) {
                        return method.invoke(object, args[0], args[1]);
                    }
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("error invoking method " + e.getMessage());
            return null;
        }
        return null;
    }
}
