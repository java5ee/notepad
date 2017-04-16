package cx;
import util.*;
//1. javac -d ./bin Test.java    将class输出到bin目录下
public class Test{
	public static void main(String[] args){
		String s = "getName";
		s = StringUtils.initUpper(s);
		System.out.println(s);
		s = StringUtils.initLower(s);
		System.out.println(s);
	}
}
