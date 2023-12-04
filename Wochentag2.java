import java.util.Scanner;

public class Wochentag2 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Datum (Format: TT.MM.JJJJ) eingeben: ");
        String datum = scanner.nextLine();
        String [] datumA = new String[3];

        datumA = datum.split("\\.");

        int tag = Integer.parseInt(datumA[0]);
        int monat = Integer.parseInt(datumA[1]);
        int jahr = Integer.parseInt(datumA[2]);

        int tageGesamt = tag-1 + monatTage(monat, jahr) + jahrTage(jahr);

        System.out.println("Der " + datum + " ist ein " + wochentag(tageGesamt) + ".");

        scanner.close();
    }
    /*
     * gibt den wochentag abhängig von den tagen, die seit  1.1.1980 vergangen sind zurück
     */
    public static String wochentag(int tageGesamt){
        if(tageGesamt>0){
            switch (tageGesamt%7){
                case 0: return "Dienstag";
                case 1: return "Mittwoch";
                case 2: return "Donnerstag";
                case 3: return "Freitag";
                case 4: return "Samstag";
                case 5: return "Sonntag";
                case 6: return "Montag";
            }
        }else{
            switch (Math.abs(tageGesamt)%7){
                case 0: return "Dienstag";
                case 1: return "Montag";
                case 2: return "Sonntag";
                case 3: return "Samstag";
                case 4: return "Freitag";
                case 5: return "Donnerstag";
                case 6: return "Mittwoch";
            }
        }
        
        return " ";
    }
    /*
     * gibt die anzahl der tage zurück die seit jahres anfang bis zum monats anfang vergangen sind
     */
    public static int monatTage(int monat, int jahr){
        if(schaltjahr(jahr)){
            switch(monat){
                case 1:
                    return 0;
                case 2: 
                    return 31;
                case 3:
                    return 31+28;
                case 4: 
                    return 31+28+31;
                case 5:
                    return 31+28+31+30;
                case 6:
                    return 31+28+31+30+31;
                case 7:
                    return 31+28+31+30+31+30;
                case 8:
                    return 31+28+31+30+31+30+31;
                case 9:
                    return 31+28+31+30+31+30+31+31;
                case 10:
                    return 31+28+31+30+31+30+31+31+30;
                case 11:
                    return 31+28+31+30+31+30+31+31+30+31;
                case 12:
                    return 31+28+31+30+31+30+31+31+30+31+30;
                default:
                    return 0; 
            }
        }else{
            switch(monat){
                case 1:
                    return 0;
                case 2: 
                    return 31;
                case 3:
                    return 31+29;
                case 4: 
                    return 31+29+31;
                case 5:
                    return 31+29+31+30;
                case 6:
                    return 31+29+31+30+31;
                case 7:
                    return 31+29+31+30+31+30;
                case 8:
                    return 31+29+31+30+31+30+31;
                case 9:
                    return 31+29+31+30+31+30+31+31;
                case 10:
                    return 31+29+31+30+31+30+31+31+30;
                case 11:
                    return 31+29+31+30+31+30+31+31+30+31;
                case 12:
                    return 31+29+31+30+31+30+31+31+30+31+30;
                default:
                    return 0; 
            }
        }
    }

    /*
     * gibt die anzahl der vergangenen tage seit 1980 bis zum jahres anfang zurück
     */
    public static int jahrTage(int jahr){
        int gesamt = 0; 
        if(jahr > 1980){
            for(int i = jahr; i > 1980; i--){
                gesamt += (schaltjahr(i)?366:365);
            }
        }else{
            for(int i = jahr; i < 1980; i++){
                gesamt -= (schaltjahr(i)?366:365);
            }
            gesamt -= 1;
        }
        return gesamt;
    }

    /*
     * gibt true zurück falls es sich bei gegebenen Jahr um ein Schaltjahr handelt sonst false
     */
    public static boolean schaltjahr(int jahr){
            if(jahr % 400 == 0 || (jahr % 4 == 0 && jahr % 100 != 0)){
                return true;
            }else{
                return false;
            }
    }
}
