package com.ideaspace.customSpring;

/**
 * @author Alexander Dudkin
 */
public class AngryPoliceman implements Policeman {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убью! Вон пошли");
    }
}
