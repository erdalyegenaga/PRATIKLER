import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int gun, ay;
        String burc = "";
        boolean HATA = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Ay Giriniz : ");
        ay = input.nextInt();

        System.out.print("Gun Giriniz : ");
        gun = input.nextInt();

        if (ay == 1) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "OGLAK";
                } else {
                    burc = "KOVA";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 2) {
            if (1 <= gun && gun <= 28) {
                if (gun < 20) {
                    burc = "KOVA";
                } else {
                    burc = "BALIK";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 3) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "BALIK";
                } else {
                    burc = "KOC";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 4) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burc = "KOC";
                } else {
                    burc = "BOGA";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 5) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "BOGA";
                } else {
                    burc = "IKIZLER";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 6) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "IKIZLER";
                } else {
                    burc = "YENGEC";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 7) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "YENGEC";
                } else {
                    burc = "ASLAN";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 8) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "ASLAN";
                } else {
                    burc = "BASAK";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 9) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "BASAK";
                } else {
                    burc = "TERAZI";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 10) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burc = "TERAZI";
                } else {
                    burc = "AKREP";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 11) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "AKREP";
                } else {
                    burc = "YAY";
                }
            } else {
                HATA = true;
            }
        } else if (ay == 12) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burc = "YAY";
                } else {
                    burc = "OGLAK";
                }
            } else {
                HATA = true;
            }
        } else {
            HATA = true;
        }

        // Çıktı ve Hata ver.
        // Hata değeri true ise hata ver.
        if (HATA) {
            System.out.println("Hatalı Değer Girdiniz.Lütfen Tekrar Giriniz.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}