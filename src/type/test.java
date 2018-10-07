package type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public class test {
	public static void main(String[] args) {
		ClassB b = new ClassB();
		ParameterizedType type = (ParameterizedType)b.getClass().getGenericSuperclass();
		ClassA<String> a = new ClassA<String>();
		ClassC<String> c = new ClassC<String>();
		ParameterizedType type1 = (ParameterizedType)c.getClass().getGenericSuperclass();
//		ParameterizedType type2 = (ParameterizedType)a.getClass().getGenericSuperclass();
		Type t=type1.getActualTypeArguments()[0];
		Class class1=(Class)type.getActualTypeArguments()[0];
		System.out.println(type);
		System.out.println(type1);
//		System.out.println(type2);
		System.out.println(t);
		System.out.println(t.getClass().getName());
		System.out.println(class1);
		
	}
}
