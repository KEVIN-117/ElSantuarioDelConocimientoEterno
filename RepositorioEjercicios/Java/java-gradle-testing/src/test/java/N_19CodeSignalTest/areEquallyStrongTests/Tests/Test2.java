package N_19CodeSignalTest.areEquallyStrongTests.Tests;

import org.example.N_19CODESIGNAL.Introduccion.AreEquallyStrong;
import org.junit.Test;

import static org.junit.Assert.*;


public class Test2{

    @Test
    public void test2() {
        AreEquallyStrong areEquallyStrong = new AreEquallyStrong();
        int yourLeft = 0;
        int yourRight = 10;
        int friendsLeft = 10;
        int friendsRight = 10;
        assertTrue(areEquallyStrong.solution(yourLeft, yourRight, friendsLeft, friendsRight));
    }
}
