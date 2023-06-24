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
 * Visitor
 * 
 */
public interface Customer {
    double visit(Bike bike);
    double visit(Car car);
    double visit(Van van);
    double getDistance();
    void setDistance(double distance);
}
