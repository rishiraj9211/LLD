package com.lld.designPatterns.Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInnstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public void writeFile(){
        System.out.println("Writing on file");
    }
}
