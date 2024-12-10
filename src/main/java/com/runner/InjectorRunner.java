package com.runner;

import com.implementations.MicroServices;
import com.injector.Injector;

public class InjectorRunner {
    public static void main(String[] args) {
        try {
            MicroServices ms = (new Injector()).injector(new MicroServices());

            System.out.println(ms);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
