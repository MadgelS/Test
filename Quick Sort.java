class Main {
    static int[] mass = {3, 7, 8, 5, 9, 1, 4, 10, 2, 6};

    public static void main(String[] args) {

        System.out.println("Начальный: ");
        for (int i = 0; i < mass.length; i++) {  //вывод начального массива
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
        int startIndex = 0;
        int endIndex = mass.length - 1;
        quickSort(startIndex, endIndex);

        System.out.println("Конечнный: ");
        for (int i = 0; i < mass.length; i++) {  //вывод конечного массива
            System.out.print(mass[i] + " ");
        }
    }

    private static void quickSort(int start, int end) {
        if (start >= end)
            return;
        int l = start, r = end;
        int count = l - (l - r) / 2;
        while (l < r) {
            while (l < count && (mass[l] <= mass[count])) {
                l++;
            }
            while (r > count && (mass[count] <= mass[r])) {
                r--;
            }
            if (l < r) {
                int temp = mass[l];
                mass[l] = mass[r];
                mass[r] = temp;
                if (l == count)
                    count = r;
                else if (r == count)
                    count = l;
            }
        }
        quickSort(start, count);
        quickSort(count + 1, end);
    }
}