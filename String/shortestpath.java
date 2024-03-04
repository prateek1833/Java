// package String;

public class shortestpath {
    public static float path(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='N'){
                y++;
            }
            if(s.charAt(i)=='S'){
                y--;
            }
            if(s.charAt(i)=='E'){
                x++;;
            }
            if(s.charAt(i)=='W'){
                x--;;
            }
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String arg[]){
        String str="NSWESNSEWNWWWENNNN";
        System.out.print(path(str));
    }
}
