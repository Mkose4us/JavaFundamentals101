package repl.r213;
import com.sun.jdi.DoubleValue;

import java.util.*;
public class Main {
    public static  double convertC(String[][] money,String[][] convertionRate)
    {
Double calc=0D;
for(int i=0;i< money.length;i++){
    for(int j=0;i< convertionRate.length;j++) {
    if(money[i][0].equalsIgnoreCase(convertionRate[j][0])){
        calc +=Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[j][1]);
        break;
    }
    else
        continue;
    }

}
        //System.out.println("result is "+calc);
return calc;
    }

    public static void main(String[] args)
    {



        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

        double res = Main.convertC(test_money,test_convert);
       System.out.print(res);

    }


}


