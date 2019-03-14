package com.raiden.homework.patterns.factory;

import com.raiden.homework.patterns.factory.entity.Phone;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public class SimpleFactory {

    public Phone create(Class c) {
        try {
            if (!c.getSuperclass().isAssignableFrom(Phone.class))
                return null;
            Phone phone = (Phone) c.newInstance();
            phone.setTag("此对象由简单工厂创建。");
            return phone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
