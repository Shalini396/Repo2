package FunProg;

public class HigherOrder {
	public interface IFactory<T> {
		   T create();
		}
	public interface IProducer<T> {
		   T produce();
		}
	public interface IConfigurator<T> {
		   void configure(T t);
		}
	public <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
        return () -> {
           T instance = producer.produce();
           configurator.configure(instance);
           return instance;
        }
    }
}
