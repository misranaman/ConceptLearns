package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(0);
		// intList.add("");

		List list = new ArrayList<>();

		list.add(0);

		List<String> strList = new ArrayList<>();
		strList.add("0");
	}

	public <T> List<String> convertListToString(List<T> listToConvert) {

		List<String> convertedList = new ArrayList<String>();

		for (T t : listToConvert) {
			if (t instanceof String) {
				convertedList.add((String) t);
			}
		}

		return new ArrayList<String>();

	}
}
