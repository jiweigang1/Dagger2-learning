import dagger.Provides;
import dagger.Module;

@Module
public class BeanModule {

    @Provides
    public Bean provideBean() {
        return new Bean(1, "bean1");
    }

    @Provides
    public IBean provideIBean() {
        return new Bean(1, "Ibean1");
    }
}
