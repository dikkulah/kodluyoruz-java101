package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int mounth, day;
        String burc = "";
        boolean isError = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        mounth = scanner.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = scanner.nextInt();
/*
        switch (mounth) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else burc = "Kova";
                } else isError = true;
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else burc = "Balık";
                } else isError = true;
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else burc = "Koç";
                } else isError = true;
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else burc = "Boğa";
                } else isError = true;
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else burc = "İkizler";
                } else isError = true;
                break;
            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else burc = "Yengeç";
                } else isError = true;
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else burc = "Aslan";
                } else isError = true;
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else burc = "Başak";
                } else isError = true;
                break;
            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Başak";
                    } else burc = "Terazi";
                } else isError = true;
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else burc = "Akrep";
                } else isError = true;
                break;
            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else burc = "Yay";
                } else isError = true;
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else burc = "Oğlak";
                } else isError = true;
                break;
            default:
                isError = true;

        }
*/

        // İFLER İLE ÖDEV
        if (mounth == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else burc = "Kova";
            } else isError = true;
        }else if(mounth==2){
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else burc = "Balık";
            } else isError = true;
        }else if(mounth==3){
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else burc = "Koç";
            } else isError = true;
        }else if(mounth==4){
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                } else burc = "Boğa";
            } else isError = true;
        }else if(mounth==5){
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else burc = "İkizler";
            } else isError = true;
        }else if(mounth==6){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "İkizler";
                } else burc = "Yengeç";
            } else isError = true;
        }else if(mounth==7){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else burc = "Aslan";
            } else isError = true;
        }else if(mounth==8){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else burc = "Başak";
            } else isError = true;
        }else if(mounth==9){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Başak";
                } else burc = "Terazi";
            } else isError = true;
        }else if(mounth==10){
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                } else burc = "Akrep";
            } else isError = true;
        }else if(mounth==11){
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Akrep";
                } else burc = "Yay";
            } else isError = true;
        }else if(mounth==12){
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else burc = "Oğlak";
            } else isError = true;
        }
        System.out.println(isError ? "Hatalı tarih girdiniz" : ("Burcunuz: " + burc));

    }
}
