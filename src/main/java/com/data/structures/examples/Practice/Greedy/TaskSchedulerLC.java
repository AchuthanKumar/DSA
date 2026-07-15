package com.data.structures.examples.Practice.Greedy;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TaskSchedulerLC {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0, maxFreqCount = 0;

        for (char task : tasks) {
            freqMap.put(task, freqMap.getOrDefault(task, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(task));
        }

        for (int freqVal : freqMap.values()) {
            if (freqVal == maxFreq)
                maxFreqCount++;
        }

        return Math.max(tasks.length, (maxFreq - 1) * (n + 1) + maxFreqCount);
    }
}
