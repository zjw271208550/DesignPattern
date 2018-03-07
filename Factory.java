package SimpleFactoryPattern;

public class Factory {
    public static AbstractProduct_Vehicle createVehicle(Class c){
        AbstractProduct_Vehicle vehicle = null;
        try{
            vehicle = (AbstractProduct_Vehicle) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e){
            System.out.println("ERROR: 不支持抽象类或接口");
            e.printStackTrace();
        } catch (IllegalAccessException e){
            System.out.println("ERROR: 没有足够权限不能访问私有对象");
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            System.out.println("ERROR: 类不存在");
            e.printStackTrace();
        }
        return vehicle;
    }
}
