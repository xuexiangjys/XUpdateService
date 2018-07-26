/*
 * Copyright (C) 2018 nl-xx(xx@aecg.com.cn)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xuexiang.xupdateservice.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.apache.commons.lang3.StringUtils.EMPTY;

/**
 * 日期工具
 *
 * @author xuexiang
 * @since 2018/7/26 下午4:07
 */
public final class DateUtils {

    /**
     * yyyy-MM-dd
     */
    public static final ThreadLocal<DateFormat> yyyyMMdd = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
    /**
     * yyyyMMdd
     */
    public static final ThreadLocal<DateFormat> yyyyMMddNoSep = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd"));
    /**
     * HH:mm:ss
     */
    public static final ThreadLocal<DateFormat> HHmmss = ThreadLocal.withInitial(() -> new SimpleDateFormat("HH:mm:ss"));
    /**
     * HH:mm
     */
    public static final ThreadLocal<DateFormat> HHmm = ThreadLocal.withInitial(() -> new SimpleDateFormat("HH:mm"));
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final ThreadLocal<DateFormat> yyyyMMddHHmmss = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    /**
     * yyyyMMddHHmmss
     */
    public static final ThreadLocal<DateFormat> yyyyMMddHHmmssNoSep = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMddHHmmss"));
    /**
     * yyyy-MM-dd HH:mm
     */
    public static final ThreadLocal<DateFormat> yyyyMMddHHmm = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm"));
    /**
     * yyyy-MM-dd HH:mm:ss:SSS
     */
    public static final ThreadLocal<DateFormat> yyyyMMddHHmmssSSS = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS"));


    //============================时间类型转化================================//

    /**
     * Don't let anyone instantiate this class.
     */
    private DateUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }


    /**
     * 将时间戳转为时间字符串
     * <p>格式为 format</p>
     *
     * @param millis 毫秒时间戳
     * @param format 时间格式
     * @return 时间字符串
     */
    public static String millis2String(final long millis, final DateFormat format) {
        return date2String(new Date(millis), format);
    }

    /**
     * 将 Date 类型转为时间字符串
     * <p>格式为 format</p>
     *
     * @param date   Date 类型时间
     * @param format 时间格式
     * @return 时间字符串
     */
    public static String date2String(final Date date, final DateFormat format) {
        if (format != null) {
            return format.format(date);
        } else {
            return EMPTY;
        }
    }

    /**
     * 将时间字符串转为时间戳
     * <p>time 格式为 format</p>
     *
     * @param time   时间字符串
     * @param format 时间格式
     * @return 毫秒时间戳
     */
    public static long string2Millis(final String time, final DateFormat format) {
        try {
            if (format != null) {
                return format.parse(time).getTime();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * 将时间字符串转为 Date 类型
     * <p>time 格式为 format</p>
     *
     * @param time   时间字符串
     * @param format 时间格式
     * @return Date 类型
     */
    public static Date string2Date(final String time, final DateFormat format) {
        try {
            if (format != null) {
                return format.parse(time);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将 Date 类型转为时间戳
     *
     * @param date Date 类型时间
     * @return 毫秒时间戳
     */
    public static long date2Millis(final Date date) {
        return date != null ? date.getTime() : -1;
    }

    /**
     * 将时间戳转为 Date 类型
     *
     * @param millis 毫秒时间戳
     * @return Date 类型时间
     */
    public static Date millis2Date(final long millis) {
        return new Date(millis);
    }


    /**
     * 生日期获取年龄
     *
     * @param birthDay 出生日期字符串
     * @param format   日期格式
     * @return 计算出的年龄
     * @throws IllegalArgumentException
     */
    public static int getAgeByBirthDay(final String birthDay, final DateFormat format) throws IllegalArgumentException {
        return getAgeByBirthDay(DateUtils.string2Date(birthDay, format));
    }

    /**
     * 根据出生日期获取年龄
     *
     * @param birthDay 出生日期
     * @return 计算出的年龄
     * @throws IllegalArgumentException
     */
    public static int getAgeByBirthDay(Date birthDay) throws IllegalArgumentException {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthDay)) {
            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayNow = cal.get(Calendar.DAY_OF_MONTH);

        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayNow < dayBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }

    //==============================时间获取===============================//

    /**
     * 获取当前毫秒时间戳
     *
     * @return 毫秒时间戳
     */
    public static long getNowMills() {
        return System.currentTimeMillis();
    }

    /**
     * 获取当前时间字符串
     * <p>格式为 format</p>
     *
     * @param format 时间格式
     * @return 时间字符串
     */
    public static String getNowString(final DateFormat format) {
        return millis2String(System.currentTimeMillis(), format);
    }

    /**
     * 获取当前 Date
     *
     * @return Date 类型时间
     */
    public static Date getNowDate() {
        return new Date();
    }

    /**
     * 获取星期索引
     * <p>注意：周日的 Index 才是 1，周六为 7</p>
     * <p>time 格式为 format</p>
     *
     * @param time   时间字符串
     * @param format 时间格式
     * @return 1...7
     * @see Calendar#SUNDAY
     * @see Calendar#MONDAY
     * @see Calendar#TUESDAY
     * @see Calendar#WEDNESDAY
     * @see Calendar#THURSDAY
     * @see Calendar#FRIDAY
     * @see Calendar#SATURDAY
     */
    public static int getWeekIndex(final String time, final DateFormat format) {
        return getWeekIndex(string2Date(time, format));
    }

    /**
     * 得到年
     *
     * @param date Date对象
     * @return 年
     */
    public static int getYear(final Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }

    /**
     * 得到月
     *
     * @param date Date对象
     * @return 月
     */
    public static int getMonth(final Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }

    /**
     * 得到日
     *
     * @param date Date对象
     * @return 日
     */
    public static int getDay(final Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取星期索引
     * <p>注意：周日的 Index 才是 1，周六为 7</p>
     *
     * @param date Date 类型时间
     * @return 1...7
     * @see Calendar#SUNDAY
     * @see Calendar#MONDAY
     * @see Calendar#TUESDAY
     * @see Calendar#WEDNESDAY
     * @see Calendar#THURSDAY
     * @see Calendar#FRIDAY
     * @see Calendar#SATURDAY
     */
    public static int getWeekIndex(final Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 获取星期索引
     * <p>注意：周日的 Index 才是 1，周六为 7</p>
     *
     * @param millis 毫秒时间戳
     * @return 1...7
     * @see Calendar#SUNDAY
     * @see Calendar#MONDAY
     * @see Calendar#TUESDAY
     * @see Calendar#WEDNESDAY
     * @see Calendar#THURSDAY
     * @see Calendar#FRIDAY
     * @see Calendar#SATURDAY
     */
    public static int getWeekIndex(final long millis) {
        return getWeekIndex(millis2Date(millis));
    }

}
