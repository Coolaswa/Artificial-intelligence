/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.tue.s2id90.group88;

/**
 *
 * @author Michiel
 */
public class Move {
    Piece piece;
    int initialPosition, finalPosition;
    Move(int newPosition, Piece movedPiece){
        piece = movedPiece;
        initialPosition = movedPiece.position;
        finalPosition = newPosition;
    }
    //Add Multiple Moves and Remove Opponent
}
