package com.raiden.homework.patterns.factory;

import com.raiden.homework.patterns.factory.entity.Phone;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public interface BaseFactory {
    Phone create(int type);
}
