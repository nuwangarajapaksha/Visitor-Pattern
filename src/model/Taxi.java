/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 * 
 * Visitable / Element
 * 
 */
public interface Taxi {
    boolean isBooked();
    double accept(Customer customer);
    void cancel();
}
