package com.driver;

public class Main {
       static class Product {
//            Use static otherwise we have to create outer class and a inner class
//            Main obj = new Main();
//            Main.Product p = obj.new Product();
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y,int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }

    }
    public static void main(String[] args) {
//          Main obj = new Main();
//        Main.Product p = obj.new Product();
        Product p = new Product();
        int result =  p.product(10, 20);
        int result2 = p.product(10, 20, 30);
        double result3 = p.product(10.0, 20.1);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }




}