public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    
    // Very basic implement of a class
    public int width;
    public int height;
    
    public Rectangle(int wid,int hei){
        this.width=wid;
        this.height=hei;
    }
    
    public int getArea(){
        return this.width*this.height;
    }
}
