package by.htp.carparking.web.action;

import static by.htp.carparking.web.util.WebConstantDeclaration.*;
import java.util.HashMap;
import java.util.Map;

import by.htp.carparking.web.action.impl.CarListViewAction;

public final class ActionManager {

	private ActionManager() {
	}

	private static Map<String, BaseAction> actions;

	static {
		actions = new HashMap<>();
		actions.put(ACTION_NAME_VIEW_CAR_LIST, new CarListViewAction());
	}

	public static BaseAction getAction(String action) {
		return actions.get(action);
	}
}
