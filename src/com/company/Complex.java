package com.company;

public class Complex {
    public double realPart;
    public double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }
    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }
    public double getImaginaryPart() {return imaginaryPart;}
    public void setImaginaryPart(Double imaginaryPart) {this.imaginaryPart = imaginaryPart;}

    public Complex() {
        Complex temp = new Complex(0.0,0.0);
    }

    public Complex(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex otherNumber){
        Complex temp = new Complex(0.0,0.0);
        temp.realPart = this.realPart+otherNumber.realPart;
        temp.imaginaryPart = this.imaginaryPart+otherNumber.imaginaryPart;
        return temp;
    }

    public Complex subtract(Complex otherNumber){
        Complex temp = new Complex(0.0,0.0);
        temp.realPart = this.realPart-otherNumber.realPart;
        temp.imaginaryPart = this.imaginaryPart-otherNumber.imaginaryPart;
        return temp;
    }

    public Complex multiply(Complex otherNumber){
        Complex temp = new Complex(0.0,0.0);
        temp.realPart = this.realPart*otherNumber.realPart-this.imaginaryPart*otherNumber.imaginaryPart;
        temp.imaginaryPart = this.realPart*otherNumber.imaginaryPart-otherNumber.realPart*this.imaginaryPart;
        return temp;
    }
    public Complex divide(Complex otherNumber){
        Complex temp = new Complex(0.0,0.0);
        temp.realPart = (this.realPart*otherNumber.realPart+this.imaginaryPart*otherNumber.imaginaryPart)-(this.realPart*otherNumber.imaginaryPart+this.imaginaryPart*otherNumber.realPart);
        temp.imaginaryPart = otherNumber.realPart*otherNumber.realPart+otherNumber.imaginaryPart*otherNumber.imaginaryPart;
        return temp;
    }


    public String toString(Complex numBer){
        String sp = "";
        sp = "Phần thực là: + "+numBer.realPart+ "\n" +"Phần ảo là: " + numBer.imaginaryPart;
        return sp;
    }


    }


