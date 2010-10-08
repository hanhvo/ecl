package org.eclipse.ecl.runtime;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.EMFStreamPipe;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CoreUtils {

	/**
	 * Creates command parameters class using namespace and name specified
	 * 
	 * @param namespace
	 *            EMF package namespace
	 * @param name
	 *            class name from EMF package
	 * @return
	 * @throws CoreException
	 */
	public static Command createCommand(String namespace, String name)
			throws CoreException {
		return CorePlugin.getScriptletManager().createCommand(namespace, name);
	}

	public static Set<String> getFriendlyNames(String ns, String name)
			throws CoreException {
		return CorePlugin.getScriptletManager().getFriendlyNames(ns, name);
	}

	public static IPipe createEMFPipe(InputStream in, OutputStream out) {
		return new EMFStreamPipe(in, out);
	}

	/**
	 * It tries to cast <code>value</code> into {@link Integer}, then into
	 * {@link Double} and finally into {@link Boolean}. If it is failed, return
	 * <code>value</code> itself as {@link String}
	 * 
	 * @param value
	 * @return casted object
	 */
	public static Object createPrimitiveFromString(String value) {
		try {
			return Integer.decode(value);
		} catch (NumberFormatException e0) {
			try {
				return Double.valueOf(value);
			} catch (NumberFormatException e1) {
				if (value.equalsIgnoreCase("true")
						|| value.equalsIgnoreCase("false")) {
					return Boolean.valueOf(value);
				}
				return value;
			}
		}
	}

	/**
	 * It returns suitable primitive type if possible or throw
	 * {@link ClassNotFoundException} otherwise
	 * 
	 * @param o
	 * @return suitable primitive type for <code>o</code>
	 * @throws ClassNotFoundException
	 */
	public static Class<?> getPrimitiveType(Object o)
			throws ClassNotFoundException {
		if (o instanceof Integer) {
			return int.class;
		} else if (o instanceof Double) {
			return double.class;
		} else if (o instanceof Boolean) {
			return boolean.class;
		}
		throw new ClassNotFoundException();
	}

	public static List<EStructuralFeature> getFeatures(EClass targetClass) {
		List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
		final List<EClass> classes = new ArrayList<EClass>(targetClass
				.getEAllSuperTypes());
		classes.add(targetClass);
		features.addAll(targetClass.getEAllStructuralFeatures());
		Collections.sort(features, new Comparator<EStructuralFeature>() {
			public int compare(EStructuralFeature o1, EStructuralFeature o2) {
				try {
					EClass eClass1 = o1.getEContainingClass();
					EClass eClass2 = o2.getEContainingClass();
					int i1 = classes.indexOf(eClass1);
					int i2 = classes.indexOf(eClass2);
					return i2 - i1;
				} catch (Exception e) {
					CorePlugin.err(e.getMessage(), e);
				}
				return 0;
			}
		});
		return features;
	}

	public static String getScriptletNameByClass(EClass eClass) {

		String className = eClass.getName();

		int startPos = className.lastIndexOf('.');
		if (startPos != -1) {
			className = className.substring(startPos);
		}
		if (className.endsWith("Impl")) {
			className = className.substring(0, className.length() - 4);
		}

		if (className.endsWith("Command")) {
			className = className.substring(0, className.length() - 7);
		}
		StringBuffer result = new StringBuffer();
		for (int index = 0; index < className.length(); index++) {
			char symbol = className.charAt(index);
			if (Character.isUpperCase(symbol)) {
				if (index != 0)
					result.append('-');
				symbol = Character.toLowerCase(symbol);
			}
			result.append(symbol);
		}

		return result.toString();

	}
}
