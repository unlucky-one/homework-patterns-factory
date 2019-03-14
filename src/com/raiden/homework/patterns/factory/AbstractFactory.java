package com.raiden.homework.patterns.factory;

import com.raiden.homework.patterns.factory.entity.IPhone;
import com.raiden.homework.patterns.factory.entity.Phone;
import com.raiden.homework.patterns.factory.entity.XiaoMi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public interface AbstractFactory {
    IPhone createIPhone();

    XiaoMi createXiaoMi();
}
