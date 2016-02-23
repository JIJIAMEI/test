package appOne.util;

import java.util.Calendar;

public class DateUtil {
    public final static java.util.Date zeroTime(int amount) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, amount);
        return init(c, 0, 0, 0, 0).getTime();
    }

    public final static java.util.Date getZeroTime(long time) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        return init(c, 0, 0, 0, 0).getTime();
    }

    private final static Calendar init(Calendar c, int HH, int mm, int ss, int mi) {
        if (null == c) {
            throw new NullPointerException("c必须不为null");
        }
        c.set(Calendar.HOUR_OF_DAY, HH);
        c.set(Calendar.MINUTE, mm);
        c.set(Calendar.SECOND, ss);
        c.set(Calendar.MILLISECOND, mi);
        return c;
    }
}
