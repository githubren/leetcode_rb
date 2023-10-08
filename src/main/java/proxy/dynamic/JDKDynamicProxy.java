package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {

    private final Object bean;

    public JDKDynamicProxy(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        switch (name){
            case "sound":
                System.out.println("叫声~");
                break;
            case "eat":
                System.out.println("吃饭~");
                break;
        }
        return method.invoke(bean,args);
    }
}
