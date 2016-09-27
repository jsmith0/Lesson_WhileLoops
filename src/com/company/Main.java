package com.company;

public class Main {

    public static void main(String[] args) {
	/*
    int sum = 0, j;
    for(j = 3; j <= 79; j++;){
        sum = sum + j;
        System.out.println(sum);
    }
    */

    int sum = 0;
    int j = 3;//initializating expression
    //while(j <=79)//control expression semicolon killa applies to this
    while(true)
    {
        sum = sum + j;
        j++;//step expression lives down here
        if(j == 23)
            //break;//stops the loop wherever it is
            break;
            System.out.println("Yep, I am done");
    }
    //while(j<=79);
        //while is a gatekeeper right away while the do statement allows everyone in and then kicks people out

    }
}
