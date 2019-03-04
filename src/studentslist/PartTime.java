/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentslist;

/**
 *
 * @author jeswi
 */
public class PartTime {
 
    String name;
    int hours = 20;
    int rate = 14;
    int pay;
    public PartTime(String name)
    {
        this.name = name;
    }
    
    private void setPay(int hours, int rate)
    {
         this.pay = hours*rate;
    }
    
    public int getpay()
    {
        return pay;
    }
    
}
