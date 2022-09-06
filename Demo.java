//import java.util.*;
class Demo
{
 public static void main(String args[])
 {
/*System.out.println(Thread.currentThread().getName());
}
}*/

Task t=new Task();
t.print();
t.add();
t.disp();
}
}
class Task
{
void print()
 {
   String s1="username";
   String s2="Password";
System.out.println(s1+" "+s2);
 }
void add()
 {
int a=10,b=20;
System.out.println(a+b);
 }
void disp()
 {
Scanner sc=new Scanner(System.in);

int a[]=new int[5];
System.out.println("Enter array elements");
for(int i=0;i<=a.length-1;i++)
{
a[i]=sc.nextInt();
} 
System.out.println("Array elements are");
 try
 {
 for(int i=0;i<=10;i++)
 {
System.out.print(a[i]+" ");
 }
 }
catch(Exception e)
{
System.out.println(e.getMessage());
  }
  }
  }
