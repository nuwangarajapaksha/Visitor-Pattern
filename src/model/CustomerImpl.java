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
 * ConcreteVisitor
 * 
 */
public class CustomerImpl implements Customer {

    private double distance;

    @Override
    public double visit(Bike bike) {
        return bike.getTaxiFee() * distance;
    }

    @Override
    public double visit(Car car) {
        return car.getTaxiFee() * distance;
    }

    @Override
    public double visit(Van van) {
        return van.getTaxiFee() * distance;
    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }
}
