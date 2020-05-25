package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WebsitePagination {
    //x=pagenumber y=sortPageParatmet
    public String [] pagination(String [][] items, int sortParameter, int sortOrder, int x, int y) {
       if(sortOrder==0) {
           Arrays.sort(items, Comparator.comparing(a -> a[sortParameter]));
       }
       else if(sortOrder==1) Arrays.sort(items, (a,b)->(b[sortParameter]).compareTo(a[sortParameter]));
       for (int i=0;i<items.length;i++) {
           System.out.println(Arrays.toString(items[i]));
       }
      List<String> l=new ArrayList<>();
       for(int i=x*y;i<((x*y)+x);i++) {
           if(i<items.length) {
               l.add(items[i][0]);
           }
       }
       return l.toArray(new String[0]);
    }
    public static void main(String [] args) {
        WebsitePagination w = new WebsitePagination();
        String [][] s ={{"p1","1","2"},{"p2","2","1"},{"p3","3","4"}};
        System.out.println(Arrays.toString(w.pagination(s,0,1,2,1)));


    }
}