package se.oskar;

/* 
2.
Företaget Kakelplattan AB vill ha hjälp med att skriva
ett program som ska hjälpa hantverkaren att veta hur många kakelpaket,
hur många säckar kakelfix samt hur många säckar kakelfog som ska tas med till respektive kund.

Din uppgift blir att skriva ett program som frågar vad för typ av arbete det är och hur många kvadratmeter
det är.
Det kan vara tre olika typ av arbeten, Badrum ( B ), Hall ( H ) och Kök ( K ). 
Du kan använda bokstaven i parentesen för att ange respektive arbete.


Ifall hantverkaren anger fel kommando för arbete eller ett värde mindre än noll för kvadratmeter 
så ska programmet ge ett felmeddelande.

Ett paket kakelplattor innehåller 32 stycken plattor, en säck kakelfix väger 5 kg
och en säck kakelfog väger 3 kg.

Ett badrum behöver per kvadratmeter Kakelplattor: 15 st Kakelfix:0,7 kg Kakelfog:0,4 kg.
En hall behöver per kvadratmeterKakelplattor: 8 st Kakelfix: 0,3 kg Kakelfog: 0,25 kg. 
Ett kök behöver per kvadratmeter Kakelplattor: 12 st Kakelfix: 0,2 kg Kakelfog: 0,15 kg

Eftersom hantverkaren inte kan ta med sig halva paket eller delar av säckar så måste uträkningen
alltid avrundas uppåt. Det vill säga ifall beräkningen blir 7,1 paket kakelplattor ska det avrundas 
till 8 paket kakelplattor, så inte hantverkaren får för lite material med sig.
*/


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


/* System.out.println(df.format(plattor) + " plattor.");
               System.out.println(df.format(fog) + " kg kakelfog.");
               System.out.println(df.format(fix) + " kg kakelfix");   */

/* 
double paketPlattorKök = kök.paketPlattorkök(squareSize);
               double säckFogKök = kök.säckFogKök(squareSize);
               double säckFixKök = kök.calcKakelfixKök(squareSize);

               double paketplattorHall = hall.calcKakelplattorHall(squareSize);
               double säckfog = hall.calcKakelfogHall(squareSize);
               double säckfix = hall.calcKakelfixHall(squareSize);
*/