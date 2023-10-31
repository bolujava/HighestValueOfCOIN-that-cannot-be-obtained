package org.example;

public class AlgoExample {
    public static int chickenValue(int coin1, int coin2){
        if (coin1==coin2){
            return -1;
        }
        if (coin1==1||coin2 ==1){
            return -1;
        }
        else{
            return (coin1 * coin2) -(coin1 + coin2);
        }
    }

    public static void main(String[] args) {
        System.out.println(chickenValue(14, 9));
    }

    //the chickenvalue formula from McNugget is: (value 1 * value 2 ) - (value 1 + value 2)

}
