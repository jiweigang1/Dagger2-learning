import javax.inject.Inject;

public class Main {

    @Inject
    Bean bean;

    public static void main(String[] args) {
        BeanComponent beanComponent = DaggerBeanComponent.builder().beanModule(new BeanModule()).build();
        Main main = new Main();
        beanComponent.inject(main);
        System.out.println(main.bean.toString());
        System.out.println(beanComponent.getBean().toString());
        System.out.println(beanComponent.getIBean().toString());
    }
}