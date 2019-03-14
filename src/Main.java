import com.raiden.homework.patterns.factory.*;
import com.raiden.homework.patterns.factory.entity.IPhone;
import com.raiden.homework.patterns.factory.entity.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone = new SimpleFactory().create(IPhone.class);
        System.out.println(phone.getTag());

        BaseFactory factory=new ImplFactory();
        Phone phone1 = factory.create(0);
        System.out.println(phone1.getTag());

        AbstractFactory abstractFactory=new ImplAbstractFactory();
        Phone phone2 = abstractFactory.createIPhone();
        System.out.println(phone2.getTag());

    }
}
