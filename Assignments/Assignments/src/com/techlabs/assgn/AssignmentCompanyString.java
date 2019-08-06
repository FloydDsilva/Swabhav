package com.techlabs.assgn;

class AssignmentCompanyString{
    public static void main(String... args){
        String input="http://www.aurionpro.com?programmer=abc";
        //String input=" ";
        String company="",coder="";
        boolean comp_flag=false,coder_flag=false;
        int i=0;
        while(i<input.length()){
            if(comp_flag==false && input.charAt(i)=='.'){
                comp_flag=true;
                i++;
                if(input.charAt(i)=='.'){
                    comp_flag=false;
                }
            }
            else if(comp_flag==true && input.charAt(i)=='.')
                comp_flag=false;
            if (comp_flag==true) {
                company+=input.charAt(i);
            }
            if(coder_flag==false&&input.charAt(i)=='='){                
                if (input.length()!=(i+1)) {
                    i++;
                    coder_flag=true;
                }
            }
            if (coder_flag==true) {
                coder+=input.charAt(i);
            }
            i++;
        } 
        System.out.println("Input:"+input); 
        System.out.println("Company:"+company);   
        System.out.println("Coder:"+coder);
    }
}