import dagger.Component;

@Component(modules = BeanModule.class)
public interface BeanComponent {
    void inject(Main main);
    public Bean getBean();
    public IBean getIBean();
}