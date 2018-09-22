


public class Baking_Decorator_Main {
	 public static void main(String[] args) {

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
	   }
}
