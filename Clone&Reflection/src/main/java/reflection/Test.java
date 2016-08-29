package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Cat cat = new Cat("Tom", 5, 10);
        Class catClass = cat.getClass();
        Method[] methods = catClass.getMethods();

        for (Method method : methods) {
            System.out.print(method.getName() + " ");
        }

        Method[] decMethods = catClass.getDeclaredMethods();
        System.out.print("\nDeclared:\n");
        for (Method method : decMethods) {
            System.out.println(method.getName() + " ");
            if ("voice".equals(method.getName()) || "fight".equals(method.getName())) {
                method.setAccessible(true);
                method.invoke(cat, null);
            }
        }
        Field[] declaredFields = catClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field.getName());
            System.out.println(field.get(cat));
        }
        Constructor constructor = catClass.getConstructor(new Class[]{String.class, int.class, int.class});
        Cat cat2 = (Cat)constructor.newInstance("Bob", 2, 6);
        System.out.println(cat2);
    }
}
