package by.htp.carparking.web.util;

public class WebConstantDeclaration {
	public static final String REQUEST_PARAM_ACTION = "action";
	public static final String REQUEST_PARAM_CAR_LIST = "carlist";

	public static final String REQUEST_PARAM_USER_ID = "user_id";
	public static final String REQUEST_PARAM_CAR_ID = "car_id";

	public static final String REQUEST_MSG_SUCCES = "msg_success";

	public static final String ACTION_NAME_VIEW_CAR_LIST = "view_car_list";
	public static final String ACTION_NAME_ORDER_CAR = "order_car";
	public static final String ACTION_NAME_RETURN_CAR = "return_car";

	public static final String PAGE_USER_MAIN = "/WEB-INF/page/user/main.jsp";

	public static final String URL_DB = "jdbc:mysql://localhost/carparking?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false&characterEncoding=UTF-8";
	public static final String USER_DB = "root";
	public static final String PASSWORD_DB = "root";

	public static final String DB_CONNECT_PROPERTY = "db_config";

	private WebConstantDeclaration() {

	}

}
