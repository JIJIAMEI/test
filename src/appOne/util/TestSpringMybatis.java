
package appOne.util;

import java.util.Arrays;  
import java.util.Collection;
  
import org.junit.BeforeClass;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.junit.runners.Parameterized;


import appOne.util.Test.Constructor;
import appOne.util.Test.Field;
import appOne.util.Test.Loal;
import appOne.util.Test.Method;
import appOne.util.Test.Parameter;
import appOne.util.Test.Type;
  
//(1)步骤一：测试类指定特殊的运行器org.junit.runners.Parameterized  
@RunWith(Parameterized.class)  
@Type
public class TestSpringMybatis {  
    @Field
    private static String userService = null;  
  
    @BeforeClass 
    @Method
    public static void setUp() {  
        userService = "hello";  
        System.out.println(userService);
    }  
  
    // (2)步骤二：为测试类声明几个变量，分别用于存放期望值和测试所用数据。此处我只放了测试所有数据，没放期望值。  
    @Field
    private int idParam;  
    private String usernameParam;  
  
    // (3)步骤三：为测试类声明一个带有参数的公共构造函数，并在其中为第二个环节中声明的几个变量赋值。  
    @Constructor
    public TestSpringMybatis(@Parameter int id, String username) {  
        this.idParam = id;  
        this.usernameParam = username;  
    }  
  
    // (4)步骤四：为测试类声明一个使用注解 org.junit.runners.Parameterized.Parameters 修饰的，返回值为  
    // java.util.Collection 的公共静态方法，并在此方法中初始化所有需要测试的参数对。  
    public static Collection usernameData() {  
  
        return Arrays.asList(new Object[][] { { 1, "jacky" }, { 2, "andy" },  
                { 3, "tomcat" }, });  
  
    }  
  
    // (5)步骤五：编写测试方法，使用定义的变量作为参数进行测试。  
    @Test  
    public void testFindByName() {  
    	@Loal
    	int iii=0;
        System.out.println("-------------");  
        System.out.println(usernameParam);  
    }  
  
    // (5)步骤五：编写测试方法，使用定义的变量作为参数进行测试。  
    @Test  
    public void testFindById() {  
        System.out.println("************");  
        System.out.println(idParam);  
  
    }  
}  