public class Quick_Sort_Algorithms {

        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                // 1. التقسيم (Partition): بنلاقي نقطة الارتكاز (Pivot) وبنرتب العناصر الأصغر منها على اليسار والأكبر على اليمين.
                int pivotIndex = partition(arr, low, high);

                // 2. قسّم (Divide): بنطبّق Quick Sort على الجزء اللي على اليسار من Pivot
                quickSort(arr, low, pivotIndex - 1);

                // 3. قسّم (Divide): بنطبّق Quick Sort على الجزء اللي على اليمين من Pivot
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        private static int partition(int[] arr, int low, int high) {
            // بنختار آخر عنصر كـPivot
            int pivot = arr[high];
            // i هو مؤشر للعنصر الأصغر، ومكانه رح يكون الـ Pivot الصحيح بالنهاية
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                // إذا العنصر الحالي (arr[j]) أصغر أو يساوي الـPivot
                if (arr[j] <= pivot) {
                    i++;

                    // بنبدّل arr[i] مع arr[j] (هيك بنحط العناصر الأصغر بالبداية)
                    swap(arr, i, j);
                }
            }

            // بنبدّل الـPivot (اللي هو arr[high]) مع العنصر اللي بعد آخر عنصر صغير (arr[i+1])
            swap(arr, i + 1, high);

            // بنرجع المؤشر النهائي للـPivot
            return i + 1;
        }

        // ميثود لعملية التبديل (Swap)
        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        public static void main(String[] args) {
            int[] data = {7, 2, 1, 6, 8, 5, 3, 4};
            int n = data.length;

            System.out.println("Array before sorting:");
            printArray(data);

            // بنشغل الخوارزمية
            quickSort(data, 0, n - 1);

            System.out.println("\nArray after Quick Sort:");
            printArray(data);
        }

        private static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

