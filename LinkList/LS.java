package LinkList;

public class LS {
        public static void main(String[] args){
        Lnode m=new Lnode(7);
        LLS t=new LLS();
        LLS t2=new LLS();

        t2.Lcreate(4);
        t.Lcreate(5);
        t.Linsert(m,4);
        //t.Ldt(1);
        t.Lc(t, t2);
        t.show();
        System.out.println(t.Lge(4));
    }
}
class Lnode{
    int data;
    Lnode next;
    Lnode(){}
    Lnode(int data){
        this.data=data;
    }
    public String toString(){
        return "data="+data;
    }
}
class LLS{
    Lnode head=new Lnode();
    //增加空节点
    public void Lcreate(int i){
        Lnode temp;
        for(int j=0;j<i;j++){
            temp=head;
        Lnode node=new Lnode(0);
        while(temp.next!=null){
            temp=temp.next;
        }
            temp.next=node;
    }}
    //插入数据
    public void Linsert(Lnode tp,int local){
        Lnode temp=head;
        Lnode ins;
        if(local>Llength()+1||local<1){
            System.out.println("位置错误");
            return;}
        for(int i=0;i<local-1;i++){
            temp=temp.next;}
        ins=temp.next;
        temp.next=tp;
        tp.next=ins;
    }
    //尾插
    public void Lis(Lnode tp){
        Lnode temp=head;
        for(int i=0;i<Llength();i++){
            temp=temp.next;
        }temp.next=tp;
    }
    //输出链表
    public void show(){
        Lnode temp;
        temp=head.next;
        if(temp==null){
            System.out.println("链表为空");
        }else{
        for(;;){
            if(temp==null) break;
            System.out.print(temp.toString()+"\n");
            temp=temp.next;
        }}
    }
    //检查链表长度
    public int Llength(){
        Lnode temp=head.next;
        int i=0;
        for(;;i++){
            if(temp.next==null){
                ++i;break;}
            temp=temp.next;}
        return i;
    }
    //删除节点
    public void Ldt(int local){
        Lnode temp=head;
        Lnode ins;
        if(local>Llength()||local<1) {
            System.out.println("越界");
            return;}
        for(int i=0;i<local-1;i++){
            temp=temp.next;
        }ins=temp.next.next;
        temp.next=ins;
    }
    //合并链表至l1
    public void Lc(LLS l1,LLS l2){
        Lnode temp1=l1.head;
        if(l1.Llength()==0||l2.Llength()==0){
            System.out.println("一方为空");return;}
        for(int i=0;i<l1.Llength();i++){
            temp1=temp1.next;
        }temp1.next=l2.head.next;
    }
    //getElement
    public int Lge(int local){
        Lnode temp=head;
        if(local>Llength()||local<1){
            System.out.println("爪八");return -1;}
        for(int i=0;i<local;i++){
            temp=temp.next;
        }return temp.data;
    }

}