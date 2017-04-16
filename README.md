#使用记事本开发开发java项目

Java项目开发

1.新建notepad做为项目目录
2.新建src作为java源文件目录
3.新建bin目录做为编译的class文件目录
4.目录结构如下：
	nodepad
		|-src
		|	|-cx
		|	|	|-Test.java
		|	|-util
		|		|-StringUtils.java
		|-bin
			|-cx
			|	|-Test.class
			|-util
				|-StringUtils.class

一、开发StringUtils.java类
	1.1在src目录下新建util目录
	1.2在util目录下新建StringUtils.java类
	1.3代码如下：
		package util;
		public class StringUtils{
			public static String say(String s){
				return "hello,"+s;
			}
		}
	1.4编译StringUtils.java源文件，并将生成的class文件放入bin/util目录中，命令行如下：
		d:\nodepad> javac -cp ./bin -d ./bin ./src/util/StringUtils.java
	1.5编译成功之后，会在bin／util/目录中生成StringUtils.class文件

二、开发调用程序Test.java
	2.1在src目录下新建cx目录
	2.2在cx目录下新建Test.java类
	2.3代码如下：
		package cx;
		import util.*;		//引入刚刚开发的包
		public class Test{
			public static void main(String[] args){
				System.out.println("hello world!");
				//调用StringUtils类
				System.out.println(StringUtils.say("vincent"));
			}
		}
	2.4编译Test.java源文件，并将生成的class文件放入bin/cx目录中，命令行如下：
		d:\nodepad> javac -cp ./bin -d ./bin ./src/cx/Test.java
	2.5编译成功之后，会在bin/cx/目录中生成Test.class文件
三、运行Test.class类，命令行如下：
	d:\nodepad> java -cp ./bin cx.Test
四、可以将以上步聚使用批处理文件来搞定
