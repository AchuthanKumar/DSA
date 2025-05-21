package com.data.structures.examples.Algorithms.BinarySearch.Advanced;

import org.springframework.stereotype.Service;

@Service
public class FirstBadVersion {
    int badVersion;

    public int getBadVersion() {
        return badVersion;
    }

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    boolean isBadVersion(int version) {
        if (version >= badVersion) return true;
        else return false;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}
