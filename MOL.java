class MOL {
    static void a(int x){
        System.out.println(x);
    }
    static void a(int y,String z){
        System.out.println(y + " and " + z);
    }
    static void ab(int a,String b){
        System.out.println(a + " " + b);
    }
    static void a(double c) {
        System.out.println(c);
    }
    public static void main(String[] args) {
        a(12345);
        a(123,"abc");
        ab(54,"abcd");
        a(3.89);
    }
}
