package com.test_classes;


import lombok.NoArgsConstructor;
import lombok.Setter;
import com.annotition.AutoInjectable;

@NoArgsConstructor
public class MyClass {
    @AutoInjectable
    @Setter
    private InterfaceTest interfaceTest;
}
