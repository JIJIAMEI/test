package appOne.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public @interface Test {
	@Target(ElementType.TYPE)//用于描述类、接口(包括注解类型) 或enum声明
	public @interface Type{
		
	}
	@Target(ElementType.CONSTRUCTOR)//用于描述构造器
	public @interface Constructor{
		
	}
	@Target(ElementType.FIELD)//用于描述域
	public @interface Field{
		
	}
	@Target(ElementType.LOCAL_VARIABLE)//用于描述局部变量
	public @interface Loal{
		
	}
	@Target(ElementType.METHOD)//用于描述方法
	public @interface Method{
		
	}
	@Target(ElementType.PACKAGE)//用于描述包
	public @interface Ppppp{
		
	}
	@Target(ElementType.PARAMETER)//用于描述参数
	public @interface Parameter{
		
	}
	
}
