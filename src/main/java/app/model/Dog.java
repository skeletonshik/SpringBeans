package app.model;

import org.springframework.stereotype.Component;

@Component("beanDog")
public class Dog extends Animal{

    @Override
    public String toString() {
        return "Bark-bark";
    }
}


