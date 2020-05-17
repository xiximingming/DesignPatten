package io.tianmao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokerHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
    throws Exception
    {
        TxUtil util = new TxUtil();
        util.beginTx();
        Object result = method.invoke(target, args);
        util.afterTx();
        return result;
    }



}
