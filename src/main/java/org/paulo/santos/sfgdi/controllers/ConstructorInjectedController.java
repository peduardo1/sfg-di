package org.paulo.santos.sfgdi.controllers;

import org.paulo.santos.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    public final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
