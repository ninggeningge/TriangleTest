package JunitTest;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by ningge on 16/3/18.
 */
public class Triangle {
    static enum Type  {
        Equilateral,//等边三角形
        Isosceles,//等腰三角形
        Scalene,//不等边
        NotTriangle //不是三角形

    }

    public static Triangle.Type testTriangle(int a, int b, int c){
        if(a <= 0 || b <= 0 ||  c <= 0){
            return Triangle.Type.NotTriangle;
        }

        int [] edgeArray = {a, b,c};

        Arrays.sort(edgeArray);

        if(edgeArray[0] + edgeArray[1] <= edgeArray[2]){
            return Triangle.Type.NotTriangle;
        }

        HashSet temp = new HashSet();

        for(int i = 0; i < edgeArray.length; i++){
            temp.add(edgeArray[i]);
        }

        if(temp.size() == 3){
            return Triangle.Type.Scalene;
        }
        else if(temp.size() == 2){
            return Triangle.Type.Isosceles;
        }
        else{
            return Triangle.Type.Equilateral;
        }
    }

}
