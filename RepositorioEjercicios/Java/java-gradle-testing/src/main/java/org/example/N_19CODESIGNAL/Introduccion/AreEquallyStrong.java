package org.example.N_19CODESIGNAL.Introduccion;

public class AreEquallyStrong {
    public boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return yourLeft == friendsRight && yourRight  == friendsLeft || yourLeft == friendsLeft  && yourRight == friendsRight;
    }
}
