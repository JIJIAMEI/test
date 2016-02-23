package appOne.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DateUtilTest {
    @Before
    public final void before() {
        System.out.println("before invoke");
    }

    @After
    public final void after() {
        System.out.println("after invoke");
    }
    @BeforeClass
    public final static void beforeClass(){
        System.out.println("beforeClass invoke");
    }
    @AfterClass
    public final static void afterClass(){
        System.out.println("afterClass invoke");
    }
    @Ignore
    @Test
    public final void ignore(){
        System.out.println("ignore invoke");
        throw new IllegalAccessError("ignore ann error");
    }
    @Test
    public final void testZeroTime() {
        DateFormat shortFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat fullFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        java.util.Date result = DateUtil.zeroTime(0);
        Assert.assertEquals(fullFormat.format(result),
                            shortFormat.format(result) + " 00:00:00.000");
    }
    @Test
    public final void testGetZeroTime() {
        DateFormat shortFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat fullFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        java.util.Date now = new java.util.Date();
        java.util.Date result = DateUtil.getZeroTime(now.getTime());
        Assert.assertEquals(fullFormat.format(result),
                            shortFormat.format(now) + " 00:00:00.000");
    }

    @Test(timeout = 1000L)
    public final void timeout() {
        for (;;) {
        }
    }

    @Test(expected = NullPointerException.class)
    public final void expectedOne() {
        throw new NullPointerException();
    }

    @Test(expected = NullPointerException.class)
    public final void expectedTwo() {
        throw new IllegalAccessError();
    }
}
