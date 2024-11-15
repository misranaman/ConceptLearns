package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {

	/**
	 * @param args
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Cat myCat = new Cat("Stella");

		if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {

			System.out.println("This thing is very important");
		} else {
			System.out.println("This thing is very important");

		}

		for (Method method : myCat.getClass().getDeclaredMethods()) {

			if (method.isAnnotationPresent(RunImmediately.class)) {
				RunImmediately annotation = method.getAnnotation(RunImmediately.class);
				for (int i = 0; i < annotation.time(); i++)
					method.invoke(myCat);
			}
		}

		for (Field field : myCat.getClass().getDeclaredFields()) {

			if (field.isAnnotationPresent(ImportantString.class)) {
				Object objVal = field.get(myCat);

				if (objVal instanceof String) {
					String stringValue = (String) objVal;
					System.out.println(stringValue.toUpperCase());
				}
			}
		}
	}
}
