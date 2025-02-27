package sde.arrays3;

public class merge_sort {

    public void func(int[] a) {
        var l = 0;
        var h = a.length;
        sort(l, h, a);
        System.out.println();
    }

    private void sort(int l, int h, int[] a) {
        if (l >= h) {
            return;
        }
        var mid = (h + l) / 2;
        sort(l, mid, a);
        sort(mid + 1, h, a);
        merge(l, mid, h, a);
    }

    private void merge(int low, int mid, int high, int[] a) {
        var tempArr = new int[high - low];
        var k = 0;
        var i = mid;
        var tlow = low;
        while (low < mid && i < high) {
            if (a[low] > a[i]) {
                tempArr[k++] = a[i++];
            } else {
                tempArr[k++] = a[low++];
            }
        }
        for (; i < high; i++) {
            tempArr[k++] = a[i];
        }
        for (; low < mid; low++) {
            tempArr[k++] = a[low];
        }
        k = 0;
        for (; tlow < high; tlow++) {
            a[tlow] = tempArr[k++];
        }
    }

}
