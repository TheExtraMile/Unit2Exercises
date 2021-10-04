package com.company;

class Main {
    public static void main(String[] args) {
        System.out.println(E1("hello", 2));
        System.out.println(E2("hello", 0));
        System.out.println(E3("hello world", "hello ", "world"));
        System.out.println(E4("haha"));
        System.out.println(E5("hello world", 'l'));
    }

    static char E1(String x, int y){
        return x.charAt(y);
    }

    static int E2(String x, int y) {
        return (int)x.charAt(y);
    }

    static boolean E3(String x, String y, String z) {
        return x.contains(y + z);
    }

    static boolean E4(String x) {
        int y = x.length() / 2;
        return (x.substring(0, y) + x.substring(0, y)).equals(x);
    }

    static int E5(String x, char y) {
        int z = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == y) {
                z += 1;
            }
        }
        return  z;
    }
}