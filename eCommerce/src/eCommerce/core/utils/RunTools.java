package eCommerce.core.utils;

import java.util.ArrayList;
import java.util.List;

import eCommerce.core.utils.results.ResultBase;

public class RunTools {

	public static ResultBase[] runValidationRules(ResultBase... results) {
		List<ResultBase> resultList = new ArrayList<ResultBase>();
		for (ResultBase result : results) {
			if (!result.isSuccess()) {
				resultList.add(result);
			}
		}
		return resultList.toArray(new ResultBase[resultList.size()]);
	}

	public static ResultBase[] runChecks(ResultBase... results) {
		return runValidationRules(results);
	}
}