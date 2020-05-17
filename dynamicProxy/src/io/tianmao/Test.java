package io.tianmao;

public class Test {

    public static void main(String[] args) {
	// write your code here
        Dog target = new GunDog();

        Dog dog = (Dog)MyProxyFactory.getProxy(target);

        dog.run();

        dog.run();

    }
}
