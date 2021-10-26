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

/* public double badRumTotal(double userInput){
        calcKakelplattor(userInput);
        calcKakelfix(userInput);
        calcKakelfog(userInput);
        return calcKakelfix(userInput);
    
    } */
/* 
public double getKakelplattor(){
                    return kakelplattor;
                }

                public double getKakelfix(){
                    return kakelfix;
                }

                public double getKakelfog(){
                    return kakelfog;
                }

                public double getAmountKakelplattor(){
                    return amountKakelplattor;
                }

                public double getWeightKakelfix(){
                    return weightKakelfix;
                }
                
                public double getWeightKakelfog(){
                    return weightKakelfog;
                }
*/

/* 
this.kakelplattor = kakelplattor;
        this.kakelfix = kakelfix;
        this.kakelfog = kakelfog;
        this.amountKakelplattor = amountKakelplattor;
        this.weightKakelfix = weightKakelfix;
        this.weightKakelfog = weightKakelfog;

            public double calcKakelplattorBadrum(double userInput){
        kakelplattor = 15;
        double kakelplattorReturn = kakelplattor * userInput;
        return kakelplattorReturn;
    }
    
    public double calcKakelfixBadrum(double userInput){
        kakelfix = 0.7;
        double kakelfixReturn = kakelfix * userInput;
        return kakelfixReturn;
    }
    
    public double calcKakelfogBadrum(double userInput){
        kakelfog = 0.4;
        double kakelfogReturn = kakelfog * userInput;
        return kakelfogReturn;
    }
*/