package se.oskar;

public class Hall {

    double kakelplattor;
    double kakelfix;
    double kakelfog;

    public Hall(double squareSize) {
        super();
    }
    
    public int paketPlattorHall (double squareSize){
        double plattorPerPaket = 32;
        double kakelplattorPerKvm = 8;
        double amountOfKakelplattor = kakelplattorPerKvm * squareSize;
        double total = amountOfKakelplattor / plattorPerPaket;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfPaketPlattor = (int)totalRoundDouble;
        return amountOfPaketPlattor;
    }
    
    public int säckFogHall(double squareSize){
        double säckFog = 3;
        double fogPerKvm = 0.25;
        double amountOfFog = fogPerKvm * squareSize;
        double total = amountOfFog / säckFog;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfSäckarFog = (int)totalRoundDouble;
        return amountOfSäckarFog;
    }

    public int säckFixHall(double squareSize) {
        double säckFix = 5;
        double fixPerKvm = 0.2;
        double amountOfFix = fixPerKvm * squareSize;
        double total = amountOfFix / säckFix;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfSäckarFix = (int)totalRoundDouble;
        return amountOfSäckarFix;
    }
}
