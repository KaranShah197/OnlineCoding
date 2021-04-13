package com.online.leetcode;

import com.online.leetcode.controller.easy.SetMismatch;
import com.online.leetcode.controller.easy.SingleRowKeyboard;
import com.online.leetcode.controller.easy.DistributeCandies;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

//@SpringBootTest
public class JavaEasyTests {

    /**
     * The SingleRowKeyboard
     */
    SingleRowKeyboard srk;
    DistributeCandies dc;
    SetMismatch sm;

    @Before
    public void setUp() throws Exception {
        srk = new SingleRowKeyboard();
        dc = new DistributeCandies();
        sm = new SetMismatch();
    }

    @After
    public void tearDown() throws Exception {
        srk = null;
        dc = null;
        sm = null;
    }

    /**
     * SingleRowKeyBoard tests
     */
    @Test //1
    public void singleRowKeyBoardTests() {
        Assert.assertTrue("1st test case",
                srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba")  == 4);
        Assert.assertTrue("2nd test case",
                srk.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode") == 73);

        assertEquals(srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"), 4, 0);
        assertEquals(srk.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"), 73, 0);
        Assert.assertNotEquals(srk.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"),
                srk.calculateTime("pqrstuvwxyzabcdefghijklmn", "eletcode"));
        Assert.assertNotEquals(srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "abc"),
                srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
    }

    /**
     * DistributeCandies tests
     */
    @Test //2
    public void distributeCandiesTests() {
        Assert.assertTrue("1st test case",
                dc.distributeCandiesMethod(new int[]{1, 1, 2, 2, 3, 3}) == 3);

        assertEquals(dc.distributeCandiesMethod(new int[]{1,1,2,2,3,3}), 3, 0);
        assertEquals(dc.distributeCandiesMethod(new int[]{1,1,2,3}), 2, 0);
        assertEquals(dc.distributeCandiesMethod(new int[]{6,6,6,6}), 1, 0);

        Assert.assertNotEquals(dc.distributeCandiesMethod(new int[]{1,1,2,2,3,3}),
                dc.distributeCandiesMethod(new int[]{1,1,2,3}));
        Assert.assertNotEquals(dc.distributeCandiesMethod(new int[]{1,1,2,3}),
                dc.distributeCandiesMethod(new int[]{1,1,2,2,3,3}));
    }

    /**
     * SetMisMatch tests
     */

    @Test //3
    public void setMisMatchTests() {

        Assert.assertArrayEquals(sm.findErrorNums(new int[]{1,2,2,4}), new int[]{2,3});
        Assert.assertArrayEquals(sm.findErrorNums(new int[]{1,1}), new int[]{1,2});

        assertArrayEquals(sm.findErrorNums(new int[]{1,1}), new int[]{1,2});
    }

}
