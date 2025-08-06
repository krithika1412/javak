//calc
import java.util.*;
class Main {
    public static void main(String[] ars) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Simple calculator");
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt(); int result=0;
        System.out.println("Choose operation: +, -, *, /");
        char operation = sc.next().charAt(0);
         switch (operation) {
    case '+':
    result=a+b;
    break;
    case '-':
    result=a-b;
    break;
    case '*':
    result= a*b;
    break;
    case '/':
    if (b!= 0) {
    result = a/b;
    } else {
    System.out.println("cant divide");
                    result = a/b;
                    break;
    }}
    System.out.println(result);

    }
}
    
--------------------------------------------------------------------------------------------------------------------------------------------
Area of rectangle

    class Main {
    public static void main(String[] args) {
  rectangle vi=new rectangle(10,20);

    }
}
class rectangle
{
    int length,breath;
    rectangle(int l,int b)
    {
        length=l;
        breath=b;
        getarea();
    }
   void getarea()
    {
        int area;
        area=length*breath;
        System.out.println(area);
    }
    __________________________________________________________________________________________________________________________________________
 class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

class Main {
    public static void main(String[] args) {
  Dog d=new Dog();
  d.bark();
  d.eat();
    }
}
    ________________________________________________________________________________________________________________________________________________
   multiple inheritence
    
    
    class animal
{
    void sound()
    {
        System.out.print("sound...");
    }
}
class cat extends animal
{
    void meow()
    {
        System.out.print("meow");
    }
}
class dog extends animal
{
    void bark()
    {
        System.out.print("barking");
    }
}
    ________________________________________________________________________________________________________________________________________
    adding three nos

    class main
{
    public static void main(String[] args){
  System.out.println(adder.add(11,11));
  System.out.println(adder.add(11,11,11));
    }}
    class adder
    {
        static int add(int a,int b)
        {
            return a+b;
        }
        static int add(int a,int b,int c)
        {
            return a+b+c;
        }
    }
