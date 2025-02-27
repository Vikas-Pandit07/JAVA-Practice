public class PATTERNPRACTICE {
    public static void main(String[] args) {
//-----------------------------------------------------------------
/*
*
*
*
*
        for(int i = 1; i <= 4; i++){
            System.out.println("*");
        }
*/
//-----------------------------------------------------------------
/*
*****
*****
*****
*****
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5; j++){
            System.out.print("*");
            }
            System.out.println();
        }
*/
//-----------------------------------------------------------------
/*
1111
2222
3333
4444
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
            System.out.print(i);
            }
            System.out.println();
        }
*/
/*
12345
12345
12345
12345
12345 
         for (int i = 1; i<=5; i++){
             for (int j = 1; j<= 5; j++){
                 System.out.print(j);
             }
             System.out.println();

         } */

//----------------------------------------------------

/* 
11111
22222
33333
44444
55555 
         for (int i = 1; i<=5; i++){
             for (int j = 1; j<= 5; j++){
                 System.out.print(i);
             }
             System.out.println();

         }*/

//----------------------------------------------------

/* 
 2 2 2 2 2
 4 4 4 4 4
 6 6 6 6 6
 8 8 8 8 8
 10 10 10 10 10

        for (int i = 1; i<=5; i++){
             for (int j = 1; j<= 5; j++){
                 System.out.print(" " +i * 2);
            }
           System.out.println();

         } */

//----------------------------------------------------

/* 
 2 4 6 8 10
 2 4 6 8 10
 2 4 6 8 10
 2 4 6 8 10
 2 4 6 8 10

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<= 5; j++){
                System.out.print(" " +j * 2);
            }
            System.out.println();
        } */

//----------------------------------------------------

/* 
 *
 * *
 * * *
 * * * *
 * * * * *

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        } */

//------------------------------------------------

/* 
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        } */

//-------------------------------------------------

/* 
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(" "+i);
            }
            System.out.println();
        } */

//-------------------------------------------------

/* 
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(" "+i);
            }
            System.out.println();
        } */

//------------------------------------------------
/* 
12345
1234
123
12
1
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
*/
//------------------------------------------------
/* 
 * * * * *
 * * * *  
 * * *    
 * *      
 *        
        for (int i = 5; i>=1; i--){
            for (int j = 1; j<= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        } 
-------------------------------------------------

        for (int j = 1; j<= 5; j++){
            for (int i = 5; i>=j; i--){
                System.out.print(" *");
            }
            System.out.println();
        } */

//------------------------------------------------

/* 
*****
 ****
  ***
   **
    *
        for (int i = 1; i<= 5; i++)
        {
        for(int k = 1; k < i; k++){
                System.out.print(" ");
            }
          for(int j = 5; j >= i; j--){
            System.out.print("*");
          }
          System.out.println();
        }
*/
//------------------------------------------------

/*
 5 spaces befor *.
      * * * * *
      * * * * *
      * * * * *
      * * * * *
      * * * * * 

         for (int i = 1; i<=5; i++){
         for (int k = 1; k<=5; k++){
            System.out.print(" ");
             }
             for (int j = 1; j<= 5; j++){
                 System.out.print(" *");
             }
             System.out.println();
         } */

//------------------------------------------------
/* 
5 spaces befor *.
      * * * * *
      * * * *
      * * *
      * *
      *

         for (int i = 5; i>=1; i--){
            for (int k = 1; k<=5; k++){
            System.out.print(" ");
             }
             for (int j = 1; j<= i; j++){
                 System.out.print(" *");
             }
             System.out.println();
         } */

//------------------------------------------------
/* 
spaces befor *.
  * * * * *    
   * * * * *   
    * * * * *  
     * * * * * 
      * * * * *

        for (int i = 1; i<=5; i++){
            for (int k = 1; k<=i; k++){
            System.out.print(" ");
            }
            for (int j = 1; j<= 5; j++){
                System.out.print(" *");
            }
            System.out.println();
        } */   

//------------------------------------------------

/* spaces befor *.
      * * * * *
     * * * *
    * * *
   * *
  *

         for (int i = 5; i>=1; i--){
            for (int k=1; k<=i; k++){
            System.out.print(" ");
            }
             for (int j = 1; j<= i; j++){
                 System.out.print(" *");
             }
             System.out.println();
         } */

//-----------------------------------------------

/* Printing space 
  *
   * *
    * * *
     * * * *
      * * * * *

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k<= i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        } */

//------------------------------------------------

/* Printing space 
      * * * * *
     * * * *
    * * *
   * *
  *
  *
   * *
    * * *
     * * * *
      * * * * *
      
        for (int i = 5; i>=1; i--){
            for (int k=1; k<=i; k++){
            System.out.print(" ");
            }
            for (int j = 1; j<= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        } 

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k<= i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        } */

//-------------------------------------------------

/* Printing space 
 * * * * *
   * * * * *
    * * * * *
     * * * * *
      * * * * *
     * * * * *
    * * * * *
   * * * * *
  * * * * *
 * * * * *
 
      for (int i = 1; i<=5; i++){
        for (int k = 1; k<=i; k++){
        System.out.print(" ");
        }
         for (int j = 1; j<= 5; j++){
             System.out.print(" *");
         }
         System.out.println();
     } 

     for (int i = 1; i<=5; i++){
        for (int k=5; k>i; k--){
        System.out.print(" ");
        }
         for (int j = 1; j<= 5; j++){
             System.out.print(" *");
         }
         System.out.println();
     } */


//-------------------------------------------------

/* Printing space 
*****
*   *
*   *
*   *
*****
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5 ) {
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }*/

//-------------------------------------------------
/*
  * * * * *
   * * * * *
    * * * * *
     * * * * *
      * * * * *

        for (int i = 1; i<=5; i++){
            for (int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<= 5; j++){
                System.out.print(" *");
            }
            System.out.println();
        } */

//-------------------------------------------------
/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 * * * * *
  * * * * 
   * * *
    * *
     *

        for (int i = 1; i<=5; i++){
            for (int k = 5; k>=i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
        for (int i = 1; i<=4; i++) {
            for (int k = 1; k<=i; k++){
                System.out.print(" ");
            }
            for (int j = 4; j >=i; j--){
                System.out.print(" *");
            }
            System.out.println();
        }*/

//-------------------------------------------------
/*
     * 
    * *
   *   * 
  *     *
 * * * * *

        for (int i = 1; i<=5; i++){
            for (int k = 5; k>=i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j<= i; j++){
                if (i == 1 || i == 5 || j == 1 || j == i){
                System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
*/
//-------------------------------------------------
/*
    * 
   * *
  *   *
 *     * 
*       *
 *     * 
  *   *
   * *
    * 
        for(int i = 1; i <= 5; i++){
            for(int k = 5; k >= i; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if(i == 1 ||j == 1 || j == i){
                System.out.print(" *");
                }
                else{ 
                System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for(int k = 5; k >= i; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if(i == 1 || j == 1 || j == i){
                System.out.print(" *");
                }
                else{ 
                System.out.print("  ");
                }
            }
            System.out.println();
        }*/
//-------------------------------------------------
/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE/
        char ch = 'A';
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<= 5; j++){
                    System.out.print(ch);
            }
            System.out.println();
            ch++;
        } */

//-------------------------------------------------
/*
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
        
        for (int i = 1; i<=5; i++){
            char x = 'A';
            for (int j = 1; j<= 5; j++){
                    System.out.print(x);
                    x++;
            }
            System.out.println();
        } */

//-------------------------------------------------
/*
A
BB  
CCC 
DDDD
        char x = 'A';
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<= i; j++){
                    System.out.print(x);
            }
            System.out.println();
            x++;
        } */

//-------------------------------------------------
/*
A
BB
CCC
DDDD
CCC
BB
A 
        char ch = 'A';
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
        char ch1 = 'C';
        for(int i = 3; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(ch1);
            }
            System.out.println();
            ch1--;
        }*/
//-------------------------------------------------
/*
1 
2 3      
4 5 6    
7 8 9 10 

        int n = 4; 
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" "); 
                number++;
            }
            System.out.println();
        }*/
       
//-------------------------------------------------
/*
*****
 *** 
  *  
 *** 
*****

        int n = 3; 

        for (int i = n; i >= 1; i--) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 2; i <= n; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//--------------------------------------------------------
/*
*********
 ******* 
  *****
   *** 
    *
   ***
  *****
 *******
*********
        int n = 5; 
        for (int i = n; i >= 1; i--) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        for (int i = 2; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 2; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
//--------------------------------------------------------
/* 
    *
   ***
  *****
 *******
*********


        int n = 5;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*other step
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//-------------------------------------------------------
/*
* * * * * *

* * * * * * 

* * * * * *

* * * * * *

* * * * * *
           int n = 12; 
            for (int i = 1; i <= n; i++) {
                if(i % 2 == 1){
                for (int j = 1; j <= 6; j++) {
                    System.out.print("* ");
                }
            }
                System.out.println();
        }*/

//------------------------------------------------------
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
//------------------------------------------------------
/* 
1        1
12      21
123    321
1234  4321
1234554321
         int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = n; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }*/

//-------------------------------------------------------------
/* 
*
**
*
**
        int n = 4;
        for (int i = 1; i <= n; i++){
           if (i % 2 == 1)
            System.out.println("*");
            else
            System.out.println("**");
        }*/


    }
}
