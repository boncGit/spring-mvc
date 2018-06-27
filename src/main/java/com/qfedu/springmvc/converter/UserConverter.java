package com.qfedu.springmvc.converter;

import com.qfedu.springmvc.pojo.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mengxy on 2018/6/26.
 */
public class UserConverter implements Converter<String,User> {

    /**
     * 将字符串转成User
     * @param source
     * @return
     */
    @Override
    public User convert(String source) {
        if(!StringUtils.isEmpty(source)){
            String[] split = source.split("-");
            if(split != null && split.length == 3){
                String userName = split[0];
                Integer age = Integer.parseInt(split[1]);
                String email = split[2];

                User user = new User();
                user.setUsername(userName);
                user.setAge(age);
                user.setEmail(email);

                return user;
            }
        }
        return null;
    }
}
