
package YIĞINLAR;
class eleman{
int icerik;

public eleman(int icerik){
this.icerik=icerik;


}
}
class yigit{
 eleman dizi[]; //eleman türünden bir dizi oluşturduk.
int ust;
int n;
public yigit(int n){
this.n=n;
dizi =new eleman[n];// N KADAR ELEMAN SAYISI OLUŞTURDUK
ust=-1;
}
boolean bosMu(){
if(ust==-1){
return true;
}
else{
return false;
}
}
boolean doluMu(){
return ust==n-1;//listenin dolu olup olmadığını n-1 ile kontrol ediyorum malumdur ki dolu stack'e ekleme yapılamaz!!!

}
void ekle(int icerik){
eleman yeni=new eleman(icerik);
if(doluMu()==false){ //dizi eğer dolu değilse aşağıdaki işlemi yap doluysa if'e girme demek istiyoruz doluluğuda 30.satırda kontrol ettik.
ust++;//üstü bir arttır
dizi[ust]=yeni;//ardından arttırdığın kısma(ust++) eleman ekle.
} 

}
eleman cikar(){
if(bosMu()==false){ //eğer ki yığın boş değilse
ust--;// ustu bir azalttım
return dizi[ust+1];//aldığım elemanı geri dönderdim

}
return null;//eğerki yığıt boş ise geriye null döndersin.

}

eleman top(){// top elemanı çıkarmadan en ustteki elemanı bulmamızı sağlar.
if(!bosMu()) //yığın boş değilse
return dizi[ust];
else return null;//yığıt boşsa geriye null dönder!
}



}

public class yigitlar_diziyle_oluşturma {

    public static void main(String[] args) {
       yigit y=new yigit(15);
        for (int i = 0; i < 15; i++) {
            y.ekle(i);
        }
      
        
        /*
    while(y.bosMu()==false){
        System.out.println(y.cikar().icerik);//elemanları çıkar ve içeriği görüntüle
    
    }
    */
        System.out.println("en ustteki eleman:"+y.top().icerik); 
        
    }
      }
    

