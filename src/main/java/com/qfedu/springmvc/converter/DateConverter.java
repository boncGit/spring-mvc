package com.qfedu.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mengxy on 2018/6/26.
 */
public class DateConverter implements Converter<String,Date> {

    /**
     * 将字符串转成日期类型
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            sdf.setLenient(false);//是否宽松解析  默认：true
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
