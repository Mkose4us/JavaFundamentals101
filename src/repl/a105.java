package repl;

public class a105 {
    /*
    Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:

zz
zy
zx
zw
zv
yz
....
vv
     */
    public static void main(String[] args) {
        for(char a='z';a>='v';a--){
            for(char b='z';b>='v';b--)
                System.out.println(""+a+b);
        }
    }
}
