public class Main {
    public static void main(String[] args) {}
    private int rad;
    private int dia;
    private int length;
    public Main(int a, int b, int c){
        rad = a;
        dia = b;
        length = c;
    }
    public void setrad(int a){
        rad = a;
    }
    public void setdia(int b){
        dia = b;
    }
    public void setlen(int c){
        length = c;
    }
    public int getrad(){
        return rad;
    }
    public int getdia(){
        return dia;
    }
    public int getlen(){
        return length;
    }

}