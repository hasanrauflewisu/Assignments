///
//  The main Baker Program  illustrating the three design patterns
//  Decorator
//  Factory
//  Command
//  in the Command Pattern, all the above methods were used. 
///


public class Baking_Decorator_Main {
	 public static void main(String[] args) {

		  ///
	      //
	      //  Decoratror Pattern Illustration using Cake and Cookie Baking Example  Assignment 1
	      //
	      ///
		 
		 System.out.println("\n Assignment  One -  Decorator Pattern \n");
		 //Instantiate a new Cookie Object with no decoration
	      Bake cookie = new Cookie();
	      
	      Cake cake = new Cake();

	      // instantiate a new Cookie Object with Red Border Baked using bake Decorator
	      Bake cookiewreddeco = new RedBorderDecorator(new Cookie());

	      // instantiate a new Cake Object with Red Border Baked using bake Decorator
	      Bake cakewreddeco = new RedBorderDecorator(new Cake());
	      
	      
	      System.out.println("Bake Cookie in 350degrees with normal border");
	      cookie.bake_350degrees();

	      System.out.println("\nCookie is Baked 350 degrees with red border");
	      cookiewreddeco.bake_350degrees();

	      System.out.println("\nBake Cake in 350degrees with normal border");
	      cake.bake_350degrees();
	      
	      System.out.println("\nCake is baked 350 degrees with red border");
	      cakewreddeco.bake_350degrees();
	      
	      ///
	      //
	      //  Factory Pattern Illustration using Cake and Cookie Baking Example  Assignment 2
	      //
	      ///
	      System.out.println("\n\n\n Assignment  Two  - Factory Pattern \n\n");
	      ShapeFactory shapeFactory = new ShapeFactory();
	      //get an instantiated object of CookieShape Dough
	      Shape CookieShape  = shapeFactory.getShape("COOKIE");
	      //call bake method of CookieShape
	      CookieShape.bake();
	      
	      System.out.println("\n\n");
	      Shape CakeShape  = shapeFactory.getShape("CAKE");
	      //call bake method of CookieShape
	      CakeShape.bake();
	      
	      
	      ///
	      //
	      //  Command Pattern Illustration using Cake and Cookie Baking Example and regulating the GE Oven : Assignment 3
	      //
	      ///
	      
	      System.out.println("\n\n\n Assignment  Three  - Command Pattern \n\n");
	      
	      Bakery_Appliances bakery_Appliances =  new Bakery_Appliances();
	      SwitchOnOven switchOnOven = new SwitchOnOven(bakery_Appliances);
	      SwitchOffOven switchOffOven = new SwitchOffOven(bakery_Appliances);
	      
	      BakingOvenRegulate bakingOvenRegulate = new BakingOvenRegulate();
	      bakingOvenRegulate.takeCommand(switchOffOven);
	      bakingOvenRegulate.executeCommands();
	      
	      bakingOvenRegulate.takeCommand(switchOnOven);
	      bakingOvenRegulate.executeCommands();
	      
	      CookieShape.bake();
	      CakeShape.bake();
	      
	      System.out.println("\nBake Cake in 350degrees with normal border, Oven is On");
	      cake.bake_350degrees();
	      
	      System.out.println("\nCake is baked 350 degrees with red border, Oven is On");
	      cakewreddeco.bake_350degrees();
	      
	      bakingOvenRegulate.takeCommand(switchOffOven);
	      bakingOvenRegulate.executeCommands();
	   }
}
