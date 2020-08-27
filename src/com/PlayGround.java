package com;

import com.LeetCodeJack.Problems2.*;
import com.LeetCodeJack.Problems.*;
import com.LeetCodeJack.Problems3.*;

import java.util.*;
public class PlayGround {
    public static void main(String[] args) {
        int[] cells = {1,1,0,1,1,0,1,1};
        P957_M_PrisonCellsAfterNDays tester = new P957_M_PrisonCellsAfterNDays();
        tester.prisonAfterNDays(cells,6);
    }
}
