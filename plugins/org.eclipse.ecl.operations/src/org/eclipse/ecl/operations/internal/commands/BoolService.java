package org.eclipse.ecl.operations.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.BoxedValue;
import org.eclipse.ecl.runtime.BoxedValues;

public class BoolService extends ConvertService {
	@Override
	Object doConvert(BoxedValue input) throws CoreException {
		return BoxedValues.toBoolean(input);
	}
}
