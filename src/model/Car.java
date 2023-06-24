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
 * ConcreteVisitable / ConcreteElement
 * 
 */
public class Car implements Taxi {

    private double taxiFee;
    private boolean isBooked;

    public Car(double taxiFee) {
        this.taxiFee = taxiFee;
    }

    public double getTaxiFee() {
        return taxiFee;
    }

    public void setTaxiFee(double taxiFee) {
        this.taxiFee = taxiFee;
    }

    @Override
    public boolean isBooked() {
        return isBooked;
    }

    @Override
    public double accept(Customer customer) {
        isBooked = true;
        return customer.visit(this);
    }

    @Override
    public void cancel() {
        isBooked = false;
    }

}
