package com.blueparking.batch.domain.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 시스템의 현재 일시를 format형식으로 반환한다. format이 null이거나 공백문자("")일 경우
     * "yyyy년MM월dd일 HH시mm분ss초"을 기본 format로 한다.
     *
     * @param format the format
     * @return 현재 일자를 format으로 형식화 한 문자열
     */
    public static String currentDate(String format) {
        if (format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        return new SimpleDateFormat(format).format(new Date(System.currentTimeMillis()));
    }

}
