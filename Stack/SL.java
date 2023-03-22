package Stack;
import java.util.Scanner;
public class SL {
    public static void main(String[] args){
        SS a1=new SS();
        a1.Inl(4, 10);
        //a1.Push(5);
        a1.Pop();
        a1.show();
    }
}
class Stk{
    int data;
    Stk next;

    Stk(){}
    Stk(int data){
        this.data=data;
    }
    public String toString(){
        return data+"";
    }
}
class SS{
    Stk top=new Stk();
    int size;
    int locate=0;

    //初始化
    public void Inl(int num,int size){
        Scanner op=new Scanner(System.in);
        if(num>0&&size>0&&size>num){
            if(locate==0) {
                Stk ins=new Stk(op.nextInt());
                top.next=ins;
                locate++;
            }
            for(int i=1;i<num;i++){
                Stk temp=new Stk(op.nextInt());
                temp.next=top.next;
                top.next=temp;
                locate++;
        }op.close();
        }else{
            System.out.println("ERROR");}
        }
    //入栈
    public void Push(int t){
        if(locate==0){
            Stk ins=new Stk(t);
            top.next=ins;
            locate++;}
        else if(locate>0){
        Stk temp=new Stk();
        temp.next=top.next;
        top.next=temp;
        temp.data=t;locate++;}
        }
    //出栈
    public void Pop(){
        if(locate>0){
        Stk temp=top.next;
        top.next=temp.next;locate--;}
        else {System.out.println("ERROR");}
    }
    //show
    public void show(){
        if(locate<1) return;
        Stk temp=top.next;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    //清空栈
    public void Ep(){
        top.next=null;
        locate=0;
    }
}