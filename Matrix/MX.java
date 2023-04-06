package Matrix;
import java.util.Scanner;
class MX{
    public static void main(String[] args){
        Scanner st=new Scanner(System.in);
        System.out.println("输入稀疏矩阵的长、宽及有效值数");
        int ch=st.nextInt();int kn=st.nextInt();int zh=st.nextInt();
        MG m1=new MG(ch, kn, zh);

        m1.add(1,2,1);m1.add(2,1,1);m1.add(2,4,4);m1.add(3,2,2);m1.add(3,3,3);m1.add(4,4,1);
        
        System.out.println("输入稀疏矩阵的长、宽及有效值数");
        int ch2=st.nextInt();int kn2=st.nextInt();int zh2=st.nextInt();
        MG m2=new MG(ch2, kn2, zh2);
        
        m2.add(1,1,1);m2.add(2,2,1);m2.add(3,2,-2);m2.add(3,4,1);m2.add(4,3,1);
        
        MG m3=m1.Add(m1, m2);

        MN fu=new MN(m3);
        fu.Init();
        fu.PP();
        st.close();
    }
}
class Strt{
    int h;
    int l;
    int val;

    Strt(){}
    Strt(int h,int l,int val){
        this.h=h;
        this.l=l;
        this.val=val;
    }
}

class MG{
    int h,l,t=0;int size=20;
    Strt data[]=new Strt[size];
    
    MG(){}
    MG(int h,int l){
        this.h=h;
        this.l=l;
    }
    MG(int h,int l,int t){
        this.h=h;
        this.l=l;
        size=t;
        data=new Strt[t];
    }

    public int Num(){
        return t;
    }

    public void add(int h,int l,int val){
        if(t>=size||t<0){System.out.println("越界");return;}
        Strt tp=new Strt(h, l, val);
        data[t]=tp;
        t++;}

    public void Print(){
        System.out.println("行\t列\t值");
        for(int i=0;i<t;i++){
            System.out.println(data[i].h+"\t"+data[i].l+"\t"+data[i].val);
        }
    }

    public MG Add(MG m1,MG m2){
        MG m3;
        if(m1.h!=m2.h||m1.l!=m2.l) {System.out.println("八嘎");return null;}
        m3=new MG(m1.h, m1.l,m1.t+m2.t);
        for(int i=0;i<m1.t;i++){
            m3.data[i]=m1.data[i];
        }for(int i=0;i<m2.t;i++){
            m3.data[m1.t+i]=m2.data[i];
        }
    return m3;}
}
class MN{
    int hang,lie;
    MG MA;
    int[][] jz;

    MN(int hang,int lie){
        this.hang=hang;
        this.lie=lie;
        MA=new MG(hang, lie);
        jz=new int[hang][lie];
    }
    MN(MG tpp){
        MA=tpp;
        hang=tpp.h;
        lie=tpp.l;
        jz=new int[hang][lie];
    }

    public void Init(){

        for(int i=0;i<MA.h;i++){
            for(int j=0;j<MA.l;j++){
                jz[i][j]=0;
        }}
        for(int i=0;i<MA.data.length;i++){
            jz[MA.data[i].h-1][MA.data[i].l-1]+=MA.data[i].val;
        }
        }

        public void PP(){
            for(int i=0;i<hang;i++){
                for(int j=0;j<lie;j++){
                    System.out.print(jz[i][j]+"\t");
                }System.out.println();
            }
        }
        
    }