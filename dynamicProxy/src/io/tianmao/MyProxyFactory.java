package io.tianmao;

import java.lang.reflect.Proxy;

public class MyProxyFactory {

    public static Object getProxy(Object target){
        MyInvokerHandler handler = new MyInvokerHandler();
        handler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);
    }
}
