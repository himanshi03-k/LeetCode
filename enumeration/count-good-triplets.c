int absVal(int x) {
    return x < 0 ? -x : x;
}

int countGoodTriplets(int* arr, int arrSize, int a, int b, int c) {
    int goodTriplets = 0;

    for (int i = 0; i < arrSize; ++i) {
        for (int j = i + 1; j < arrSize; ++j) {
            if (absVal(arr[i] - arr[j]) <= a) {
                for (int k = j + 1; k < arrSize; ++k) {
                    if (absVal(arr[j] - arr[k]) <= b &&
                        absVal(arr[i] - arr[k]) <= c) {
                        goodTriplets++;
                    }
                }
            }
        }
    }

    return goodTriplets;
}
