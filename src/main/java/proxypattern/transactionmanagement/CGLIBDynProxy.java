package proxypattern.transactionmanagement;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Benefit: no need to inherit any class i:e:InvocationHandler
 */
public class CGLIBDynProxy {

    public <T> T createProxy(T object) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(getMethodInterceptor());
        return (T) enhancer.create();
    }

    private static MethodInterceptor getMethodInterceptor() {
        return (obj, method, args, proxy) -> {
            try {
                System.out.println("Bal ektu por e vule jabo");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("Baler career select korsi");
                return result;

            } catch (RuntimeException e) {
                System.out.println("Sob dhon");
                throw e;
            } finally {
                System.out.println("ami ek baler beta bal");
            }
        };
    }
}
