package com.example.sourabh_.set;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;

import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends Activity {

    Random r = new Random();
    int i=r.nextInt(32);

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       WallpaperManager wallpaper1;
       wallpaper1= WallpaperManager.getInstance(getApplicationContext());

       switch (i)
       {
           case 1:
               try{
                   wallpaper1.setResource(R.raw.s1);
               }catch (IOException e){
                   e.printStackTrace();
               }break;

           case 2:
               try{
                   wallpaper1.setResource(R.raw.s2);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 3:
               try{
                   wallpaper1.setResource(R.raw.s3);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 4:
               try{
                   wallpaper1.setResource(R.raw.s4);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 5:
               try{
                   wallpaper1.setResource(R.raw.s5);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 6:
               try{
                   wallpaper1.setResource(R.raw.s6);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 7:
               try{
                   wallpaper1.setResource(R.raw.s7);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 8:
               try{
                   wallpaper1.setResource(R.raw.s8);
               }catch (IOException e){
                   e.printStackTrace();
               }break;

           case 9:
               try{
                   wallpaper1.setResource(R.raw.s9);
               }catch (IOException e){
                   e.printStackTrace();
               }break;

           case 10:
               try{
                   wallpaper1.setResource(R.raw.s10);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 11:
               try{
                   wallpaper1.setResource(R.raw.s11);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 12:
               try{
                   wallpaper1.setResource(R.raw.s12);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 13:
               try{
                   wallpaper1.setResource(R.raw.s13);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 14:
               try{
                   wallpaper1.setResource(R.raw.s14);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 15:
               try{
                   wallpaper1.setResource(R.raw.s15);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 16:
               try{
                   wallpaper1.setResource(R.raw.s16);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 17:
               try{
                   wallpaper1.setResource(R.raw.s17);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 18:
               try{
                   wallpaper1.setResource(R.raw.s18);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 19:
               try{
                   wallpaper1.setResource(R.raw.s19);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 20:
               try{
                   wallpaper1.setResource(R.raw.s20);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 21:
               try{
                   wallpaper1.setResource(R.raw.s21);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 22:
               try{
                   wallpaper1.setResource(R.raw.s22);
               }catch (IOException e){
                   e.printStackTrace();
               }break;

           case 23:
               try{
                   wallpaper1.setResource(R.raw.s23);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 24:
               try{
                   wallpaper1.setResource(R.raw.s24);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 25:
               try{
                   wallpaper1.setResource(R.raw.s25);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 26:
               try{
                   wallpaper1.setResource(R.raw.s26);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 27:
               try{
                   wallpaper1.setResource(R.raw.s27);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 28:
               try{
                   wallpaper1.setResource(R.raw.s28);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 29:
               try{
                   wallpaper1.setResource(R.raw.s29);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 30:
               try{
                   wallpaper1.setResource(R.raw.s30);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 31:
               try{
                   wallpaper1.setResource(R.raw.s31);
               }catch (IOException e){
                   e.printStackTrace();
               }break;
           case 32:
               try{
                   wallpaper1.setResource(R.raw.s32);
               }catch (IOException e){
                   e.printStackTrace();
               }break;

           default:System.out.println("error");
       }
       finish();


    }
}
