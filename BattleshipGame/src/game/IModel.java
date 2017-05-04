/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author sandr
 */
public interface IModel {
    void setHit(int x, int y);
    void registerObserver();
    void deleteObserver();
}
