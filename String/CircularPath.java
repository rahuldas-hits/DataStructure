package String;

public class CircularPath {

    public static boolean checkCircular(char ch[]){

        int x = 0;
        int y = 0;
        int dir = 0;
        for(int i =0 ; i<ch.length; i++){
            //first check if direction is changed
            char move = ch[i];

            if(move == 'R'){
                dir = (dir + 1)%4;
            }else if(move == 'L'){
                dir = ( dir + 3)%4;
            }else{
                if(dir == 0){
                    y++;
                }else if(dir == 1){
                    x++;
                }else if(dir == 2){
                    y--;
                }else{
                    x--;
                }
            }
        }
        return (x == 0 && y == 0);
    }

    public static void main(String[] args) {
        String path_ = "GLGLGLR";
        char[] path = path_.toCharArray();

        // System.out.println(path);

        if(checkCircular(path)){
            System.out.println("Circular");
        }else{
            System.out.println("Not Circular");
        }
    }
    
}
