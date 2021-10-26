package se.oskar;

public class Kök {

    double kakelplattor;
    double kakelfix;
    double kakelfog;

    public Kök(double squareSize){
        super();
    }

    public int paketPlattorKök (double squareSize){
        double plattorPerPaket = 32;
        double kakelplattorPerKvm = 12;
        double amountOfKakelplattor = kakelplattorPerKvm * squareSize;
        double total = amountOfKakelplattor / plattorPerPaket;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfPaketPlattor = (int)totalRoundDouble;
        return amountOfPaketPlattor;
    }

    public int säckFogKök(double squareSize){
        double säckFog = 3;
        double fogPerKvm = 0.15;
        double amountOfFog = fogPerKvm * squareSize;
        double total = amountOfFog / säckFog;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfSäckarFog = (int)totalRoundDouble;
        return amountOfSäckarFog;
    }

    public int säckFixKök(double squareSize) {
        double säckFix = 5;
        double fixPerKvm = 0.2;
        double amountOfFix = fixPerKvm * squareSize;
        double total = amountOfFix / säckFix;
        double totalRoundDouble = (int)Math.ceil(total);
        int amountOfSäckarFix = (int)totalRoundDouble;
        return amountOfSäckarFix;
    }
}

/* public double calcKakelplattorKök(double userInput){
    kakelplattor = 15;
    double kakelplattorReturn = kakelplattor * userInput;
    return kakelplattorReturn;
}

public double calcKakelfixKök(double userInput){
    kakelfix = 0.7;
    double kakelfixReturn = kakelfix * userInput;
    return kakelfixReturn;
}

public double calcKakelfogKök(double userInput){
    kakelfog = 0.4;
    double kakelfogReturn = kakelfog * userInput;
    return kakelfogReturn;
} */