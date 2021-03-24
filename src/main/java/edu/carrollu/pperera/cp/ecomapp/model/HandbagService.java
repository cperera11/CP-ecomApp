/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.carrollu.pperera.cp.ecomapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CPere
 */
public class HandbagService {
    
    public List<Handbag> getHandbagList(){
        return Arrays.asList(
        new Handbag (1,"Mark Twain", new Date()),
        new Handbag (2,"stephan King", new Date()),
        new Handbag (3,"George Orwell", new Date())
        );
    }
}
