package com.akhil.builds;
class Calculator{
    def jenkins

    Calculator(jenkins){
        this.jenkins = jenkins
    }

    // Addition
    def addNos(a,b){
        return a+b;
    }

    // Multiplication
    def mulNos(a,b){
        return a*b;
    }
}