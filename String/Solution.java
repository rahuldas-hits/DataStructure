package String;
import java.util.*;

public class Solution {

    public static String[] reorderLogFiles(String[] logs) {

        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String log1, String log2) {
                // split each log into two parts: <identifier, content>
                String[] split1 = log1.split(" ", 2);
                String[] split2 = log2.split(" ", 2);

                // System.out.println("*** " + Arrays.toString(split1));
                // System.out.println("### " + Arrays.toString(split1));
                

                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                // case 1). both logs are letter-logs
                if (!isDigit1 && !isDigit2) {
                    // first compare the content
                    int cmp = split1[1].compareTo(split2[1]);
                    if (cmp != 0)
                        return cmp;
                    // logs of same content, compare the identifiers
                    return split1[0].compareTo(split2[0]);
                }

                // case 2). one of logs is digit-log
                if (!isDigit1 && isDigit2)
                    // the letter-log comes before digit-logs
                    return -1;
                else if (isDigit1 && !isDigit2)
                    return 1;
                else
                    // case 3). both logs are digit-log
                    return 0;
            }
        };

        Arrays.sort(logs, myComp);
        return logs;
    }

    public static void main(String[] args) {
        //logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
        // String[] logs = {"a1 9 2 3 1",
        //                 "g1 act car",
        //                 "zo4 4 7",
        //                 "ab1 off key dog",
        //                 "a8 act zoo"};

        String[] logs = {"ykc 82 01","eo first qpx","o9z cat hamster","06f 12 25 6","az0 first qpx","236 cat dog rabbit snake"};

        String[] buf = reorderLogFiles(logs);

        for(int i=0;i<buf.length;i++){  
            System.out.println(buf[i]);
        }
    }
    
}
