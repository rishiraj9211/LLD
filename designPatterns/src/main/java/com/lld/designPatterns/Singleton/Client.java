package com.lld.designPatterns.Singleton;

public class Client {

    public static void main(String[] args) {
         Singleton instance1 = Singleton.getInnstance();
         Singleton instance2 = Singleton.getInnstance();

         instance1.writeFile();
         instance2.writeFile();
         System.out.println(instance1 == instance2);
    }

}
