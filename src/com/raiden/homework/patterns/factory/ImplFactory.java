package com.raiden.homework.patterns.factory;

import com.raiden.homework.patterns.factory.BaseFactory;
import com.raiden.homework.patterns.factory.entity.IPhone;
import com.raiden.homework.patterns.factory.entity.Phone;
import com.raiden.homework.patterns.factory.entity.Samsung;
import com.raiden.homework.patterns.factory.entity.XiaoMi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Raiden
 * Date: 2019/3/14
 */
public class ImplFactory implements BaseFactory {
    @Override
    public Phone create(int type) {
        Phone phone=null;
        switch (type){
            case 0:
                phone= new IPhone();
                break;
            case 1:
                phone= new Samsung();
                break;
            case 2:
                phone= new XiaoMi();
                break;
        }
        phone.setTag("此对象由工厂方法创建");
        return phone;
    }
}
