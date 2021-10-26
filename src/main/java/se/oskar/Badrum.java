package se.oskar;

public class Badrum {

    double kakelplattor;
    double kakelfix;
    double kakelfog;

    public Badrum(double squareSize){
        super();
    }
    
    public int paketPlattorBadrum (double squareSize){
        double plattorPerPaket = 32;
        double kakelplattorPerKvm = 15;
        double amountOfKakelplattor = kakelplattorPerKvm * squareSize;
        double total = amountOfKakelplattor / plattorPerPaket;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfPaketPlattor = (int)totalRoundDouble;
        return amountOfPaketPlattor;
    }

    public int säckFogBadrum(double squareSize){
        double säckFog = 3;
        double fogPerKvm = 0.4;
        double amountOfFog = fogPerKvm * squareSize;
        double total = amountOfFog / säckFog;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfSäckarFog = (int)totalRoundDouble;
        return amountOfSäckarFog;
    }

    public int säckFixBadrum(double squareSize) {
        double säckFix = 5;
        double fixPerKvm = 0.7;
        double amountOfFix = fixPerKvm * squareSize;
        double total = amountOfFix / säckFix;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfSäckarFix = (int)totalRoundDouble;
        return amountOfSäckarFix;
    }
}
