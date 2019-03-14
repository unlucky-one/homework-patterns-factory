package com.raiden.homework.patterns.factory;

import com.raiden.homework.patterns.factory.entity.IPhone;
import com.raiden.homework.patterns.factory.entity.XiaoMi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public class ImplAbstractFactory implements AbstractFactory {
    @Override
    public IPhone createIPhone() {
        IPhone phone = new IPhone();
        phone.setTag("此对象由抽象工厂创建");
        return phone;
    }

    @Override
    public XiaoMi createXiaoMi() {
        XiaoMi phone = new XiaoMi();
        phone.setTag("此对象由抽象工厂创建");
        return phone;
    }
}
