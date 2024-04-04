package N_19CodeSignalTest.areEquallyStrongTests.Tests;

import org.example.N_19CODESIGNAL.Introduccion.AreEquallyStrong;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test1{
    @Test
    public void test1() {
        AreEquallyStrong areEquallyStrong = new AreEquallyStrong();
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;
        assertTrue(areEquallyStrong.solution(yourLeft, yourRight, friendsLeft, friendsRight));
    }
}
