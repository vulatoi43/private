package com.example.thanhvu.aprivate;

/**
 * Created by Thanh Vu on 21/01/2017.
 */
public class nhanvien {



        public String HoTen;
        private Integer NamSinh;




        public void Setnamsinh(Integer ns){
            if(ns>=1990){
                this.NamSinh=ns;}
            else{
                this.NamSinh=1990;

            }

        }

        public Integer getTuoi() {
            return NamSinh;
        }
    }


