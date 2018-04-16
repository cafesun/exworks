package com.fiberhome.publicdev;

/**
 * 测试.
 */
public class HelloWorld {
    /**
     * main.
     * @return String.
     */
    public String sayHello() { //////////////////////////////////////////////////////////////////////////////////////////
        return "Hello Maven";
    }

    /**
     * 测试.
     * @param args String[] .
     */
    public static void main(String[]args) {
        System.out.print(new HelloWorld().sayHello());
        System.out.print("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
