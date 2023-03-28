package com.mycompany.materi_tugas_2;
public class Modifier {
        
   public String name;
   public String nickname;
   
   private int umur,ttl;
   protected String alamat;
   
   
   
   public void setName(String name,String nickname){
       this.name=name;
       this.nickname=nickname;
   }
   public String getName(){
       return this.name+this.nickname;
     
   }
   
   public void setUmur(int umur){
       this.umur=umur;
   }
   public int getUmur(){
       return this.umur;
   }
    public void setTtl(int ttl){
       this.ttl=ttl;
   }
   public int geTtl(){
       return this.ttl;
   }
     
   public void setAlamat(String alamat){
       this.alamat=alamat;
   }
   public String getAlamat(){
       return this.alamat;
   }
}
