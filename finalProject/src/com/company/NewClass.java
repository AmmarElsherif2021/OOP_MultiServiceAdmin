package com.company;

public class NewClass {
    static int x=5;
    /*x can be modified(within the class itself)
     but not copied ?
    (private property to the class)
    -value is the final value modified either in obj or class
    -
    */
    int y =5;
    // non-static var can be copied and modified in the object
    //defined within the object.
    void method1(){

    }
    int method2(){
        return 5;
    }
    /*constructor :
    1-is neither void nor return
    2-same naming of class
    3-over loading --> more than one constructor
    4- if you create a constructor you lose default constructor privilage
    5- not static.????????????????
    */

    NewClass(){
    }
    // use 'this'  only if there is no conflict btn local and member variable with the same naming
    //this keyword refers to the class scope.
    NewClass(int x){
        this.x=x;
    }
}
//sheet 4:
