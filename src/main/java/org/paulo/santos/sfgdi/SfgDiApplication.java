package org.paulo.santos.sfgdi;

import org.paulo.santos.sfgdi.controllers.ConstructorInjectedController;
import org.paulo.santos.sfgdi.controllers.MyController;
import org.paulo.santos.sfgdi.controllers.PropertyInjectedController;
import org.paulo.santos.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =
				SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController)
									ctx.getBean("myController");
		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("-------------Property--------------");
		PropertyInjectedController property = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(property.getGreeting());


		System.out.println("-------------Setter--------------");
		SetterInjectedController setter = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setter.getGreeting());

		System.out.println("-------------Constructor--------------");
		ConstructorInjectedController constr = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constr.getGreeting());
	}

}
