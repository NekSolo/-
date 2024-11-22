 class ArabToRim {

    static String rim = new String();
    static int a;

    static String arabToRim(int d) throws Exception {
        if(d <= 0){ throw new Exception();}
        a = d;


        Rimy arrays[] = Rimy.values();
        int b = arrays.length - 1;
        for (int i = b; i >= 0; i--) {
            //System.out.println(i);
            Rimy current = arrays[i];
            int arab = current.getArab();
            while (a >= arab) {
                a = a - arab;
                rim = rim.concat(current.name());

            }

        }return rim;
    }

     static int rimToArab(String s) throws Exception {

        String as = s;
        int n = 0;
        switch (as) {
            case "I":
                n = 1;
                break;
            case "II": n = 2;
                break;
            case "III":
                n = 3;
                break;
            case "IV":
                n = 4;
                break;
            case "V":
                n = 5;
                break;
            case "VI":
                n = 6;
                break;
            case "VII":
                n = 7;
                break;
            case "VIII":
                n = 8;
                break;
            case "IX":
                n = 9;
                break;
            case "X":
                n = 10;
                break;
            default:
                throw new Exception();

            } return n;

        }
}
