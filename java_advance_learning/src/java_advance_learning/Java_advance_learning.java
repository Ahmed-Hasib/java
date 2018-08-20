/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_advance_learning;

/**
 *
 * @author Hasib
 */
public class Java_advance_learning {

    /**
     * @param args the command line arguments
     */
    int age;
   public Java_advance_learning(String name){
      System.out.println("Author is "+name);
   }
   public void setAge(int age){
     this.age=age;
   }
   public void ShowAge(){
     System.out.println("Age is :" +age);
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Java_advance_learning obj=new Java_advance_learning("Hasib");
       obj.setAge(24);
       obj.ShowAge();
    }
    
}
