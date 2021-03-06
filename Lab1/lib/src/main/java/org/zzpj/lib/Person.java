package org.zzpj.lib;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String name;

    public void sayHello() {
        System.out.printf("Hello, I'm %s", name);
    }
}
