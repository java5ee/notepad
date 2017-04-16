package util;

public class StringUtils{
	/**
	* 判断是否为空
	*/
	public static boolean isEmpty(String s){
		boolean flag = false;
		if(s == null || "".equals(s.trim())){
			flag = true;
		}
		return flag;
	}

	/**
	* 首字母大写
	*/
	public static String initUpper(String s){
		if(s != null){
			return s.substring(0,1).toUpperCase()+s.substring(1);
		}
		return null;
	}

	/**
	* 首字母大写
	*/
	public static String initLower(String s){
		if(s != null){
			return s.substring(0,1).toLowerCase()+s.substring(1);
		}
		return null;
	}
}
