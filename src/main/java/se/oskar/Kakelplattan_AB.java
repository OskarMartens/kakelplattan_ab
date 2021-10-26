package se.oskar;


public class Kakelplattan_AB {

    public void run(){
         System.out.println("Vad är det för typ av arbete, Kök, Hall eller Badrum?");
         String type = System.console().readLine();
         System.out.println("Hur många kvadratmeter stort är det?");
         double squareSize = Integer.parseInt(System.console().readLine());

            if (type.equalsIgnoreCase("badrum")){
               Badrum badrum = new Badrum(squareSize);

               int paketplattorBadrum = badrum.paketPlattorBadrum(squareSize);
               int säckfogBadrum = badrum.säckFogBadrum(squareSize);
               int säckfixBadrum = badrum.säckFixBadrum(squareSize);

               System.out.println("För ett badrum på " + squareSize + " kvm behöver du ta med dig:");
               System.out.println(paketplattorBadrum + " paket kakelplattor.");
               System.out.println(säckfogBadrum + " säck fog.");
               System.out.println(säckfixBadrum + " säck fix.");             
            }

            else if(type.charAt(0) == 'k' || type.charAt(0) == 'K'){
               Kök kök = new Kök(squareSize);

               int paketPlattorKök = kök.paketPlattorKök(squareSize);
               int säckFogKök = kök.säckFogKök(squareSize);
               int säckFixKök = kök.säckFixKök(squareSize);
            
               System.out.println("För ett kök på " + squareSize + " kvm behöver du ta med dig:");
               System.out.println(paketPlattorKök + " paket kakelplattor.");
               System.out.println(säckFogKök + " säck kakelfog.");
               System.out.println(säckFixKök + " säck kakelfix");

            }

            else if(type.equalsIgnoreCase("hall")){
               Hall hall = new Hall(squareSize);

               int paketPlattorHall = hall.paketPlattorHall(squareSize);
               int säckFogHall = hall.säckFogHall(squareSize);
               int säckFixHall = hall.säckFixHall(squareSize);

               System.out.println("För en hall på " + squareSize + " kvm behöver du ta med dig:");
               System.out.println(paketPlattorHall  + " paket kakelplattor.");
               System.out.println(säckFogHall + " säck kakelfog.");
               System.out.println(säckFixHall + " säck kakelfix");  
            }
   }    
}
